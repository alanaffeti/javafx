/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Facture;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import services.Facturecrud;

/**
 * FXML Controller class
 *
 * @author famou
 */



public class FactureController implements Initializable {

    @FXML
    private TextField tfarticle;
    @FXML
    private TextField tfprix2;
    @FXML
    private TextField tfprix1;
    @FXML
    private TextField tftotal;
    @FXML
    private TextField tfquantite;
    @FXML
    private TextArea tfdesc;
    @FXML
    private Button btnvalide;

    /**
     * Initializes the controller class.
     */
    
    Facture f = new Facture();
    Facturecrud fa=new Facturecrud();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void valid(ActionEvent event) {
    
    f=new Facture();
            f.setArticle(tfarticle.getText());
             
            f.setQuantite(Integer.parseInt(tfquantite.getText()));
            f.setDescription(tfdesc.getText());
            f.setPrixsanstva(Float.parseFloat(tfprix1.getText()));
            f.setPrixavectva(Float.parseFloat(tfprix2.getText()));
            f.setTotal(Float.parseFloat(tftotal.getText()));
            fa.ajouter(f);
    
    
    
    
    }
    
}
