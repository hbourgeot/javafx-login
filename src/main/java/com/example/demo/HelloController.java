package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.ButtonBar.ButtonData;

public class HelloController {

    @FXML
    private TextField userField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void onLogin() {
        Dialog<String> dialog = new Dialog<>();
        if(this.userField.getText().equals("henrry")){
            if(this.passwordField.getText().equals("1234")){
                dialog.setTitle("Bienvenido!");
                dialog.setContentText("Inició sesión exitosamente");
            } else{
                dialog.setTitle("Error");
                dialog.setContentText("Contraseña incorrecta");
            }
        } else{
            dialog.setTitle("Error");
            dialog.setContentText("Usuario incorrecto");
        }

        ButtonType type = new ButtonType("Ok", ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();
    }
}