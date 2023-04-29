/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entities.Facture;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author skander
 */
public class ServicePdfA {
    public void liste_PromotionPDF() throws FileNotFoundException, DocumentException {

        Facturecrud sd = new Facturecrud();
        String message = "Voici Votre facture  \n\n";

        String file_name = "src/PDF/facture.pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(file_name));
        document.open();
        Paragraph para = new Paragraph(message);
        document.add(para);
        List<Facture> art = sd.afficher();
        PdfPTable table = new PdfPTable(6);

        PdfPCell cl = new PdfPCell(new Phrase("article"));
        table.addCell(cl);
        PdfPCell c2 = new PdfPCell(new Phrase("quantite"));
        table.addCell(c2);
        PdfPCell c3 = new PdfPCell(new Phrase("description"));
        table.addCell(c3);
        PdfPCell c4 = new PdfPCell(new Phrase("prixsanstva"));
        table.addCell(c4);
        //PdfPCell c5 = new PdfPCell(new Phrase("image"));
        //table.addCell(c5);
        PdfPCell c6 = new PdfPCell(new Phrase("prixavectva"));
        table.addCell(c6);
        PdfPCell c7 = new PdfPCell(new Phrase("total"));
        table.addCell(c7);
        
        
        
        
        table.setHeaderRows(1);
        document.add(table);

        int i = 0;
        for (i = 0; i < art.size(); i++) {
            table.addCell("" + art.get(i).getArticle());
            table.addCell("" + art.get(i).getQuantite());
            table.addCell("" + art.get(i).getDescription());
            table.addCell("" + art.get(i).getPrixsanstva());
            //table.addCell("" + art.get(i).getImg());
            table.addCell("" + art.get(i).getPrixavectva());
            table.addCell("" + art.get(i).getTotal());

        }
        
        document.add(table);
        

        document.close();

    }
     
    
}
