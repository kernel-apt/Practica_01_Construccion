package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Item;

/**
 * controlador de la vista home
 * maneja logica de la vista home
 */
public class HomeController implements Initializable 
{
    @FXML private TableView<Item> tableViewItems;

    @FXML private TableColumn<String, Item> colItemName;
    @FXML private TableColumn<Double, Item> colPrice;
    @FXML private TableColumn<Integer, Item> colQuantity;

    public static ObservableList<Item> observableList;

    /**
     * inicializa los datos de la tabla
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        colItemName.setCellValueFactory
        (
            new PropertyValueFactory<String, Item>("item")
        );
        
        colPrice.setCellValueFactory
        (
            new PropertyValueFactory<Double, Item>("price")
        );
        
        colQuantity.setCellValueFactory
        (
            new PropertyValueFactory<Integer, Item>("quantity")
        );

        observableList = FXCollections.observableArrayList();
        
        tableViewItems.setItems(observableList);
        
        tableViewItems.setColumnResizePolicy
        (
            TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN
        );

        observableList.addAll
        (
            new Item("Manzana", 0.5, 10),
            new Item("Pera", 0.8, 5),
            new Item("Plátano", 0.3, 20)
        );
    }

    @FXML
    public void GoToProfile() throws IOException
    {
        App.setRoot("profile", "Perfil de " + App.user, 500.0, 450.0);
    }
    
    @FXML
    public void LogOut() throws IOException
    {
        App.setRoot("login", "Bienvenido!", 480.0, 526.0);
    }
}