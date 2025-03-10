module com.example.csvlabseghezzi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csvlabseghezzi to javafx.fxml;
    exports com.example.csvlabseghezzi;
}