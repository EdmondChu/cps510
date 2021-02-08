package JobBankUI;


import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Sameer
 */
public class Create_Tables extends javax.swing.JFrame {
    static Connection conn = null;

    public Create_Tables() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CREATE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CREATE TABLE");

        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 153, 0));

        jButton3.setText("EMPLOYEE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MANUFACTURER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("STORE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("PRODUCT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("MOVIE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("MUSIC");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("EMPLOYEE_PRODUCT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton2.setText("MANUFACTURER_PRODUCT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(jButton5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton7))
                                            .addComponent(jButton3))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton9)
                                            .addComponent(jButton8)
                                            .addComponent(jButton6))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE employee (" +
            "employee_name varchar(255) not null," +
            "employee_id not null," +
            "manager_id not null," +
            "CONSTRAINT employee_pk PRIMARY KEY(employee_id, manager_id)" +
            ")");
                    
                   rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE manufacturer(" +
            "manufacturer_name varchar(255) not null," +
            "manufacuter_address varchar(255)," +
            "manufacturer_id not null," +
            "CONSTRAINT manufacturer_pk PRIMARY KEY(manufacturer_id)" +
            ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE store(" +
            "store_name varchar(255) not null," +
            "store_address varchar(255)," +
            "manager_id int not null," +
            "store_number int not null," +
            "CONSTRAINT store_pk PRIMARY KEY(store_number)," +
        ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE product(" +
            "delivery_status varchar(255) not null," +
            "title varchar(255) not null," +
            "format varchar(255) not null," +
            "quantity int not null," +
            "genre varchar(255)," +
            "price float not null," +
            "low_inventory_limit int not null," +
            "store_number int not null," +
            "product_id int not null," +
            "CONSTRAINT product_pk PRIMARY KEY(product_id)," +
            "CONSTRAINT fk_store FOREIGN KEY (store_number) REFERENCES store(store_number)" +
            ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
              Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE movie(" +
            "product_id int not null," +
            "lead_actor varchar(255)," +
            "director varchar(255)," +
            "production_company varchar(255) not null," +
            "CONSTRAINT movie_pk PRIMARY KEY(product_id)," +
            "CONSTRAINT fk_product_movie FOREIGN KEY(product_id) REFERENCES product(product_id)," +
            ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE music(" +
            "product_id int not null," +
            "lead_artist varchar(255) not null," +
            "producer varchar(255) not null," +
            "record_label varchar(255)," +
            "CONSTRAINT music_pk PRIMARY KEY(product_id)," +
            "CONSTRAINT fk_product_music FOREIGN KEY(product_id) REFERENCES product(product_id)" +
            ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE employee_product(" +
            "product_id int not null," +
            "employee_id int not null," +
            "CONSTRAINT fk_product_employee FOREIGN KEY(product_id) REFERENCES product(product_id)," +
            "CONSTRAINT employee_product_pk PRIMARY KEY(product_id,employee_id)" +
            ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Database.ConnectToDB();
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE manufacturer_product(" +
            "product_id int not null," +
            "manufacturer_id int not null," +
            "CONSTRAINT fk_product_manufacturer FOREIGN KEY(product_id)" +
            "REFERENCES product(product_id)," +
            "CONSTRAINT fk_manufacturer FOREIGN KEY(manufacturer_id)" +
            "REFERENCES manufacturer(manufacturer_id)," +
            "CONSTRAINT manufacturer_product_pk PRIMARY KEY(product_id,manufacturer_id)" +
            ")");
                    
         rs.close();
       } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}