/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author student
 */
public class previous extends javax.swing.JInternalFrame {

    /**
     * Creates new form previous
     */
    connection connect;
    public previous() {
        initComponents();
    connect=new connection();
        date(); 
           TXTNAME.setText(usernME.nm);
    
    }

    public void date(){
    Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String today = formatter.format(date);
       lbl_date.setText(today); 
       
        
        }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXTNAME = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_date = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1160, 460));
        getContentPane().setLayout(null);
        getContentPane().add(TXTNAME);
        TXTNAME.setBounds(540, 30, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date_icon.png"))); // NOI18N
        jLabel2.setText("Current Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 90, 190, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date_icon.png"))); // NOI18N
        jLabel3.setText("Previous Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 160, 190, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 230, 620, 190);

        lbl_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_dateActionPerformed(evt);
            }
        });
        getContentPane().add(lbl_date);
        lbl_date.setBounds(540, 100, 160, 40);

        txt_date.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txt_date);
        txt_date.setBounds(540, 170, 160, 40);

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-find-icon (1).png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 160, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin-icon.png"))); // NOI18N
        jLabel4.setText("User Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 30, 160, 40);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 0, 860, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1170, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        if(TXTNAME.getText().equals("admin")){
//         
             Date d=new Date();
        if(txt_date.getDate().before(d)){  
        try{
//            
           DefaultTableModel df=new DefaultTableModel();
//           
           df.addColumn("Event_ID");
           df.addColumn("user_name");
           df.addColumn("Event_Title");
           df.addColumn("Event_Date");
           df.addColumn("Event_Time");
           df.addColumn("Event_Color");
           df.addColumn("Event_Description"); 
//            
//           
          ResultSet rs=connection.stat.executeQuery("select Event_ID,user_name,Event_Title,Event_Date,Event_Time,Event_Color,Event_Description  from tbl_event where Event_Date between '"+((JTextField)txt_date.getDateEditor().getUiComponent()).getText()+"' and '"+lbl_date.getText()+"'");
        while(rs.next()){
          df.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"),rs.getString("Event_Title"),rs.getString("Event_Date"),rs.getString("Event_Time"),rs.getString("Event_Color"),rs.getString("Event_Description")});
        }
          jTable1.setModel(df);
//           
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex);
        }
//      
//            
        }
       else{
        
        JOptionPane.showMessageDialog(this, "invalid Selected Date");
                
        }
//            
//            
        }
        else{
      Date d=new Date();
        if(txt_date.getDate().before(d)){  
        try{
            
           DefaultTableModel df=new DefaultTableModel();
           
           df.addColumn("Event_ID");
           df.addColumn("user_name");
           df.addColumn("Event_Title");
           df.addColumn("Event_Date");
           df.addColumn("Event_Time");
           df.addColumn("Event_Color");
           df.addColumn("Event_Description"); 
            
           
          ResultSet rs=connection.stat.executeQuery("select Event_ID,user_name,Event_Title,Event_Date,Event_Time,Event_Color,Event_Description  from tbl_event where user_name='"+TXTNAME.getText()+"'and Event_Date between '"+((JTextField)txt_date.getDateEditor().getUiComponent()).getText()+"' and '"+lbl_date.getText()+"'");
        while(rs.next()){
          df.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"),rs.getString("Event_Title"),rs.getString("Event_Date"),rs.getString("Event_Time"),rs.getString("Event_Color"),rs.getString("Event_Description")});
        }
          jTable1.setModel(df);
           
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex);
        }
//       
     
     } 
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Date ");
        }
        }
     
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_dateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTNAME;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lbl_date;
    private com.toedter.calendar.JDateChooser txt_date;
    // End of variables declaration//GEN-END:variables
}