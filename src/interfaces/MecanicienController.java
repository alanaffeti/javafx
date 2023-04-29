/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Mecanicien;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import services.Mecaniciencrud;

/**
 * FXML Controller class
 *
 * @author famou
 */
public class MecanicienController implements Initializable {

    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfnom1;
    @FXML
    private TextField tfnom2;
    @FXML
    private TextField tfnom3;
    @FXML
    private TextField tfnom4;
    @FXML
    private TextField tfnom5;
    @FXML
    private TextField tfnom31;
    @FXML
    private CheckBox tfdispo;
    @FXML
    private Button btnimport1;
    @FXML
    private Button btnvalide;

     private static String Picture="";
    
   
    Mecanicien m= new Mecanicien();
    Mecaniciencrud sa=new Mecaniciencrud();
    @FXML
    private TextField tfimage1;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void import1(ActionEvent event) 
    
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
    private void valider(ActionEvent event) {
        
        m=new Mecanicien();
            m.setNom(tfnom.getText());
            m.setPrenom(tfnom1.getText());
            m.setCin(tfnom2.getText());
            m.setNum_tel(tfnom3.getText());
            m.setSalaire(Float.parseFloat(tfnom4.getText()));

            m.setAdresse_mail(tfnom5.getText());
            m.setLieu_garage(tfnom31.getText());
            m.setDisponibilite(tfdispo.isSelected());
            m.setFacture_rep(tfnom31.getText());
            
            sa.ajouter(m);
    }
    
}
