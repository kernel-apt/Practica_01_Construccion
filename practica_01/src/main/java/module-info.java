module controllers 
{
    requires transitive javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.base;
    
    opens controllers to javafx.fxml;
    exports controllers;

    opens models to javafx.base;
    exports models;
}
