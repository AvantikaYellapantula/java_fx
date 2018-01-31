import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class closePgm extends Application{

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
		window.setTitle("Title");
		
		window.setOnCloseRequest(e-> {
			e.consume();
			closeProgram();
			});
		
		button = new Button("Close Program");
		button.setOnAction(e ->closeProgram());
		
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}

	
	private void closeProgram() {
		
		Boolean answer = ConfirmBox.display("File Save Alert", "Are you sure you want to close without saving your file?");
		if(answer)
			window.close();

	}
	
}//ends closePgm class
