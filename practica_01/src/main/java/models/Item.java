package models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * modelo de datos para los items que mostrara tableview
 */
public class Item 
{
     private SimpleStringProperty item;
     private SimpleDoubleProperty price;
     private SimpleIntegerProperty quantity;

     public String getItem() 
     {
          return item.getValue();
     }

     public Double getPrice() 
     {
          return price.getValue();
     }

     public Integer getQuantity() 
     {
          return quantity.getValue();
     }

     public void setItem(String item) 
     {
          this.item.setValue(item);
     }

     public void setPrice(double price) 
     {
          this.price.set(price);
     }

     public void setQuantity(int quantity) 
     {
          this.quantity.set(quantity);
     }

     public Item(String item, double price, int quantity) 
     {
          this.item = new SimpleStringProperty(item);
          this.price = new SimpleDoubleProperty(price);
          this.quantity = new SimpleIntegerProperty(quantity);
     }

     public String toString() 
     {
          return "Item [item=" + item + ", price=" + price + ", quantity=" + quantity + "]";
     }
}