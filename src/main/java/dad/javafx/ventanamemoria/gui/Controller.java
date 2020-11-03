package dad.javafx.ventanamemoria.gui;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
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
	
	// model
	private Model model = new Model();
	
	public Controller(Properties prop) throws IOException {
		model.setRed(Integer.valueOf((String) prop.get("background.red")));
		model.setGreen(Integer.valueOf((String) prop.get("background.green")));
		model.setBlue(Integer.valueOf((String) prop.get("background.blue")));
		model.setWidth(Integer.valueOf((String) prop.get("size.width")));
		model.setHeight(Integer.valueOf((String) prop.get("size.height")));
		model.setLocationX(Integer.valueOf((String) prop.get("location.x")));
		model.setLocationY(Integer.valueOf((String) prop.get("location.y")));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(sRed.valueProperty(), model.redProperty());
		Bindings.bindBidirectional(sGreen.valueProperty(), model.greenProperty());
		Bindings.bindBidirectional(sBlue.valueProperty(), model.blueProperty());
		
		sRed.valueProperty().addListener(e -> onSlideValueChange(e));
		sGreen.valueProperty().addListener(e -> onSlideValueChange(e));
		sBlue.valueProperty().addListener(e -> onSlideValueChange(e));
		
		view.setStyle("-fx-background-color: rgb(" + model.getRed() + "," + model.getGreen() + "," + model.getBlue() + ");");
	}
	
	public void onSlideValueChange(Observable e) {
		view.setStyle("-fx-background-color: rgb(" + model.getRed() + "," + model.getGreen() + "," + model.getBlue() + ");");
	}
	
	public GridPane getView() {
		return view;
	}

	public void setView(GridPane view) {
		this.view = view;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}
