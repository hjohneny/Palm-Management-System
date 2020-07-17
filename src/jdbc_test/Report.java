package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Report extends javax.swing.JFrame 
{
    public Report() 
    {
        initComponents();
        findPalm();
    }
    
    public void generateReport()
    {
       setVisible(true);
       TableModel model1 = PalmTable.getModel();
       int index[] = PalmTable.getSelectedRows();
       
       Object[] row = new Object[5];
       GenerateReport gr = new GenerateReport();
       DefaultTableModel model2 =  (DefaultTableModel)gr.SummaryReportTable.getModel();
       
       for (int i = 0; i < index.length; i++)
       {
           row[0] = model1.getValueAt(index[i], 0);
           row[1] = model1.getValueAt(index[i], 1);
           row[2] = model1.getValueAt(index[i], 2);
           row[3] = model1.getValueAt(index[i], 3);
           row[4] = model1.getValueAt(index[i], 4);
           
           model2.addRow(row);
       }
       
       gr.setVisible(true);
    }
        
    public ArrayList<Palm> ListPalm(String ValToSearch)
    {
        //String startdate = initialdate.getDateFormatString();
        //String end = enddate.getDateFomateString();
        ArrayList<Palm> palmList = new ArrayList<Palm>();
        
        Statement st;
        ResultSet rs;
        
        try
        {
            Connection conn = My_CNX.getConnection();
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `palm` WHERE CONCAT (`location`, `date`) LIKE '%"+ValToSearch+"%'";
            //String searchQuery = "SELECT * FROM 'palm' WHERE ('date' BETWEEN '%"+startdate+"' AND '%"+endd+"%')";
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
        model.setColumnIdentifiers(new Object[] {"Location", "Date", "Genus", "Species", "Common Name"});
        Object[] row = new Object[5];
        
        for (int i = 0; i < palm.size(); i++)
        {
            row[0] = palm.get(i).getLocation();
            row[1] = palm.get(i).getDate();
            row[2] = palm.get(i).getgenus();
            row[3] = palm.get(i).getspecies();
            row[4] = palm.get(i).getName();
            model.addRow(row);
        }
        PalmTable.setModel(model);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PalmTable = new javax.swing.JTable();
        jButton_generate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        enddate = new com.toedter.calendar.JDateChooser();
        initialdate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        PalmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PalmTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, 626, 239));

        jButton_generate.setText("Generate Report");
        jButton_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel2.setForeground(java.awt.SystemColor.text);
        jLabel2.setText("Filter by location:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, -1));

        jLabel3.setForeground(java.awt.SystemColor.windowText);
        jLabel3.setText("Filter by date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 6, -1, -1));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 28, 229, -1));

        enddate.setDateFormatString("y-MM-d");
        jPanel1.add(enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 58, 205, 24));

        initialdate.setDateFormatString("y-MM-d");
        jPanel1.add(initialdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 28, 205, 24));

        jLabel4.setForeground(java.awt.SystemColor.windowText);
        jLabel4.setText("from: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 32, -1, -1));

        jLabel5.setForeground(java.awt.SystemColor.windowText);
        jLabel5.setText("till: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 58, -1, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/palm.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 640, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed

        findPalm();
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generateActionPerformed
 
        generateReport();
    }//GEN-LAST:event_jButton_generateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DisplayRecord lf = new DisplayRecord();
        lf.setVisible(true);
        lf.pack();
        lf.RefreshbtnActionPerformed(evt);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PalmTable;
    private com.toedter.calendar.JDateChooser enddate;
    private com.toedter.calendar.JDateChooser initialdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_generate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
