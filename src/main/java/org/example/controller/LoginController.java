package org.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {
    // O @FXML conecta essa variável ao componente TextField do arquivo FXML
    @FXML
    private TextField emailField;

    // O @FXML conecta essa variável ao PasswordField do FXML
    @FXML
    private PasswordField senhaField;

    // Método chamado automaticamente quando o botão de login é clicado
    @FXML
    public void efetuarLogin() {
        String email = emailField.getText();
        String senha = senhaField.getText();

        if (email.isEmpty() || senha.isEmpty()) {
            exibirAlerta(Alert.AlertType.WARNING, "Campos Vazios", "Por favor, preencha todos os campos!");

        } else if (email.equals("EmailTeste@gmail.com") && senha.equals("12345678")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TelaPrincipal.fxml"));
                Parent root = loader.load();

                Stage janela = (Stage) emailField.getScene().getWindow();
                Scene novaTela = new Scene(root, 1280, 720);
                janela.setScene(novaTela);
                janela.setTitle("Painel Principal do Sistema");
                janela.centerOnScreen();
            } catch (java.io.IOException e) {
                e.printStackTrace();
                exibirAlerta(Alert.AlertType.ERROR, "Erro de Carregamento", "Não foi possível abrir a tela principal.");
            }

        } else {
            exibirAlerta(Alert.AlertType.ERROR, "Erro de Autenticação", "E-mail ou senha incorretos.");
        }

    }

    // Método auxiliar para criar e mostrar alertas
    public void exibirAlerta(Alert.AlertType tipo, String titulo, String mensagem) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}