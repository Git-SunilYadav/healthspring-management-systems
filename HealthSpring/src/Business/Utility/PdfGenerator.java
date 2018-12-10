/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

// Author: Sunil M. Yadav
public class PdfGenerator {
    
    public void GeneratePDF(String template , String fileName){
        try {
             Document doc = new Document();
             PdfWriter.getInstance(doc, new FileOutputStream(fileName));
             doc.open();
             doc.add( new Paragraph(template));
             doc.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problem while generating pdf");
            e.printStackTrace();
        }
    }
}
