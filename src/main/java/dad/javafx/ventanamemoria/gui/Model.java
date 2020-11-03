package dad.javafx.ventanamemoria.gui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Model {
	private IntegerProperty red = new SimpleIntegerProperty();
	private IntegerProperty green = new SimpleIntegerProperty();
	private IntegerProperty blue = new SimpleIntegerProperty();
	private IntegerProperty width = new SimpleIntegerProperty();
	private IntegerProperty height = new SimpleIntegerProperty();
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
	
	public final IntegerProperty widthProperty() {
		return this.width;
	}
	
	public final int getWidth() {
		return this.widthProperty().get();
	}
	
	public final void setWidth(final int width) {
		this.widthProperty().set(width);
	}
	
	public final IntegerProperty heightProperty() {
		return this.height;
	}
	
	public final int getHeight() {
		return this.heightProperty().get();
	}
	
	public final void setHeight(final int height) {
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

	@Override
	public String toString() {
		return "Model [red=" + red + ", green=" + green + ", blue=" + blue + ", width=" + width + ", height=" + height
				+ ", locationX=" + locationX + ", locationY=" + locationY + "]";
	}
}
