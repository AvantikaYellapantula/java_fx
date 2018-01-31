import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

public class list_view extends Application{

	Stage window;
	Button button;
	Scene scene;
	ListView<String> listView;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window=arg0;
		window.setTitle("List View");
		button = new Button("Submit");
		
		listView = new ListView();
		listView.getItems().addAll(
				"Apple",
				"Samsung",
				"HTC", 
				"Google",
				"OnePlus"
				);
		//by default you'd only be able to select one at a time. What if you wanted to select >1?
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(listView,button);
		
		button.setOnAction(e ->{
			getMovie();
		});
		
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}

	private void getMovie() {
		String message = "User selected the following: ";
		ObservableList<String> movies;
		
		movies = listView.getSelectionModel().getSelectedItems();
		System.out.println(message);
		for(String m: movies) {
			System.out.print(m+"; ");
		}
	
		System.out.println();
	}


}
