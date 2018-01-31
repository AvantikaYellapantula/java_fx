import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


import javafx.stage.Stage;

public class gridPane extends Application{
	
	Stage window;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window = arg0;
		window.setTitle("Grid Pane");
		
		
		GridPane grid = new GridPane();
		//set padding for scene/stage
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(8);
		
/*With this what we're going to do is create a little login box with USid and Pswd boxes with appropriate spacing*/
		
		//name Label
		Label nameLabel = new Label("Username or Email:");
		//where do we want to add this item?
		GridPane.setConstraints(nameLabel,0,0);
		//since comps start at 0, if we want top left position, we do the 0,0 position
		
		//name input
		TextField nameInput = new TextField("Yello");
		GridPane.setConstraints(nameInput,1,0);
		
		
		Label pswdLabel = new Label("Password:");
		//where do we want to add this item?
		GridPane.setConstraints(pswdLabel,0,1);
		//since comps start at 0, if we want top left position, we do the 0,0 position
		
		//name input
		TextField pswdInput = new TextField();
		pswdInput.setPromptText("password, bud");
		GridPane.setConstraints(pswdInput,1,1);
		
		
		Button buttonLogin = new Button("Login");
		GridPane.setConstraints(buttonLogin,2,3);
		
		grid.getChildren().addAll(nameLabel,nameInput,pswdLabel,pswdInput,buttonLogin);
	
		Scene scene = new Scene(grid,500,300);
		window.setScene(scene);
		window.show();
	}

}
