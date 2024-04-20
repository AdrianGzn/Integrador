package com.adr.proyectointegrador.controllers;

import com.adr.proyectointegrador.App;
import com.adr.proyectointegrador.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class LoginController {

    @FXML
    private Button cerrarButton;

    @FXML
    private TextField contraseñaTextField;

    @FXML
    private Button ingresarButton;

    @FXML
    private TextField matriculaTextField;

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {

    }

    @FXML
    void onMouseClickedIngresar(MouseEvent event) {
        if (matriculaTextField.getText().trim().isEmpty() || contraseñaTextField.getText().trim().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Complete los campos.");
            alert.showAndWait();
        }else {
            try{

                int matricula = Integer.parseInt(matriculaTextField.getText());
                String contraseña = contraseñaTextField.getText();

                ArrayList<Usuario> usuarios = App.getAplication().getUsuarios();
                
                boolean flag = false;
                for (int i = 0; i < usuarios.size(); i++) {
                    if ((usuarios.get(i).getMatricula() == matricula && usuarios.get(i).getContraseña() == contraseña)){
                        App.getAplication().setTipoUsuarioActual(usuarios.get(i).getTipo());
                        App.getAplication().setUsuarioActual(usuarios.get(i).getMatricula());
                        flag = true;
                    }
                }
                if (flag == false){
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("Matricula o contrasincorrectos.");
                    alert.showAndWait();
                }

                if (App.getAplication().tipo() == "alumno"){
                        App.newStage("alumno-view", "Alumno");
                } else if (App.getAplication().tipo() == "admin") {
                    App.newStage("admin-view", "Administrador");
                }else {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("Tipo no valido.");
                    alert.showAndWait();
                }
                
            }catch (Exception e){
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Complete correctamente los campos.");
                alert.showAndWait();
            }
        }
    }

}
