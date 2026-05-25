package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/TelaLogin.fxml"));
        Parent root = fxmlLoader.load();

        Scene tela = new Scene(root, 1280, 720);

        stage.setScene(tela);
        stage.setTitle("JavaFX com FXML");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}