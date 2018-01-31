import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class menu_eg extends Application{
	
	Stage window;
	BorderPane layout;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window = arg0;
		window.setTitle("Menu Example");
		
		//step 1: create menu
		Menu fileMenu = new Menu("_File");
		
		//a menu item
		MenuItem newFile = new MenuItem("New File...");
		newFile.setOnAction(e -> {
			AlertBox.display("Alert", "You want to Create a new file!");;
		});
		fileMenu.getItems().add(newFile);
		//menu items
		fileMenu.getItems().add(new MenuItem("New..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Export..."));
		fileMenu.getItems().add(new MenuItem("Import..."));


		
		Menu editMenu = new Menu("_Edit");
		editMenu.getItems().add(new MenuItem("Modify"));
		editMenu.getItems().add(new MenuItem("Delete"));
		editMenu.getItems().add(new MenuItem("Create"));

		
		Menu viewMenu = new Menu("_View");
		viewMenu.getItems().add(new MenuItem("Full Screen"));
		viewMenu.getItems().add(new MenuItem("Exit"));
		viewMenu.getItems().add(new SeparatorMenuItem());
		//grey out a menu item
		MenuItem greyPec = new MenuItem("Pecadillo");
		greyPec.setDisable(true);
		viewMenu.getItems().add(greyPec);

		
		//need to add it to a menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu,editMenu,viewMenu);		
		
		
		
		
		
		layout = new BorderPane();
		layout.setTop(menuBar);
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
	}

}
