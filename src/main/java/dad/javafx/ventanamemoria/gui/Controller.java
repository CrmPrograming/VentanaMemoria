package dad.javafx.ventanamemoria.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {
	
	// view
	@FXML
	private GridPane view;
	
	@FXML
	private Slider sRed;
	
	@FXML
	private Slider sGreen;
	
	@FXML
	private Slider sBlue;
	
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public GridPane getView() {
		return view;
	}

	public void setView(GridPane view) {
		this.view = view;
	}

}
