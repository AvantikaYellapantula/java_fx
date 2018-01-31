import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class checkBox extends Application{

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
		window.setTitle("Check Box");
		
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(8);
		
		
		
		
		//Checkboxes
		Label protein = new Label("Protein:");
		grid.setConstraints(protein,0,0);
		CheckBox box1 = new CheckBox("Tofu");
		box1.setSelected(true);
		grid.setConstraints(box1,0,1);
		CheckBox box2 = new CheckBox("Moong");
		grid.setConstraints(box2,0,2);
		CheckBox box3 = new CheckBox("Veggie Patty");
		grid.setConstraints(box3,0,3);
		
		Label greens = new Label("Greens:");
		grid.setConstraints(greens,0,4);
		CheckBox box4 = new CheckBox("Iceberg Lettuce");
		box4.setSelected(true);
		grid.setConstraints(box4,0,5);
		CheckBox box5 = new CheckBox("Romain Lettuce");
		grid.setConstraints(box5,0,6);
		CheckBox box6 = new CheckBox("Baby Spinach");
		grid.setConstraints(box6,0,7);
		
		Label bread = new Label("Bread:");
		grid.setConstraints(bread,0,8);
		CheckBox box7 = new CheckBox("Wheat");
		box7.setSelected(true);
		grid.setConstraints(box7,0,9);
		CheckBox box8 = new CheckBox("White");
		grid.setConstraints(box8,0,10);
		CheckBox box9 = new CheckBox("Italian");
		grid.setConstraints(box9,0,11);
		
		Label specifications = new Label("Specifications:");
		grid.setConstraints(specifications,0,12);
		CheckBox box10 = new CheckBox("Cheese");
		box10.setSelected(true);
		grid.setConstraints(box10,0,13);
		CheckBox box11 = new CheckBox("Toasted");
		grid.setConstraints(box11,0,14);
		
		//button
		button = new Button("Order");
		button.setOnAction(e ->{
			handleOptions(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,box11);
		});
		grid.setConstraints(button,0,15);
		
		//StackPane layout = new StackPane();
		grid.getChildren().addAll(button,protein,box1,box2,box3,greens,box4,box5,box6,bread,box7,box8,box9,specifications,box10,box11);
		
		Scene scene = new Scene(grid,300,450);
		window.setScene(scene);
		window.show();
		
	}
	
	//handle checkbox options
	private void handleOptions(CheckBox box1,CheckBox box2,CheckBox box3,CheckBox box4,CheckBox
			box5,CheckBox box6,CheckBox box7,CheckBox box8,CheckBox box9,CheckBox box10,CheckBox box11) {
		
		String message = "User Ordered: ";
		
		if(box1.isSelected())
			message+= "Tofu,";
		
		if(box2.isSelected())
			message+= "Moong,";
		
		if(box3.isSelected())
			message+= "Veggie Patty,";
		
		if(box4.isSelected())
			message+= "Iceberg Lettuce,";
		
		if(box5.isSelected())
			message+= "Romain Lettuce,";
		
		if(box6.isSelected())
			message+= "Baby Spinach,";
		
		if(box7.isSelected())
			message+= "Wheat,";
		
		if(box8.isSelected())
			message+= "White,";
		
		if(box9.isSelected())
			message+= "Italian,";
		
		if(box10.isSelected())
			message+= "Cheese";
		
		if(box11.isSelected())
			message+= "Toasted";
	
		
		System.out.println(message+" Sandwich");
	}

	
}
