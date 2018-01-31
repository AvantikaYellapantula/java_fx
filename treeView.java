import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class treeView extends Application{

	
	Stage window;
	//Tree
	TreeView<String> tree;
			
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window=arg0;
		window.setTitle("Tree View");
		
		TreeItem<String> root, CS, Econ;
		//set up root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		//CS Branch
		CS = makeBranch("CS",root);
		makeBranch("Java",CS);
		makeBranch("Python",CS);
		makeBranch("R",CS);
		Econ = makeBranch("Econ",root);
		makeBranch("Micro",Econ);
		makeBranch("Macro",Econ);
		makeBranch("Fed",Econ);
		//Econ Branch
		
		
		//Create Tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		
		
		//Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout, 300,200);
		window.setScene(scene);
		window.show();
		
	}

	public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
		
		TreeItem<String> item = new TreeItem<String>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}







}
