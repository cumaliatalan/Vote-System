import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CumaliAtalan
 */
public class kayitEkrani extends javax.swing.JFrame {

    /**
     * Creates new form kayitEkrani
     */
    public kayitEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kayit_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kimlik_no_alani = new javax.swing.JTextField();
        isim_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        kayit_ol_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kayit_panel.setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kimlik No: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İsim Soyisim:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parola: ");

        kimlik_no_alani.setBackground(new java.awt.Color(255, 255, 255));
        kimlik_no_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimlik_no_alaniActionPerformed(evt);
            }
        });

        isim_alani.setBackground(new java.awt.Color(255, 255, 255));
        isim_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isim_alaniActionPerformed(evt);
            }
        });

        parola_alani.setBackground(new java.awt.Color(255, 255, 255));
        parola_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parola_alaniActionPerformed(evt);
            }
        });

        kayit_ol_butonu.setBackground(new java.awt.Color(204, 0, 204));
        kayit_ol_butonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        kayit_ol_butonu.setForeground(new java.awt.Color(255, 255, 255));
        kayit_ol_butonu.setText("Kayıt Ol");
        kayit_ol_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_ol_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kayit_panelLayout = new javax.swing.GroupLayout(kayit_panel);
        kayit_panel.setLayout(kayit_panelLayout);
        kayit_panelLayout.setHorizontalGroup(
            kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayit_panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kayit_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(isim_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kayit_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kimlik_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kayit_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kayit_ol_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        kayit_panelLayout.setVerticalGroup(
            kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayit_panelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kimlik_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(isim_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayit_ol_butonu)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kayit_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kayit_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayit_ol_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_ol_butonuActionPerformed

        baglanti bag =new baglanti(); 
        //baglanti class'ından bag adından bir obje oluşturur.
        
        bag.kullaniciEkle(kimlik_no_alani.getText(), isim_alani.getText(), parola_alani.getText()); 
        //baglanti class'ında bulunan kullaniciEkle metoduna kullanıcının arayüzde girdiği bilgileri gönderir.
        
        ArrayList<Guncelle> guncel_list =oyKullanmaEkrani.getguncel_list();
        //guncel_list adında bir arraylist oyKullanmaEkrani içerisinde oluşturuldu
        
        guncel_list.add(new Guncelle(kimlik_no_alani.getText()));
        //bu listenin amacı kimlik, ad_soyad, parola girişi yapan kullanıcının kullandığı oyu veritabanına eklemektir.
        //veritabanına eklemek için kullanıcının kimlik_no'suna ihtiyaç vardır.
        
        setVisible(false);
        //setVisible sayesinde kayıt ol'a basıldığında kullanıcı kayıt ekranı kapanır.
    }//GEN-LAST:event_kayit_ol_butonuActionPerformed

    private void kimlik_no_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimlik_no_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kimlik_no_alaniActionPerformed

    private void isim_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isim_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isim_alaniActionPerformed

    private void parola_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parola_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parola_alaniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayitEkrani().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isim_alani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kayit_ol_butonu;
    private javax.swing.JPanel kayit_panel;
    private javax.swing.JTextField kimlik_no_alani;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
   
}