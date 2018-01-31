import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class comboBox extends Application{

	Stage window;
	Button button;
	Scene scene;
	ComboBox<String> comboBox;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window=arg0;
		window.setTitle("Combo Box");
		button = new Button("Submit");

		comboBox = new ComboBox();
		comboBox.getItems().addAll(
				"Good Will Hunting",
				"Thor: Ragnarok",
				"Bahubali"
				);
		//set own prompt text
		comboBox.setPromptText("Choose Movie");
		
		//type in own text
		comboBox.setEditable(true);
		
		//combo on set action
		comboBox.setOnAction(e ->{
			System.out.println("User Selected: "+comboBox.getValue()+".");
			
		});
		
		button.setOnAction(e ->{
			
			printMovies();
			
		});
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(comboBox,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
		
		
	}
	
	private void printMovies() {
		
		System.out.println("User Selected: "+comboBox.getValue());
	}

}
