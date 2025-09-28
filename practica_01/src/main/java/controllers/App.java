package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application 
{
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException 
    {
        scene = new Scene(loadFXML("login"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml, String title, Double height, Double width) throws IOException 
    {
        ((Stage) scene.getWindow()).setTitle(title);
        scene.getWindow().setHeight(height);
        scene.getWindow().setWidth(width);
        scene.setRoot(loadFXML(fxml));
    }
    
    public static void setRoot(String fxml, String title) throws IOException 
    {
        scene.setRoot(loadFXML(fxml));
    }    
    
    public static void setRoot(String fxml) throws IOException 
    {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}