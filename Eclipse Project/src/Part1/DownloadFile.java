package Part1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

public class DownloadFile extends Command {
	
	String url;
	String output;
	
	public DownloadFile(List<String> params) {
		super(params);
		
		if(super.result && params.size() == 3){
			url = params.get(1);
			output = params.get(2);
		}
		else super.result = false;
	}

	@Override
	public void run() {
		if(super.result){
			try{
				URL u = new URL(url);
				BufferedImage img = ImageIO.read(u);
				
				File file = new File(output);
				
				ImageIO.write(img,  "jpg", file);
				
			}
			catch(IOException e){
				this.result = false;
			}
		}
	}

}
