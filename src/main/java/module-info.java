module com.employeemanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.employeemanagement to javafx.fxml;
    exports com.employeemanagement;
}