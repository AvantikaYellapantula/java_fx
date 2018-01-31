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

public class AlertBox {

	public static void display(String title, String message) {
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		/*
		 * This functionality blocks user input with other windows until the alert at hand is taken care of
		 * */
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,closeButton);
		layout.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		
		window.showAndWait();
	}
	
}