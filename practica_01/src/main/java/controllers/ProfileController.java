package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ProfileController implements Initializable
{
     @FXML private Pane pane;

     @FXML private Label lblUserName;
     @FXML private Label lblEmail;
     
     @FXML  private ImageView imageViewUser;

     @FXML  private Button btnGoHome;

     @Override
     public void initialize(URL location, ResourceBundle resources) 
     {
          lblUserName.setText(App.userName);
          lblEmail.setText(App.email);
     }

     @FXML
     public void GoHome() throws Exception
     {
          App.setRoot("home", "Bienvenido " + App.user, 995.0, 1150.0);
     }
}