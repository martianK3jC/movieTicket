module com.application.movieticket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.movieticket to javafx.fxml;
    exports com.application.movieticket;
}