package com.niangaoa.easychangesetting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ECSApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ECSApplication.class.getResource("fxml/ECSFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("EasyChangeSitting");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image(String.valueOf(ECSApplication.class.getResource("icon.png"))));
        new ECSController().write();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}