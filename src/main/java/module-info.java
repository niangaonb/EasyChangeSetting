module com.niangaoa.easychangesetting {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.niangaoa.easychangesetting to javafx.fxml;
    exports com.niangaoa.easychangesetting;
}