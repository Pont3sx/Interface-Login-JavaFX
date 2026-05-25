package org.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {
    @FXML
    private Button sairButton;

    @FXML
    public void efutuarLogout() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TelaLogin.fxml"));
            Parent root = loader.load();

            Stage janela = (Stage) sairButton.getScene().getWindow();
            janela.setScene(new Scene(root, 1280, 720));
            janela.setTitle("JavaFX com FXML");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
