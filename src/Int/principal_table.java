
package Int;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.Vector;


/**
 *
 * @author USER
 */
public class principal_table extends javax.swing.JFrame {

    /**
     * Creates new form principal_table
     */
    public principal_table() {
        initComponents();
        show_table();
    }
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private void show_table(){
        int CC;
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:4306/sms","root","");
            pst = (PreparedStatement) con.prepareStatement("SELECT * FROM principal");
            
            rs = pst.executeQuery();
            ResultSetMetaData RSMD = (ResultSetMetaData) rs.getMetaData();
            CC = RSMD.getColumnCount();
            
            DefaultTableModel DFT = (DefaultTableModel)jTablePrincipal.getModel();
            DFT.setRowCount(0);
            
            while(rs.next()){
                Vector v = new Vector();
                
                for(int i=1; i<CC; i++){
                    v.add(rs.getString("Principal"));
                    v.add(rs.getString("pid"));
                    v.add(rs.getString("pname"));
                    v.add(rs.getString("paddress"));
                    v.add(rs.getString("page"));
                    v.add(rs.getString("pgender"));
                    v.add(rs.getString("ptelno"));
                    v.add(rs.getString("cs"));
                }
                
                DFT.addRow(v);
            }
        }
        
         catch(Exception e){
            System.out.println(e.getMessage() + "Error");
        }
    } 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtnAdd = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnHome = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Principal No", "ID", "Name", "Address", "Age", "Gender", "Tel No", "Current Situation"
            }
        ));
        jScrollPane1.setViewportView(jTablePrincipal);
        if (jTablePrincipal.getColumnModel().getColumnCount() > 0) {
            jTablePrincipal.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTablePrincipal.getColumnModel().getColumn(1).setPreferredWidth(15);
            jTablePrincipal.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTablePrincipal.getColumnModel().getColumn(5).setPreferredWidth(15);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 950, 290));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Principals Table");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jbtnAdd.setBackground(new java.awt.Color(0, 153, 153));
        jbtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAdd.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, -1));

        jbtnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jbtnUpdate.setText("Update");
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 90, -1));

        jbtnHome.setBackground(new java.awt.Color(0, 153, 153));
        jbtnHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnHome.setForeground(new java.awt.Color(0, 0, 0));
        jbtnHome.setText("Home");
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 90, -1));

        jbtnBack.setBackground(new java.awt.Color(0, 153, 153));
        jbtnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnBack.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 80, -1));

        jbtnCancel.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnCancel.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancel.setText("Cancel");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
        int CC;
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:4306/sms","root","");
            pst = (PreparedStatement) con.prepareStatement("SELECT * FROM principal");
            
            rs = pst.executeQuery();
            ResultSetMetaData RSMD = (ResultSetMetaData) rs.getMetaData();
            CC = RSMD.getColumnCount();
            
            DefaultTableModel DFT = (DefaultTableModel)jTablePrincipal.getModel();
            DFT.setRowCount(0);
            
            while(rs.next()){
                Vector v = new Vector();
                
                for(int i=1; i<CC; i++){
                    v.add(rs.getString("Principal"));
                    v.add(rs.getString("pid"));
                    v.add(rs.getString("pname"));
                    v.add(rs.getString("paddress"));
                    v.add(rs.getString("page"));
                    v.add(rs.getString("pgender"));
                    v.add(rs.getString("ptelno"));
                    v.add(rs.getString("cs"));
                }
                
                DFT.addRow(v);
            }
        }
        
         catch(Exception e){
            System.out.println(e.getMessage() + "Error");
        }
    
        
        principal_Profile_page principalPf = new principal_Profile_page();
        principalPf.setVisible(true);
        principalPf.pack();
        principalPf.setLocationRelativeTo(null);
        principalPf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        home_page home = new home_page();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnCancelActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        principal_page PPage = new principal_page();
        PPage.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed
    
   
    public static void AddRowToJTable(Object[] dataRow){
    
        DefaultTableModel model = (DefaultTableModel) jTablePrincipal.getModel();
        model.addRow(dataRow);
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal_table().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTablePrincipal;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnUpdate;
    // End of variables declaration//GEN-END:variables

    /*private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
