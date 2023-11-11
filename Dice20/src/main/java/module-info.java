module example.com.dice20 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens example.com.dice20 to javafx.fxml;
    exports example.com.dice20;
}