/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JobBankUI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Sameer
 */
public class SimpleQueries extends javax.swing.JFrame {
    
    static Connection conn = null;

    /**
     * Creates new form SimpleQueries
     */
    public SimpleQueries() {
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Simple Queries");

        jButton1.setText("RUN QUERIES AND CREATE VIEWS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  
        String[] arr = {"SELECT QUANTITY FROM PRODUCT WHERE TITLE = 'batman'",
            "SELECT DISTINCT DELIVERY_STATUS FROM PRODUCT WHERE TITLE = 'star wars'",
            "SELECT DISTINCT DIRECTOR FROM MOVIE WHERE lead_actor = 'Donald Trump'",
            "SELECT DISTINCT LEAD_ARTIST FROM MUSIC WHERE PRODUCER = 'Rye'",
            "SELECT DISTINCT EMPLOYEE_ID FROM EMPLOYEE WHERE EMPLOYEE_NAME = 'Bill Gates'",
            "SELECT DISTINCT MANUFACTURER_ADDRESS FROM MANUFACTURER WHERE MANUFACTURER_NAME = 'Ryerson'",
            "SELECT DISTINCT MANAGER FROM STORE WHERE STORE_NAME = 'Indico Store'",
            "SELECT EMPLOYEE_NAME, EMPLOYEE_ID FROM EMPLOYEE ORDER BY EMPLOYEE_ID DESC",
            "CREATE VIEW Store_Info(StoreName StoreAddress,StoreNumber) AS SELECT STORE_NAME, STORE_ADDRESS, STORE_NUMBER FROM STORE",
            "CREATE VIEW Employee_Info(EmployeeName, EmployeeID) AS SELECT EMPLOYEE_NAME, EMPLOYEE_ID FROM EMPLOYEE"
        };
        
        Database.ConnectToDB();
        String[] attr = new String[20];
        String temp = "";
     
        for(int a = 0; a < arr.length; a++ )
        {
            try{
                        Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(arr[a]);
                        ResultSetMetaData rsmd = rs.getMetaData();
                        int cn = rsmd.getColumnCount();
                        

                        while (rs.next()) {
                            for(int i = 0; i<cn; i++){
                                    attr[i] = rs.getString(i+1).toString();
                            }
                            for(int i = 0; i<cn; i++){
                                    //System.out.print(attr[i] + "\t\t");
                                    temp = temp + attr[i] + "\t\t";
                            }
                            //System.out.println("");
                            temp = temp + "\n";
                        }
                        jTextArea1.setText(arr[a]);
                        jTextArea1.setText(temp);
                        rs.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } 
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(SimpleQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleQueries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}