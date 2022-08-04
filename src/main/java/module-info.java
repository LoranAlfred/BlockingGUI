module com.example.blockinggui {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.blockinggui;
    exports com.example.blockinggui.logic;
    opens com.example.blockinggui to javafx.fxml;
    opens com.example.blockinggui.logic to javafx.fxml;
}