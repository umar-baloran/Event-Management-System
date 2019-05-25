package newproject;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




//main class start
public class mainp extends javax.swing.JFrame {
    
    //    making object   
   
      home hm;
    myevents me=new myevents();
    previous prv=new previous();
    create_event ce=new create_event();
    updateevents ue=new updateevents();
    reporting rp=new reporting();
    connection objcon;
    //    making object   
    
    public mainp() {
        initComponents();
        
//    making object    
    hm=new home();
    objcon=new connection();
   
    //    making object 
  homepanel();
     timedate();

    }
    public void homepanel(){
       jDesktopPane1.add(hm);
       hm.show();
       txtname.setText(usernME.nm);
    
    adminpan();
    
    }
    public void adminpan(){
        
    if(txtname.getText().equals("admin")){
        jButton10.show();
        jButton9.show();
        newevtbttn.hide();
        updateevtbttn.hide();
        
        
    }
    
    else{
        
        jButton10.hide();
        jButton9.hide();
        updateevtbttn.show();
        newevtbttn.show();
    }
    
    }
    
    
    
//date and time funtion
//    public void timedate(){
//    Thread t=new Thread(){
//            @Override
//   public void run(){ 
//  
//   for(;;){    
//   Calendar cc=new GregorianCalendar();
//   
//   int h=cc.get(cc.HOUR);
//   int mn=cc.get(cc.MINUTE);
//   int s=cc.get(cc.SECOND);
//   
//   
//   
//   int yy=cc.get(Calendar.YEAR);
//   int m=cc.get(Calendar.MONTH)+1;
//   int d=cc.get(Calendar.DATE);
//   
//   lt.setText(h+":"+mn+":"+s);
//   ld.setText(yy+"-"+m+"-"+d);
//       try {
//           sleep(1000);
//       } catch (InterruptedException ex) {
//           Logger.getLogger(mainpanel.class.getName()).log(Level.SEVERE, null, ex);
//       }
//   }
//   }
//            };
//    t.start();  
//          }
    
     public void timedate() {
        Thread t=new Thread(){
         //
        // Formatting date with full day and month name and show time up to
        // milliseconds with AM/PM
        //
            public void run(){
        for(;;){  
           
            
         Date date = Calendar.getInstance().getTime();  
        
        DateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        DateFormat form = new SimpleDateFormat("EEE, dd MMMM yyyy");
        String today = formatter.format(date);
        String aaj = form.format(date);
        
        lt.setText(today);
        ld.setText(aaj);
         
       
                    try {
                        sleep(1000);
                        try{
                            ResultSet rs=connection.stat.executeQuery("select Event_ID,user_name,Event_Title,Event_Date,Event_Time,Event_Color,Event_Description from tbl_event where Event_Date=CONVERT (VARCHAR(10),GETDATE(),121) AND Event_Time='"+lt.getText()+"'  ");
                        if(rs.next())
                        {
                            alarm ar=new alarm();
                            ar.play();
                            JOptionPane.showMessageDialog(null, "Reminder"+" ("+rs.getString("Event_Title")+")");
                        }
                        
                        
                        }
                        catch(Exception ex){}
                        
                        
                        
                        
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(mainp.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
            }
        };
        t.start();
    } 
    
    //date and time funtion
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        ld = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        newevtbttn = new javax.swing.JButton();
        updateevtbttn = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Management System");
        setMinimumSize(new java.awt.Dimension(1155, 730));
        setPreferredSize(new java.awt.Dimension(1155, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        ld.setBackground(new java.awt.Color(255, 255, 255));
        ld.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ld.setForeground(new java.awt.Color(255, 255, 255));
        ld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ld.setText("   -    -      -");
        ld.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(237, 205, 206), new java.awt.Color(237, 205, 206), null));
        ld.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ld);
        ld.setBounds(790, 70, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock_iconn.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(750, 10, 40, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar_iconn.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setIconTextGap(0);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 60, 32, 40);

        lt.setBackground(new java.awt.Color(255, 255, 255));
        lt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lt.setForeground(new java.awt.Color(255, 255, 255));
        lt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lt.setText("   :    :    :");
        lt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(237, 205, 206), new java.awt.Color(237, 205, 206), null));
        lt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lt);
        lt.setBounds(790, 20, 100, 30);

