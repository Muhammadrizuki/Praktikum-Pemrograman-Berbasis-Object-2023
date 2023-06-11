module com.example.praktikum_9 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.praktikum_9 to javafx.fxml;
    exports com.example.praktikum_9;
}