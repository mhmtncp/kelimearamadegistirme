//java highlighter pointer

import java.awt.Color;
import javax.swing.*;
import javax.swing.text.DefaultHighlighter;
import java.io.File;
import java.io.FileWriter;
import java.text.Collator;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Java_sabah
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        doldur();
    }

    class Boya extends DefaultHighlighter.DefaultHighlightPainter {

        public Boya(Color c) {
            super(c);
        }
        

    }
    
    Highlighter.HighlightPainter boya = new Boya(Color.yellow);
    
    public void highlighter(JTextComponent textComp, String pattern) {
        
            try {
                Highlighter hilite = textComp.getHighlighter();
                Document doc = textComp.getDocument();
                String text = doc.getText(0, doc.getLength());
                int pos = 0;
                
                while ((pos=text.toUpperCase().indexOf(pattern.toUpperCase(),pos))>=0) {                    
                    hilite.addHighlight(pos, pos+pattern.length(), boya);
                    pos += pattern.length();
                    
                }
            } catch (Exception e) {
            }
        }

    public void doldur() {

        File f = new File("notlar");
        File[] fDizi = f.listFiles();
        DefaultListModel list = new DefaultListModel();
        for (File item : fDizi) {
            String name = item.getName();
            int pos = name.lastIndexOf(".");
            if (pos > 0) {
                name = name.substring(0, pos);
                list.addElement(name);
            }
        }

        jList1.setModel(list);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        txtBaslik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonKayit = new javax.swing.JButton();
        buttonSil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAranacak = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDegisecek = new javax.swing.JTextField();
        buttonDegistir = new javax.swing.JButton();
        buttonTumunu = new javax.swing.JButton();
        buttonBul = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("İşlemler"));

        jLabel1.setText("Başlık: ");

        buttonKayit.setText("Kayıt");
        buttonKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKayitActionPerformed(evt);
            }
        });

        buttonSil.setText("Sil");
        buttonSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSilActionPerformed(evt);
            }
        });

        jLabel2.setText("Aranacak: ");

        jLabel3.setText("Değişim:  ");

        buttonDegistir.setText("Değiştir");
        buttonDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDegistirActionPerformed(evt);
            }
        });

        buttonTumunu.setText("Tümünü Değiştir");
        buttonTumunu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTumunuActionPerformed(evt);
            }
        });

        buttonBul.setText("Bul");
        buttonBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBaslik)
                    .addComponent(txtAranacak)
                    .addComponent(txtDegisecek, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonKayit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSil))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonBul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDegistir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTumunu)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonKayit)
                    .addComponent(buttonSil))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAranacak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDegisecek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonDegistir)
                            .addComponent(buttonTumunu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonBul))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("İçerik"));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKayitActionPerformed
        String baslik = txtBaslik.getText().trim();
        String icerik = txtArea.getText().trim();

        File f = new File("notlar/" + baslik + ".txt");

        try {
            if (baslik.equals("") || icerik.equals("")) {
                JOptionPane.showMessageDialog(this, "Lütfen dosya başlığı ve içeriği  giriniz");
            } else {
                f.createNewFile();
                FileWriter yaz = new FileWriter(f);
                yaz.append(txtArea.getText());
                yaz.close();
                JOptionPane.showMessageDialog(this, "Dosya Oluşturuldu");

            }
        } catch (Exception e) {
            System.err.println("Dosya oluşturma hatası: " + e);
        }

        doldur();

    }//GEN-LAST:event_buttonKayitActionPerformed

    String txtAd = "";
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        txtAd = jList1.getSelectedValue();

        if (evt.getClickCount() == 2) {
            File f = new File("notlar/" + jList1.getSelectedValue() + ".txt");
            try {
                Scanner oku = new Scanner(f);
                txtArea.setText(oku.nextLine());
            } catch (Exception e) {
                System.out.println("Dosya okuma hatası: " + e);
            }

        }
    }//GEN-LAST:event_jList1MouseClicked

    private void buttonSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSilActionPerformed

        File f = new File("notlar/" + txtAd + ".txt");
        f.delete();
        doldur();
        JOptionPane.showMessageDialog(this, "Dosya silindi");
        txtAd = "";
    }//GEN-LAST:event_buttonSilActionPerformed

    private void buttonBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBulActionPerformed
 
        
        highlighter(txtArea, txtAranacak.getText() );
    }//GEN-LAST:event_buttonBulActionPerformed

    private void buttonTumunuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTumunuActionPerformed

        String icerik = txtArea.getText();
        String son = icerik.replace(txtAranacak.getText(), txtDegisecek.getText());
        txtArea.setText(son);
        
           File f = new File("notlar/"+txtAd+".txt");//
        try {
            FileWriter yaz = new FileWriter(f);
            yaz.append(txtArea.getText());
            yaz.close();
            
        } catch (Exception e) {
            System.err.println("Yazma hatasi + " + e);
        }

    }//GEN-LAST:event_buttonTumunuActionPerformed

    private void buttonDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDegistirActionPerformed

        String icerik = txtArea.getText();
        int index = txtArea.getText().indexOf(txtAranacak.getText());
        int uzunluk = txtAranacak.getText().length();
        String bas = txtArea.getText().substring(0, index);
        String aranacak = txtAranacak.getText().replace(txtAranacak.getText(), txtDegisecek.getText());
        String son = txtArea.getText().substring(index + uzunluk, txtArea.getText().length());
        txtArea.setText(bas + aranacak + son);
        
        File f = new File("notlar/"+txtAd+".txt");//
        try {
            FileWriter yaz = new FileWriter(f);
            yaz.append(txtArea.getText());
            yaz.close();
            
        } catch (Exception e) {
            System.err.println("Yazma hatasi + " + e);
        }
        
        

    }//GEN-LAST:event_buttonDegistirActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton buttonBul;
    private javax.swing.JButton buttonDegistir;
    private javax.swing.JButton buttonKayit;
    private javax.swing.JButton buttonSil;
    private javax.swing.JButton buttonTumunu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAranacak;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtBaslik;
    private javax.swing.JTextField txtDegisecek;
    // End of variables declaration//GEN-END:variables
}
