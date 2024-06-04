
package Int;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class principal_Profile_page extends javax.swing.JFrame {

     
    String gender, cs;
    
    Connection con;
    
            
    public principal_Profile_page() {
        initComponents();
        
        //title
        this.setTitle("Principal Profile");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtTelNo = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtAge = new javax.swing.JTextField();
        jlblPrincipalProfileImage = new javax.swing.JLabel();
        jbtnSelectImage = new javax.swing.JButton();
        jbtnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtPrincipalID = new javax.swing.JTextField();
        jcmbCurrentSituation = new javax.swing.JComboBox<>();
        jbtnAdd = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtxtPrincipalNo = new javax.swing.JTextField();
        jbtnHome = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jcmbGender = new javax.swing.JComboBox<>();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Principal Profile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tel No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jtxtTelNo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtTelNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtTelNo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtxtTelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 220, -1));

        jtxtName.setBackground(new java.awt.Color(255, 255, 255));
        jtxtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 220, -1));

        jtxtAddress.setBackground(new java.awt.Color(255, 255, 255));
        jtxtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtAddress.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, -1));

        jtxtAge.setBackground(new java.awt.Color(255, 255, 255));
        jtxtAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtAge.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, -1));

        jlblPrincipalProfileImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Profi_image.png"))); // NOI18N
        jPanel1.add(jlblPrincipalProfileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 140, 130));

        jbtnSelectImage.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSelectImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnSelectImage.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSelectImage.setText("Select mage");
        jPanel1.add(jbtnSelectImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 110, 30));

        jbtnSearch.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnSearch.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Principal No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 100, 40));

        jtxtPrincipalID.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtPrincipalID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 220, 30));

        jcmbCurrentSituation.setBackground(new java.awt.Color(0, 153, 153));
        jcmbCurrentSituation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcmbCurrentSituation.setForeground(new java.awt.Color(0, 0, 0));
        jcmbCurrentSituation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Past", "Past & Present" }));
        jcmbCurrentSituation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrentSituationActionPerformed(evt);
            }
        });
        jPanel1.add(jcmbCurrentSituation, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 190, -1));

        jbtnAdd.setBackground(new java.awt.Color(0, 153, 153));
        jbtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnAdd.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 80, -1));

        jbtnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jbtnUpdate.setText("Update");
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 80, -1));

        jbtnCancel.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCancel.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancel.setText("Cancel");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 50, 30));

        jtxtPrincipalNo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPrincipalNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtPrincipalNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, -1));

        jbtnHome.setBackground(new java.awt.Color(0, 153, 153));
        jbtnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnHome.setForeground(new java.awt.Color(0, 0, 0));
        jbtnHome.setText("Home");
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 80, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Current Situation");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jcmbGender.setBackground(new java.awt.Color(255, 255, 255));
        jcmbGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcmbGender.setForeground(new java.awt.Color(0, 0, 0));
        jcmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jcmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        
        String name, id, address, age, tel_no, query;
        String SUrl, SUser, SPassword; 
        SUrl = "jdbc:mysql://localhost:4306/sms"; 
        SUser = "root";
        SPassword = " ";
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPassword);
            Statement st = con.createStatement();
            
            
            if("".equals(jtxtName.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Full Name is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else if("".equals(jtxtPrincipalID.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else if("".equals(jtxtAddress.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else if("".equals(jtxtAge.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            //else if("".equals(jPassword.getText())){
            //JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            //}
            
            else if("".equals(jtxtTelNo.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            //else if("".equals(jPassword.getText())){
            //JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            //}
            
            else{
                name = jtxtName.getText();
                id = jtxtPrincipalID.getText();
                address = jtxtAddress.getText();
                age = jtxtAge.getText();
                gender = jcmbGender.getSelectedItem().toString();
                tel_no = jtxtTelNo.getText();
                cs = jcmbCurrentSituation.getSelectedItem().toString();
                
                
                query = "INSERT INTO principal(pname, pid, page, pgender, paddress, ptelno, cs)"
                        + ""+"VALUES('"+name+"', '"+id+"', '"+age+"', '"+gender+"',  '"+address+"', '"+tel_no+"', '"+cs+"')";
                
                st.execute(query);
                jtxtName.setText("");
                jtxtPrincipalID.setText("");
                jtxtAddress.setText("");
                jtxtAge.setText("");
                jtxtTelNo.setText("");
               
                
                
                showMessageDialog(null,"Principal data has been added successfully!");
            }
        }
        catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
        
        /* 
        
        String name = jtxtName.getText();
        String id = jtxtPrincipalID.getText();
        String address = jtxtAddress.getText();
        String age = jtxtAge.getText();
        String telNo = jtxtTelNo.getText();
        String gender = jcmbGender.getSelectedItem().toString();
        String currentSituation = jcmbCurrentSituation.getSelectedItem().toString();

        if (name.isEmpty() || id.isEmpty() || address.isEmpty() || age.isEmpty() || telNo.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPassword);
             PreparedStatement pst = con.prepareStatement("INSERT INTO principal (pname, pid, page, pgender, paddress, ptelno, cs) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            pst.setString(1, name);
            pst.setString(2, id);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, address);
            pst.setString(6, telNo);
            pst.setString(7, currentSituation);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Principal data has been added successfully!");
            
            clearFields();
            loadPrincipalDataToTable();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void clearFields() {
        jtxtName.setText("");
        jtxtPrincipalID.setText("");
        jtxtAddress.setText("");
        jtxtAge.setText("");
        jtxtTelNo.setText("");
        jcmbGender.setSelectedIndex(0);
        jcmbCurrentSituation.setSelectedIndex(0);
    }

    private void loadPrincipalDataToTable() {
        String sql = "SELECT * FROM principal";
        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPassword);
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) principal_table.jTablePrincipal.getModel();
            model.setRowCount(0); // Clear existing data
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("PrincipalNo"),
                    rs.getString("pid"),
                    rs.getString("pname"),
                    rs.getString("paddress"),
                    rs.getString("page"),
                    rs.getString("pgender"),
                    rs.getString("ptelno"),
                    rs.getString("cs")
                });
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }*/
    
        
        
    }//GEN-LAST:event_jbtnAddActionPerformed
     
    
    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        home_page home = new home_page();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jcmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbGenderActionPerformed
        gender = (String) jcmbGender.getSelectedItem();
    }//GEN-LAST:event_jcmbGenderActionPerformed

    private void jcmbCurrentSituationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrentSituationActionPerformed
        cs = (String) jcmbCurrentSituation.getSelectedItem();
    }//GEN-LAST:event_jcmbCurrentSituationActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnCancelActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        try{
            
            //stmt = con.createStatement();
            
            /*while(rs.next()){
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
            }*/
        }
        
         catch(Exception e){
            System.out.println(e.getMessage() + "Error");
        }
        
        
    }//GEN-LAST:event_jbtnSearchActionPerformed

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal_Profile_page().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnSelectImage;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox<String> jcmbCurrentSituation;
    private javax.swing.JComboBox<String> jcmbGender;
    private javax.swing.JLabel jlblPrincipalProfileImage;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPrincipalID;
    private javax.swing.JTextField jtxtPrincipalNo;
    private javax.swing.JTextField jtxtTelNo;
    // End of variables declaration//GEN-END:variables
}
