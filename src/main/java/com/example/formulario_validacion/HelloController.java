package com.example.formulario_validacion;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField fieldNombre;
    @FXML
    private TextField fieldApellidos;

    @Deprecated
    public void fieldEdad(ActionEvent actionEvent) {
    }

    @Deprecated
    public void fieldCorreo(ActionEvent actionEvent) {
    }

    @Deprecated
    public void fieldNac(ActionEvent actionEvent) {
    }

    @Deprecated
    public void fieldNombreTyped(Event event) {
        if (fieldNombre.getText().length() <= 7) {
            fieldNombre.setStyle("-fx-background-color: #008000;");
        } else {
            fieldNombre.setStyle("-fx-background-color: #FF0000;");
        }
    }
    @FXML
    public void fieldApellidosTyped(Event event) {
        if (fieldApellidos.getText().length() <= 7) {
            fieldApellidos.setStyle("-fx-background-color: #008000;");
        } else {
            fieldApellidos.setStyle("-fx-background-color: #FF0000;");
        }
    }
}