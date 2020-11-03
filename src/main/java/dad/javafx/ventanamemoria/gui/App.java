package dad.javafx.ventanamemoria.gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controller controller;
	
	private void crearConfiguracionInicial(File fichero) throws IOException {
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(fichero));
		String configuracionInicial = "";
		configuracionInicial += "background.red=255\n";
		configuracionInicial += "background.green=255\n";
		configuracionInicial += "background.blue=255\n";
		configuracionInicial += "size.width=320\n";
		configuracionInicial += "size.height=200\n";
		configuracionInicial += "location.x=440\n";
		configuracionInicial += "location.y=244";
		
		bWriter.write(configuracionInicial);
		bWriter.close();
	}
	
	@Override
	public void init() throws Exception {
		String rutaPerfil = System.getProperty("user.home");
		Properties prop = new Properties();
		File fConfig = new File(rutaPerfil + "\\.VentanaConMemoria\\ventana.config");
		
		if (!fConfig.getParentFile().exists() && !fConfig.getParentFile().mkdirs())
			throw new IllegalStateException("No se pudo crear la carpeta .VentanaConMemoria");
		
		if (fConfig.createNewFile()) {
			crearConfiguracionInicial(fConfig);
		}
		
		prop.load(new FileInputStream(fConfig));
		controller = new Controller(prop);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(controller.getView(), 320, 200);
		primaryStage.setTitle("Ventana con memoria");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
