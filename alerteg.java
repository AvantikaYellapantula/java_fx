import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class alerteg extends Application{

	Stage window;
	Button button;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window = arg0;
		window.setTitle("AlertMaker");
		
		button = new Button("Click");
		button.setOnAction(e -> AlertBox.display("Alert_Hello", "Hello World from an Alert Box"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,300,300);
		window.setScene(scene);
		window.show();
	}

}//ends alerteg class
