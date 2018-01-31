import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class validate_input extends Application{
	
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
		window.setTitle("Validate Input");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(8);
		
		//Form Label
		Label form_label = new Label("Type in your age:");
		grid.setConstraints(form_label,0,0);
		//Form
		TextField form = new TextField();
		form.setPromptText("Form");
		grid.setConstraints(form,1,0);
		
		button = new Button("Click");
		button.setOnAction( e ->{
			//System.out.println(form.getText());
			isInt(form,form.getText());
			
		});
		
		
		grid.setConstraints(button,1,1);
	
		grid.getChildren().addAll(form_label,form,button);
		
		Scene scene = new Scene(grid,300,250);
		window.setScene(scene);
		window.show();
	}
	
	
	private boolean isInt(TextField input, String message) {
		//using try & catch, number form exception
		try{
			int age = Integer.parseInt(input.getText());
			System.out.println("User is "+ age +" years of age");
			return true;
		}catch(NumberFormatException e){}
		System.out.println("Error: '"+message+"' is not an integer");
		return false;
	}

}
