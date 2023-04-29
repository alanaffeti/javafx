/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Client;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;



import javafx.stage.FileChooser;

// import javafx.scene.image.Image;

import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import services.Accidentcrud;

/**
 * FXML Controller class
 *
 * @author famou
 */
public class AccidentController implements Initializable {

    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfprenom;
    @FXML
    private TextField tfmatricule;
    @FXML
    private TextField tfimage1;
    @FXML
    private TextField tfimage2;
    @FXML
    private TextField tfimage3;
    @FXML
    private TextField tfimage4;
    @FXML
    private TextField tfimage5;
    @FXML
    private Button btnimport1;
    @FXML
    private Button btnimport2;
    @FXML
    private Button btnimport3;
    @FXML
    private Button btnimport4;
    @FXML
    private Button btnimport5;
    @FXML
    private Button btnvalide;
    

    private static String Picture="";
   
    Client ac= new Client();
    Accidentcrud sa=new Accidentcrud();
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void impo1(ActionEvent event) 
        
         throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pick a banner file!");
        fileChooser.setInitialDirectory(new File("C:\\Users\\famou\\OneDrive\\Documents\\NetBeansProjects\\Projectpi\\src\\images"));
        Stage stage = new Stage();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
            );
        File file = fileChooser.showOpenDialog(stage);
        try {
                BufferedImage bufferedImage = ImageIO.read(file);
                javafx.scene.image.Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                tfimage1.setText(file.getAbsolutePath());
                
            } catch (IOException ex) {
                System.out.println("could not get the image");
            }
    }
    
    
    
    
 
    
    
    
    
    @FXML
    private void impo2(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pick a banner file!");
        fileChooser.setInitialDirectory(new File("C:\\Users\\famou\\OneDrive\\Documents\\NetBeansProjects\\Projectpi\\src\\images"));
        Stage stage = new Stage();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
            );
        File file = fileChooser.showOpenDialog(stage);
        try {
                BufferedImage bufferedImage = ImageIO.read(file);
                javafx.scene.image.Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                tfimage2.setText(file.getAbsolutePath());
                
            } catch (IOException ex) {
                System.out.println("could not get the image");
            }
        
         
    }

    @FXML
    private void impo3(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pick a banner file!");
        fileChooser.setInitialDirectory(new File("C:\\Users\\famou\\OneDrive\\Documents\\NetBeansProjects\\Projectpi\\src\\images"));
        Stage stage = new Stage();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
            );
        File file = fileChooser.showOpenDialog(stage);
        try {
                BufferedImage bufferedImage = ImageIO.read(file);
                javafx.scene.image.Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                tfimage3.setText(file.getAbsolutePath());
                
            } catch (IOException ex) {
                System.out.println("could not get the image");
            }
        
     
    }
    
    
    @FXML
    private void impo4(ActionEvent event)throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pick a banner file!");
        fileChooser.setInitialDirectory(new File("C:\\Users\\famou\\OneDrive\\Documents\\NetBeansProjects\\Projectpi\\src\\images"));
        Stage stage = new Stage();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
            );
        File file = fileChooser.showOpenDialog(stage);
        try {
                BufferedImage bufferedImage = ImageIO.read(file);
                javafx.scene.image.Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                tfimage4.setText(file.getAbsolutePath());
                
            } catch (IOException ex) {
                System.out.println("could not get the image");
            } 
        
       
    }

    @FXML
    private void impo5(ActionEvent event) 
                              throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pick a banner file!");
        fileChooser.setInitialDirectory(new File("C:\\Users\\famou\\OneDrive\\Documents\\NetBeansProjects\\Projectpi\\src\\images"));
        Stage stage = new Stage();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
            );
        File file = fileChooser.showOpenDialog(stage);
        try {
                BufferedImage bufferedImage = ImageIO.read(file);
                javafx.scene.image.Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                tfimage5.setText(file.getAbsolutePath());
                
            } catch (IOException ex) {
                System.out.println("could not get the image");
            } 
         

    
    
    }

    @FXML
    private void valid(ActionEvent event) {
        
        ac=new Client();
            ac.setNom_client(tfnom.getText());
            ac.setPrenom_client(tfprenom.getText());
            ac.setMatricule(tfmatricule.getText());
            ac.setImage(tfimage1.getText());
            ac.setImage_voiture_reparee(tfimage2.getText());
            ac.setImage_piece_endommage(tfimage3.getText());
            ac.setImage_nouveau_pieces(tfimage4.getText());
            ac.setImage_facture_reparation(tfimage5.getText());
            sa.ajouter(ac);
        
    }

    
    
}
