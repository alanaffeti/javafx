/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Client;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.imageio.ImageIO;
import services.Accidentcrud;
import tools.MyConnection;

/**
 * FXML Controller class
 *
 * @author famou
 */
public class AfficherAcciController implements Initializable {

    
    ObservableList<Client>  AccidentList = FXCollections.observableArrayList();
    
    
    
    
    @FXML
    private TableColumn<Client,String> col_id;
    @FXML
    private TableColumn<Client,String> col_nomclient;
    
    Client ac= new Client();
    Accidentcrud sa=new Accidentcrud();
  
    @FXML
    private Button tfajout;
    @FXML
    private Button tfmodifier;
    @FXML
    private Button tfdelete;
    @FXML
    private Button tfrefresh;
    @FXML
    private TableColumn<Client,String> col_prenomclient;
    @FXML
    private TableColumn<Client,String> col_matricule;
    @FXML
    private TableColumn<Client,String> col_image;
    @FXML
    private TableColumn<Client,String> col_imagevoiture;
    @FXML
    private TableView<Client> listaccident;

    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfmatricule;
    @FXML
    private TextField tfprenom;
    @FXML
    private TextField tfimage1;
    @FXML
    private TextField tfimage2;
    @FXML
    private TextField tfimage4;
    @FXML
    private TextField tfimage3;
    @FXML
    private Button btnimport2;
    @FXML
    private Button btnimport3;
    @FXML
    private Button btnimport4;
    @FXML
    private Button btnimport5;
    @FXML
    private Button btnimport1;
    @FXML
    private TextField tfimage5;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
   
    
  
    }    

    @FXML
    private void Ajoutaccident(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/interfaces/Accident.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            
        
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    @FXML
    private void modifier_acc(ActionEvent event) {
        
        
        
        
        
            
    }

    @FXML
    private void supprimer(ActionEvent event) {
        
        if (listaccident.getSelectionModel().getSelectedItem() != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation de suppression");
        alert.setHeaderText(null);
        alert.setContentText("Êtes-vous sûr de vouloir supprimer ce accident ?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            int id = listaccident.getSelectionModel().getSelectedItem().getId();
            sa.supprimerr(id);
            
        }
            
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aucune facture sélectionnée");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez sélectionner une facture dans la table.");
            alert.showAndWait();
        }
        
        
        
        
        
        
        
    }

    @FXML
    private void Actualiser_Liste(ActionEvent event) {
        AccidentList.clear();
        AccidentList = FXCollections.observableArrayList(sa.afficher());
        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_prenomclient.setCellValueFactory(new PropertyValueFactory<>("prenom_client"));
        col_matricule.setCellValueFactory(new PropertyValueFactory<>("matricue"));
        col_nomclient.setCellValueFactory(new PropertyValueFactory<>("nom_client"));
        col_image.setCellValueFactory(new PropertyValueFactory<>("image"));
        col_imagevoiture.setCellValueFactory(new PropertyValueFactory<>("image_voiture_reparee"));
        
        listaccident.setItems(AccidentList);
        
        
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
    
}
