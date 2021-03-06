package jdbc_test;

import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DisplayRecord extends javax.swing.JFrame {

    /**
     * Creates new form DisplayRecord
     */
    public DisplayRecord() {
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

        keyword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PalmTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Refreshbtn = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        species = new javax.swing.JTextField();
        genus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        speciestxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        genustxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        keyword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        keyword.setForeground(java.awt.SystemColor.text);
        keyword.setText("keyword :");
        getContentPane().add(keyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 54, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        PalmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Common Name", "Genus", "Species", "Photo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PalmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PalmTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PalmTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 90, 705, 221));

        jButton1.setText("Summary Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 135, 44));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selectedButtonForeground"));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, 50));

        Refreshbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        Refreshbtn.setText("Refresh");
        Refreshbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 117, -1));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 52, 345, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.text);
        jLabel2.setText("Search Results");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchbtn.setForeground(java.awt.SystemColor.windowText);
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 44, -1, -1));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 70, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 100, 44));

        species.setEditable(false);
        species.setBackground(java.awt.SystemColor.activeCaption);
        species.setOpaque(false);
        species.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speciesActionPerformed(evt);
            }
        });
        getContentPane().add(species, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 110, -1));

        genus.setEditable(false);
        genus.setBackground(java.awt.SystemColor.activeCaption);
        genus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genusActionPerformed(evt);
            }
        });
        getContentPane().add(genus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 110, -1));

        jLabel3.setForeground(java.awt.SystemColor.windowText);
        jLabel3.setText("Selected");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 60, 30));

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setForeground(java.awt.SystemColor.activeCaption);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 310, 40));

        speciestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speciestxtActionPerformed(evt);
            }
        });
        getContentPane().add(speciestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 120, -1));

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 420, 120, -1));
        getContentPane().add(genustxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 110, -1));

        jLabel1.setForeground(java.awt.SystemColor.windowText);
        jLabel1.setText("Species");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLabel5.setForeground(java.awt.SystemColor.windowText);
        jLabel5.setText("Common Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jLabel6.setForeground(java.awt.SystemColor.windowText);
        jLabel6.setText("Genus");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jPanel1.setBackground(java.awt.SystemColor.activeCaptionBorder);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.textHighlight);
        jLabel8.setText("Edit");
        jPanel1.add(jLabel8);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 350, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/palm.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        jLabel7.setForeground(java.awt.SystemColor.windowText);
        jLabel7.setText("Genus");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainMenu rgf = new MainMenu();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed
    

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Report rgf = new Report();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        verifyFields();
        findPalm();
    }//GEN-LAST:event_searchbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure To Edit??", "Edit Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            PreparedStatement ps;
            ResultSet rs;
            int row = PalmTable.getSelectedRow();
            String selection = PalmTable.getModel().getValueAt(row, 1).toString();
            String selection2 = PalmTable.getModel().getValueAt(row, 2).toString();
            String sql = "Update palm set "
                    +"common_name = '"+nametxt.getText()+"',"
                    +"genus = '"+genustxt.getText()+"',"
                    +"species = '"+speciestxt.getText()+"'"
                    +"where genus = '"+selection+"' AND species = '"+selection2+"';";
                    

            try {
             //Statement pst
             //GET CONECTION
            ps = My_CNX.getConnection().prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Successfully Edited!");
                    DisplayRecord lf = new DisplayRecord();
                    lf.setVisible(true);
                    lf.pack();
                    lf.RefreshbtnActionPerformed(evt);
                    lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Failed to Edit");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure To Delete??", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            PreparedStatement ps;
            ResultSet rs;
            int row = PalmTable.getSelectedRow();
            String selection = PalmTable.getModel().getValueAt(row, 1).toString();
            String selection2 = PalmTable.getModel().getValueAt(row, 2).toString();
            String sql = "DELETE FROM palm where genus = '"+selection+"' AND species = '"+selection2+"';";

            try {
             //Statement pst
             //GET CONECTION
            ps = My_CNX.getConnection().prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Deleted!");
                    DisplayRecord lf = new DisplayRecord();
                    lf.setVisible(true);
                    lf.pack();
                    lf.RefreshbtnActionPerformed(evt);
                    lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Deleted");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void speciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speciesActionPerformed
        int row = PalmTable.getSelectedRow();
        System.out.println(row);
    }//GEN-LAST:event_speciesActionPerformed

    private void genusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genusActionPerformed

    private void PalmTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PalmTableMouseClicked
        PreparedStatement ps;
        ResultSet rs;
        int row = PalmTable.getSelectedRow();
        String selection = PalmTable.getModel().getValueAt(row, 1).toString();
        String selection2 = PalmTable.getModel().getValueAt(row, 2).toString();
        String sql = "SELECT * from palm where genus = '"+selection+"' AND species = '"+selection2+"';";
        try {
             //Statement pst
             //GET CONECTION
        ps = My_CNX.getConnection().prepareStatement(sql);
        rs = ps.executeQuery();
        if(rs.next()){
            genus.setText(rs.getString("genus"));
            species.setText(rs.getString("species"));
            nametxt.setText(rs.getString("common_name"));
            genustxt.setText(rs.getString("genus"));
            speciestxt.setText(rs.getString("species"));
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_PalmTableMouseClicked

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void speciestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speciestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speciestxtActionPerformed


    public void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt){
    
        PreparedStatement ps;
        ResultSet rs;
        String query = "select * from palm";
    
    try
        { 
        ps = My_CNX.getConnection().prepareStatement(query);
        rs = ps.executeQuery();
        DefaultTableModel tm=(DefaultTableModel)PalmTable.getModel();
        tm.setRowCount(0);
        while(rs.next())
    {
    Object o[]={rs.getString("common_name"),rs.getString("genus"), rs.getString("species"), rs.getObject("photo")};
        tm.addRow(o);
    }
    }
    catch(Exception e)
    {   
    JOptionPane.showMessageDialog(this,e);
    }
    }
    
    public boolean verifyFields(){
        String search = txtsearch.getText();
        
        // check empty fields
        if(search.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Keyword!...","Empty Field",2);
            return false;
        }     
        // if everything is ok
        else{
            return true;
        }
    }
    
        public ArrayList<Palm> ListPalm(String ValToSearch)
    {
        ArrayList<Palm> palmList = new ArrayList<Palm>();
        
        Statement st;
        ResultSet rs;
        
        try
        {
            java.sql.Connection conn = My_CNX.getConnection();
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `palm` WHERE CONCAT (`common_name`, `genus`, `species`) LIKE '%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            Palm palm;
            
            while(rs.next())
            {
                palm = new Palm(rs.getString("location"), rs.getString("date"), rs.getString("genus"), rs.getString("species"), rs.getString("common_name"));
            
                palmList.add(palm);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return palmList;
        
    }

        public void findPalm()
    {
        
        ArrayList<Palm> palm = ListPalm(txtsearch.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[] {"Common Name", "Genus", "Species", "Photo"});
        Object[] row = new Object[4];
        
        for (int i = 0; i < palm.size(); i++)
        {
            row[0] = palm.get(i).getName();
            row[1] = palm.get(i).getGenus();
            row[2] = palm.get(i).getSpecies();
            row[3] = palm.get(i).getMyPhoto();
            model.addRow(row);
        }
        PalmTable.setModel(model);
    }
        
    public Boolean update(String id, String name, String genus, String species) {
        //SQL STMT
        String sql = "UPDATE palm SET common_name ='" + name + "',genus='" + genus + "',species='" + species + "' WHERE ID='" + id + "'";

        try {
            //GET COONECTION
            java.sql.Connection conn = My_CNX.getConnection();
            Statement s;

            //STATEMENT
            s = conn.createStatement();

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
      
          //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM palm WHERE ID ='"+id+"'";

        try
        {
            //GET COONECTION
           java.sql.Connection conn = My_CNX.getConnection();

            //STATEMENT
            Statement s=conn.createStatement();

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
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
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PalmTable;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JTextField genus;
    private javax.swing.JTextField genustxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keyword;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField species;
    private javax.swing.JTextField speciestxt;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
