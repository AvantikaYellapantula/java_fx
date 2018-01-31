import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public  class Main extends Application{

	Stage window;//instead of arg0 or primaryStage
	Scene scene1, scene2;
	
	
	public static void main(String[] args) {
	launch(args);
	
	
	}

	@Override
	public void start(Stage arg0) throws Exception {
		window = arg0;
		//start scene 1
		
		Label label1 = new Label("Welcome to the first scene!");
		Button button1 = new Button("Go to Scene 2:");
		//set action for it
		button1.setOnAction(e -> window.setScene(scene2));

		//Layout 1 - children are laid out in a vertical column, using VBox
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		
		scene1 = new Scene(layout1, 300,200);
		
		//end of scene 1
		
		//start scene 2
		Button button2 = new Button("Return to Scene 1:");
		//set action for it
		button2.setOnAction(e -> window.setScene(scene1));
		
		
		//Layout 2 - StackPane, center it!
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2); //note that we're not using addAll, because we don't need a label
		//set scene
		
		scene2 = new Scene(layout2, 600,300);
		
		//Now the only thing left is:
		//how does the window know which scene to display first?
		
		window.setScene(scene1);
		window.setTitle("Scene Switcher");
		window.show();
		}



}//end Main Class
