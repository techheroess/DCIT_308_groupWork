module com.example.group_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group_assignment to javafx.fxml;
    exports com.example.group_assignment;
}