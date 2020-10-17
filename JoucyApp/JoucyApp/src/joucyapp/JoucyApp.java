/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joucyapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Joucy
 */
public class JoucyApp extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
       window=primaryStage;
       window.setTitle("Event Belajar Coding");
       
       GridPane grid=new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setVgap(18);
       grid.setHgap(18);
       grid.setPadding(new Insets(18));
       
       Text welcomeTxt = new Text("Selamat Datang");
       welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
       grid.add(welcomeTxt, 0, 0);
       
       Label lblUser = new Label("Nama");
       grid.add(lblUser, 0, 1);
       
       TextField txtUser = new TextField();
       txtUser.setPromptText("username");
       grid.add(txtUser, 1, 1);
       
       Label lblTelp = new Label("Telepon");
       grid.add(lblTelp, 0, 2);
       
       TextField txtTelp = new TextField();
       txtTelp.setPromptText("Telepon");
       grid.add(txtTelp, 1, 2);
       
       Label lblAlamat = new Label("Alamat");
       grid.add(lblAlamat, 0, 3);
       
       TextField txtAlamat = new TextField();
       txtAlamat.setPromptText("Alamat");
       grid.add(txtAlamat, 1, 3);
       
       Button kirimBtn = new Button("Kirim");
       grid.add(kirimBtn, 1, 4);
       
       Button hapusBtn = new Button("Hapus");
       grid.add(hapusBtn, 1, 5);
       
       Scene scene = new Scene(grid, 500, 500);
       window.setScene(scene);
       window.show();
        
    }

    
}
