package com.example.tiendaapp;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    // tener una variable, por cada uno de los elemantos del fxml
    // document.querySelector("#id")
    // document.getElementById("#id")

    @FXML
    private Button botonSaludar;

    @FXML
    private TextField editNombre;

    @FXML
    private Text textoSaludo;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //todos los códigos que yo ponga aquí nada mas cargar la parte fxml
       botonSaludar.setOnAction(event -> {
           String texto = editNombre.getText();
           if (texto.isEmpty()){
               textoSaludo.setText("No hay nadie ha quien saludar ");
           }else {
           textoSaludo.setText("Enhorabuena "+texto+" has completado la app JAVAFX");

           }
       });
    }
}