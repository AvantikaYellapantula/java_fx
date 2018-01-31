import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class embedded_layout extends Application{

	Stage window;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window=arg0;
		window.setTitle("Embedded Layout");
		
		HBox topMenu = new HBox();
		Button buttonA = new Button("File");
		Button buttonB = new Button("Edit");
		Button buttonC = new Button("View");
		topMenu.getChildren().addAll(buttonA,buttonB,buttonC);
		
		VBox leftMenu = new VBox();
		Button buttonD = new Button("Source");
		Button buttonE = new Button("Run");
		Button buttonF = new Button("Help");
		leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		
		
		
		
		//StackPane layout = new StackPane(); -----> not neccessary anymore
		Scene scene = new Scene(borderPane,300,250);
		window.setScene(scene);
		window.show();
		
		
	}

}
