module com.example.cryptopricewatcher {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cryptopricewatcher to javafx.fxml;
    exports com.example.cryptopricewatcher;
}