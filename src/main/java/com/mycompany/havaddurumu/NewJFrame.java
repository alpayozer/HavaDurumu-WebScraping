/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.havaddurumu;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author Alpay
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        String[] sehirler ={"Adana","Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
            "Aydın", "Balıkesir","Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum","Denizli","Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum ", "Eskişehir",
            "Gaziantep", "Giresun","Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri","Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya ", "Malatya",
            "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon  ", "Tunceli", "Şanlıurfa", "Uşak",
            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "Kırıkkale", "Batman", "Şırnak",
            "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük ", "Kilis", "Osmaniye ", "Düzce"};
      
        GridLayout lyt = new GridLayout(0,4); //paneli bölmek için grid oluşturduk.
        pnl_resoult.setLayout(lyt);
        
        //Combobox içine sehirler dizisini ekledik.
        DefaultComboBoxModel<String> model = new
        DefaultComboBoxModel<>(sehirler);
        cmb_states.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_resoult = new javax.swing.JPanel();
        btn_get = new javax.swing.JButton();
        cmb_states = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnl_resoultLayout = new javax.swing.GroupLayout(pnl_resoult);
        pnl_resoult.setLayout(pnl_resoultLayout);
        pnl_resoultLayout.setHorizontalGroup(
            pnl_resoultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        pnl_resoultLayout.setVerticalGroup(
            pnl_resoultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btn_get.setText("Getir");
        btn_get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_resoult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_get, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cmb_states, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_resoult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_get)
                    .addComponent(cmb_states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getActionPerformed
        
        //farklı bir şehir seçtiğimiz zaman önceki bilgileri kaldırıp görüntülüyor.
        if(pnl_resoult.getComponents().length != 0){
            Component[] lst = pnl_resoult.getComponents();
            for(Component elm : lst){
                pnl_resoult.remove(elm);
            }
        }


        //başlıklar oluşturuluyor ve jpanele ekleniyor.
        String[] labelsTexts = {"Tarih" , "Hadise" , "Sıcaklık(min)" , "Sıcaklık(max)"};
        
        JLabel[] labels = new JLabel[labelsTexts.length];
        Font font = new Font("Arial" , Font.BOLD , 24);   
        
        for(int i = 0 ; i<labels.length ; i++){
            labels[i] = new JLabel(labelsTexts[i] , JLabel.CENTER);
            labels[i].setFont(font);
            pnl_resoult.add(labels[i]);
        }
        
        pnl_resoult.revalidate();
        
        String url = "https://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx?il=" 
                + cmb_states.getSelectedItem().toString();
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Alpay\\Documents\\NetBeansProjects\\havaddurumu\\geckodriver.exe");
        FirefoxOptions opt = new FirefoxOptions();
        opt.addArguments("--headless");
        WebDriver driver = new FirefoxDriver(opt);
        driver.get(url);
        
        WebElement selectElement = driver.findElement(By.id("_4_5gunluk"));
        List<WebElement> selectedColumns = selectElement.findElements(By.tagName("td"));
        
        for(int i = 0; i < 60; i+=12){
            JLabel lbl_tarih = new JLabel();
            lbl_tarih.setText(selectedColumns.get(i).getText());
            pnl_resoult.add(lbl_tarih);
            
            String imgPath = selectedColumns.get(i + 1).findElement(By.tagName("img")).getAttribute("src");
            SVGImage img_hadise = new SVGImage();
            img_hadise.setSvgImage(imgPath);
            pnl_resoult.add(img_hadise);
            
            JLabel lbl_min = new JLabel();
            lbl_min.setText(selectedColumns.get(i + 2).getText());
            pnl_resoult.add(lbl_min);
            
            JLabel lbl_max = new JLabel();
            lbl_max.setText(selectedColumns.get(i + 3).getText());
            pnl_resoult.add(lbl_max);
            
        }
        
        
    }//GEN-LAST:event_btn_getActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_get;
    private javax.swing.JComboBox<String> cmb_states;
    private javax.swing.JPanel pnl_resoult;
    // End of variables declaration//GEN-END:variables
}
