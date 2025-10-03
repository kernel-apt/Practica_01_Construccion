package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import models.Item;

public class DetailController implements Initializable
{
     @FXML private Pane pane;

     @FXML private Label lblItemName;
     @FXML private Label lblPieces;
     @FXML private Label lblPrice;
     @FXML private Label lblTotal;

     @FXML private ImageView imageViewFruit;
     @FXML private Image image;

     @Override
     public void initialize(URL location, ResourceBundle resources) 
     {
          int position = HomeController.position;
          Item item = HomeController.observableList.get(position);

          image = new Image
          (
               getClass().getResource
               (
                    "/icon/" + item.getItem().toLowerCase().trim()  + ".png"
               ).toExternalForm()
          );

          imageViewFruit.setImage(image);

          lblItemName.setText(item.getItem());
          lblPieces.setText(String.valueOf(item.getQuantity()));
          lblPrice.setText(String.valueOf(item.getPrice()));
          
          lblTotal.setText(String.valueOf(item.getPrice() * item.getQuantity()));
     }

     public void GetBack() throws Exception
     {
          App.setRoot
          (
               "home", 
               "Bienvenido " + App.user, 
               995.0, 
               1150.0
          );
     }
}
