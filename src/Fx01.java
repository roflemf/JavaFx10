import javafx.application.Application;
import javafx.stage.Stage;

public class Fx01 extends Application {//Application 추상클래스를 상속받는다.

	@Override
	public void start(Stage stage) throws Exception {
		
		stage.show(); //FX 윈도우 보여주기
	}
	
	public static void main(String[] args) {
		launch(args); //start()메서드 호출
		
		
	}

}