        jPanel1.setBackground(new java.awt.Color(105, 41, 41));
        jPanel1.setForeground(new java.awt.Color(185, 145, 215));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/System-Home-icon.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setPreferredSize(new java.awt.Dimension(169, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(6, 32, 140, 47);

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-icon (1).png"))); // NOI18N
        jButton2.setText("My Event");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setPreferredSize(new java.awt.Dimension(169, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(156, 32, 160, 47);

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Product-sale-report-icon.png"))); // NOI18N
        jButton6.setText("Reporting");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setPreferredSize(new java.awt.Dimension(169, 41));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(860, 30, 150, 50);

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton5.setText("Log Out");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setPreferredSize(new java.awt.Dimension(169, 41));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1020, 30, 130, 50);

        jButton7.setBackground(new java.awt.Color(204, 0, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-icon (1).png"))); // NOI18N
        jButton7.setText("Previous Event");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(330, 30, 180, 50);

        jButton9.setBackground(new java.awt.Color(204, 0, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-delete.png"))); // NOI18N
        jButton9.setText("Delete User");
        jButton9.setMaximumSize(new java.awt.Dimension(141, 41));
        jButton9.setMinimumSize(new java.awt.Dimension(141, 41));
        jButton9.setPreferredSize(new java.awt.Dimension(169, 41));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(520, 30, 160, 47);

        newevtbttn.setBackground(new java.awt.Color(204, 0, 204));
        newevtbttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newevtbttn.setForeground(new java.awt.Color(255, 255, 255));
        newevtbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/104943-3d-glossy-orange-orb-icon-alphanumeric-plus-sign-solid.png"))); // NOI18N
        newevtbttn.setText("New Event");
        newevtbttn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newevtbttn.setPreferredSize(new java.awt.Dimension(169, 41));
        newevtbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newevtbttnActionPerformed(evt);
            }
        });
        jPanel1.add(newevtbttn);
        newevtbttn.setBounds(520, 30, 150, 50);

        updateevtbttn.setBackground(new java.awt.Color(204, 0, 204));
        updateevtbttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateevtbttn.setForeground(new java.awt.Color(255, 255, 255));
        updateevtbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system-software-update.png"))); // NOI18N
        updateevtbttn.setText("Update Event");
        updateevtbttn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updateevtbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateevtbttnActionPerformed(evt);
            }
        });
        jPanel1.add(updateevtbttn);
        updateevtbttn.setBounds(680, 30, 170, 50);

        jButton10.setBackground(new java.awt.Color(204, 0, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system-software-update.png"))); // NOI18N
        jButton10.setText("Update User");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(690, 30, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 580, 1160, 90);
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 120, 1160, 460);

        jButton8.setBackground(new java.awt.Color(204, 0, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Change Password");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(900, 30, 200, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/event_banner_txt.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 40, 510, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/event_banner.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1160, 120);

        txtname.setText("jTextField1");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(960, 70, 100, 30);

        jMenu1.setText("File");

        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Log out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Print");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem6.setText("Copy");
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("Cut");
        jMenu2.add(jMenuItem5);

        jMenuItem7.setText("Paste");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Windows");

        jMenuItem8.setText("My Event");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("New Event");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Update Event");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Reporting");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
//       create event menuitem
        
        
     
        jDesktopPane1.removeAll();
     jDesktopPane1.add(ce);
     ce.show();
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
//       update event menuitem 
        
     
      
        jDesktopPane1.removeAll();
     jDesktopPane1.add(ue);
     ue.show();
        
        
      
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void newevtbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newevtbttnActionPerformed
        //       create event button 
        
       
        jDesktopPane1.removeAll();
     jDesktopPane1.add(ce);
     ce.show();
        
        
    }//GEN-LAST:event_newevtbttnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          //       myevent  button  
       
        jDesktopPane1.removeAll();
     jDesktopPane1.add(me);
     me.show();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateevtbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateevtbttnActionPerformed
          //       update event button 
       
        
        jDesktopPane1.removeAll();
     jDesktopPane1.add(ue);
     ue.show();
        
        
    }//GEN-LAST:event_updateevtbttnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           //      home button 
        
      
      jDesktopPane1.removeAll();
      
       jDesktopPane1.add(hm);
     hm.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           //       reporting button 
        
        
        jDesktopPane1.removeAll();
     jDesktopPane1.add(rp);
     rp.show();
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           //       home menuitem
        
   jDesktopPane1.removeAll();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //       exit menuitem
        System.exit(0);
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
     //      myevent menuitem
        
        
        jDesktopPane1.removeAll();
     jDesktopPane1.add(me);
     me.show();
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       //       reporting menuitem
        
        jDesktopPane1.removeAll();
     jDesktopPane1.add(rp);
     rp.show();
        
        
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //    logout button
        
        int a=JOptionPane.showConfirmDialog(this, "sure you want to LOgOut","",JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
             loginform lf=new loginform();
        this.dispose();
        lf.show();
        }        
        
       
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      
        //     logout button
        loginform lf=new loginform();
        this.dispose();
        lf.show();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // previous button:
     
       jDesktopPane1.removeAll();
        jDesktopPane1.add(prv);
        prv.show();
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        password pas=new password();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(pas);
        pas.show();
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
     update_user us=new update_user();
     jDesktopPane1.removeAll();
     jDesktopPane1.add(us);
     us.show();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        delete_user du=new delete_user();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(du);
        du.show();
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mainp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ld;
    private javax.swing.JLabel lt;
    private javax.swing.JButton newevtbttn;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton updateevtbttn;
    // End of variables declaration//GEN-END:variables
}
