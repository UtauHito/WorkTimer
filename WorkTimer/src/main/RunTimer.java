package main;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("URLを入力してください");
		String url=sc.nextLine(); //再生したい動画のURL
		System.out.println("時間（秒）を入力してください");
		int milisec=sc.nextInt(); //何分タイマーにしたいか
		int minute=milisec*1000;
		sc.close();
				
		//実行タスクを生成
		TimerTask task = new TimerTask() {
			public void run() {
				Movie movie = new Movie(url);
				movie.run();
			}
		};
		Timer timer = new Timer();
		timer.schedule(task,minute);

	}

}
