module com.example.cryptopricewatcher {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;

    opens com.example.cryptopricewatcher to javafx.fxml, com.google.gson;
    exports com.example.cryptopricewatcher;
}