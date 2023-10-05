/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author gomez
 */
public class Fxml_cuboController implements Initializable {


    @FXML
    private Canvas canvasCubo;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iniciarCubo();
    }    
    
    
    private void iniciarCubo(){
        
        
        // Obtener el contexto gráfico del Canvas
        GraphicsContext gc = canvasCubo.getGraphicsContext2D();
        
        // Definir el tamaño y separación de los cuadros
        double tileSize = 60; // Tamaño de cada cuadro
        double padding = 10;  // Espacio entre cuadros
        
        // Dibujar los 9 cuadros en la cara frontal
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                double x = col * (tileSize + padding);
                double y = row * (tileSize + padding);
                gc.setFill(Color.WHITE); // Color de fondo de los cuadros
                gc.fillRect(x, y, tileSize, tileSize);
                gc.setStroke(Color.GRAY); // Color del borde de los cuadros
                gc.strokeRect(x, y, tileSize, tileSize);
            }
        }
    }
}
