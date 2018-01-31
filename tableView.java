import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tableView extends Application{

	Stage window;
	TableView<Product> table;
	//3 inputs
	TextField nameInput, priceInput, quantityInput;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window=arg0;
		window.setTitle("Table View");
		
		//Name column
		//remember, at least 1 column for each table
		TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		priceInput = new TextField();
		priceInput.setPromptText("Price");
		//priceInput.setMinWidth(100);
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		//quantityInput.setMinWidth(100);
		
		Button addButton = new Button("Add");
		Button delButton = new Button("Delete");
		
		//need to make hbox for layout
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		hbox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,delButton);
		
		
		addButton.setOnAction(e ->{
			addButtonClicked();
		});
		
		delButton.setOnAction(e ->{
			delButtonClicked();
		});
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table,hbox);
		
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
		
	}

	//delete button clicked
	private void delButtonClicked() {
		ObservableList<Product> productSelected, allProducts;
		allProducts = table.getItems();
		//gets all the items in the table
		productSelected = table.getSelectionModel().getSelectedItems();
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);		
		productSelected.forEach(allProducts::remove);	
	}
	
	//Add Button Clicked
	private void addButtonClicked() {
		
		Product product = new Product();
		//using constructor to set stuff manually
		product.setName(nameInput.getText());
		//check whether is double
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		
		//add product;
		table.getItems().add(product);
		//clear all the input fields;
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
	}
	
	private void priceCheck() {
		try {
			double p_set = Double.parseDouble(priceInput.getText());
		}catch(NumberFormatException e){}
		AlertBox.display("Alert", "Error: Not a usable price");
		priceInput.clear();
		
	}
	
	private void qCheck() {
		try {
			int q_set = Integer.parseInt(quantityInput.getText());
		}catch(NumberFormatException e){}
		AlertBox.display("Alert", "Error: Not a usable quantity");
		quantityInput.clear();
		
	}
	
	
	
	//gets all of the products
	private ObservableList<Product> getProduct(){
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Galaxy s6", 659.99,25));
		products.add(new Product("Iphone 6s", 543.56,25));
		products.add(new Product("Samsung Edge", 699.99,55));
		products.add(new Product("Google Pixel 2", 345.75,33));
		products.add(new Product("Iphone 10", 899.99,45));
	
		return products;
	
	}








}
