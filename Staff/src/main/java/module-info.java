module example.com.dice20 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens example.com.staff to javafx.fxml;
    exports example.com.staff;
}