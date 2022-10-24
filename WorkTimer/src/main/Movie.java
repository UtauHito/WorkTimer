package main;
import java.awt.Desktop;
import java.net.URI;
public class Movie {
	//メンバー変数
	String url;
	//コンストラクター
	public Movie(String url) {
		this.url=url;
	}
	
	public void run() {
		Desktop desktop= Desktop.getDesktop();
		try {
			URI uri = new URI(url);
			desktop.browse(uri);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
