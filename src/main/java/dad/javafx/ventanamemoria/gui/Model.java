package dad.javafx.ventanamemoria.gui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Model {
	private IntegerProperty red = new SimpleIntegerProperty();
	private IntegerProperty green = new SimpleIntegerProperty();
	private IntegerProperty blue = new SimpleIntegerProperty();
	private DoubleProperty width = new SimpleDoubleProperty();
	private DoubleProperty height = new SimpleDoubleProperty();
	private IntegerProperty locationX = new SimpleIntegerProperty();
	private IntegerProperty locationY = new SimpleIntegerProperty();
	
	
	public final IntegerProperty redProperty() {
		return this.red;
	}
	
	public final int getRed() {
		return this.redProperty().get();
	}
	
	public final void setRed(final int red) {
		this.redProperty().set(red);
	}
	
	public final IntegerProperty greenProperty() {
		return this.green;
	}
	
	public final int getGreen() {
		return this.greenProperty().get();
	}
	
	public final void setGreen(final int green) {
		this.greenProperty().set(green);
	}
	
	public final IntegerProperty blueProperty() {
		return this.blue;
	}
	
	public final int getBlue() {
		return this.blueProperty().get();
	}
	
	public final void setBlue(final int blue) {
		this.blueProperty().set(blue);
	}

	public final DoubleProperty widthProperty() {
		return this.width;
	}
	

	public final double getWidth() {
		return this.widthProperty().get();
	}
	

	public final void setWidth(final double width) {
		this.widthProperty().set(width);
	}
	

	public final DoubleProperty heightProperty() {
		return this.height;
	}
	

	public final double getHeight() {
		return this.heightProperty().get();
	}
	

	public final void setHeight(final double height) {
		this.heightProperty().set(height);
	}

	public final IntegerProperty locationXProperty() {
		return this.locationX;
	}
	

	public final int getLocationX() {
		return this.locationXProperty().get();
	}
	

	public final void setLocationX(final int locationX) {
		this.locationXProperty().set(locationX);
	}
	

	public final IntegerProperty locationYProperty() {
		return this.locationY;
	}
	

	public final int getLocationY() {
		return this.locationYProperty().get();
	}
	

	public final void setLocationY(final int locationY) {
		this.locationYProperty().set(locationY);
	}
	
}
