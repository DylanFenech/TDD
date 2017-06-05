package Part1;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail extends Command {
	
	String from, to, subject, body;
	
	public SendEmail(List<String> params){
		super(params);
		
		if(super.result && params.size() == 5){
			from = params.get(1);
			to = params.get(2);
			subject = params.get(3);
			body = params.get(4);			
		}
		else super.result = false;
	}
	
	static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;
	
	@Override
	public void run(){
		if(super.result){
			final String username = "iamnottestedbutdriven";
			final String password = "Test12345";
			
			try{
				// Step1
				mailServerProperties = System.getProperties();
				mailServerProperties.put("mail.smtp.port", "587");
				mailServerProperties.put("mail.smtp.auth", "true");
				mailServerProperties.put("mail.smtp.starttls.enable", "true");

		 

				getMailSession = Session.getDefaultInstance(mailServerProperties, null);
				generateMailMessage = new MimeMessage(getMailSession);
				generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				generateMailMessage.setSubject(subject);
				
				String emailBody = body;
				generateMailMessage.setContent(emailBody, "text/html");
		 

				Transport transport = getMailSession.getTransport("smtp");
		 
				transport.connect("smtp.gmail.com", username, password);
				transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
				transport.close();
				
			} catch (AddressException e) {
				this.result = false;
			} catch (MessagingException e){
				this.result = false;
			}
			
		}
	}

}
