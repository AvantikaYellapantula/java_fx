import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class choiceBox2 extends Application{

	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window = arg0;
		window.setTitle("Choice Box");
		button = new Button("Choose your preferred language");
		
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		
		//items in dropdown(choiceBox)
		
		
		choiceBox.getItems().add("Java");
		choiceBox.getItems().add("C");
		choiceBox.getItems().addAll("C++","Python","R");
		//set default val
		choiceBox.setValue("Java");
		
//Listen for selection changes
		choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> {
			
			System.out.println(newValue);
		} );
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		layout.getChildren().addAll(choiceBox,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}



}
