/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author famou
 */
public class Facture {
     private int id_fact;
    private String article;
    private int quantite;
    private String description;
    private float prixsanstva;
    private float prixavectva;
    private float total;

    public Facture( String article, int quantite, String description, float prixsanstva, float prixavectva, float total) {
        
        this.article = article;
        this.quantite = quantite;
        this.description = description;
        this.prixsanstva = prixsanstva;
        this.prixavectva = prixavectva;
        this.total = total;
    }
    
     
    

   
    public Facture(String article, int qte, String description) {
        
        this.article = article;
        this.quantite = qte;
        this.description = description;
    }
    public Facture() {
     
    }

   

    @Override
    public String toString() {
        return "Personne{" + "article=" + article + ", quantite=" + quantite + ", description=" + description + ", prix_avec_tva="+prixavectva+ '}';
    }

    public int getId_fact() {
        return id_fact;
    }

    public void setId_fact(int id_fact) {
        this.id_fact = id_fact;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrixsanstva() {
        return prixsanstva;
    }

    public void setPrixsanstva(float prixsanstva) {
        this.prixsanstva = prixsanstva;
    }

    public float getPrixavectva() {
        return prixavectva;
    }

    public void setPrixavectva(float prixavectva) {
        this.prixavectva = prixavectva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
