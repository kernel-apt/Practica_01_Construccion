package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LogInController 
{
     @FXML 
     private Label lblUser;
     @FXML 
     private Label lblPasskey;
     @FXML 
     private Label lblTitle;
     
     @FXML 
     private TextField txtUser;
     @FXML 
     private TextField txtPasskey;
     
     @FXML 
     private Button btnLogin;

    @FXML
    public void GetIn()
    {
          if (txtPasskey.getText().equals("") && txtUser.getText().equals(""))
          {
               Alert alert = new Alert(Alert.AlertType.ERROR);
               alert.setTitle("Error");
               alert.setHeaderText("Campos vacíos");
               alert.setContentText("Por favor, rellene todos los campos.");
               alert.showAndWait();

               txtPasskey.setText("");
               txtUser.setText("");
               txtUser.requestFocus();

               return;
          }
          
          if(txtUser.getText().equals(App.user) && txtPasskey.getText().equals(App.passkey))
          {
               try 
               {
                    App.setRoot("home", "Bienvenido " + App.user + "!", 950.0, 1150.0);
               } 
               catch (IOException e) 
               {
                    e.printStackTrace();
               }
          }
    }
}
