package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import models.Item;

public class DetailController implements Initializable
{
     @FXML private Pane pane;    

     @FXML private Label lblTexto;

     @FXML @Override
     public void initialize(URL location, ResourceBundle resources) 
     {
          int position = HomeController.position;
          Item item = HomeController.observableList.get(position);
          lblTexto.setText(item.toString());
     }

     public void GetBack() throws Exception
     {
          App.setRoot("home", "Bienvenido " + App.user, 995.0, 1150.0);
     }
}
