/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcregstriation;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author root
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
         initComponents();
         
         Thread t1=new Thread(()-> 
                {
               //inserts into history tabel form history file
                    
        File file = new File("history.txt");
        try{
              if(file.exists()){
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            
                        String fname = input.next();
                        String llname =input.next(); 
                        String Id = input.next();
                        String Sex= input.next();
                        String block_no = input.next();
                        String room_no = input.next();
                        String deba = input.next();
                        String pc_brand = input.next();
                        String serial_no = input.next();
                        String phone = input.next();
                        String status = input.next();
                        
	DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String data [] = {fname,llname,Id,Sex,block_no,room_no,deba,pc_brand,serial_no,phone,status};
        model.addRow(data);
	
    }
        input.close();
        }
        else{
	System.out.println("file does not exits");
        }
        }catch(Exception e){
            System.out.println(e);
            
        }
        //end of history
        //table two from database
         jdbc dbc = new jdbc(); 
         try{
             String sql = "select * from computers";
             
             ResultSet rs1 = dbc.s1.executeQuery(sql);
             while(rs1.next()){
                 
                String fname = rs1.getString(3);
                String llname = rs1.getString(2);
                String Id = rs1.getString(1);
                String Sex= rs1.getString(4);
                String block_no = ""+rs1.getInt(5);
                String room_no = ""+rs1.getInt(6);
                String deba = rs1.getString(7);
                String pc_brand = rs1.getString(8);      
                String serial_no = rs1.getString(9);
                String phone = rs1.getString(10);
                DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        String data [] = {fname,llname,Id,Sex,block_no,room_no,deba,pc_brand,serial_no,phone};
        model.addRow(data);
             }
        }catch(Exception e){
            System.out.println(e);
        }
        //end of table two
        try{Thread.sleep(1000);}catch(Exception e){
            
        }
                  });
         t1.start();
         
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adimPanel1 = new javax.swing.JPanel();
        adimPanel2 = new javax.swing.JPanel();
        remSecbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        addSecbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewbtn = new javax.swing.JButton();
        hisbtn = new javax.swing.JButton();
        alertBtn = new javax.swing.JButton();
        adminPanel3 = new javax.swing.JPanel();
        welcomep = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        addSp = new javax.swing.JPanel();
        addbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addtex1 = new javax.swing.JTextField();
        addtex2 = new javax.swing.JTextField();
        addtex3 = new javax.swing.JTextField();
        addtex4 = new javax.swing.JTextField();
        remSp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rembtn = new javax.swing.JButton();
        remuser = new javax.swing.JTextField();
        viwp = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        hisp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        alertPanle = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adimPanel2.setBackground(new java.awt.Color(51, 51, 51));

        remSecbtn.setBackground(new java.awt.Color(204, 204, 255));
        remSecbtn.setText("REMOVE_SECURITY");
        remSecbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remSecbtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGED IN AS ");

        logoutBtn.setBackground(new java.awt.Color(204, 204, 255));
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        addSecbtn.setBackground(new java.awt.Color(204, 204, 255));
        addSecbtn.setText("ADD_SECURITY");
        addSecbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSecbtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/natnael/Pictures/aastulogo.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AASTU PC REGISTRATION SYSTEM");

        viewbtn.setText("view");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        hisbtn.setText("HITORY");
        hisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisbtnActionPerformed(evt);
            }
        });

        alertBtn.setText("ALERT");
        alertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adimPanel2Layout = new javax.swing.GroupLayout(adimPanel2);
        adimPanel2.setLayout(adimPanel2Layout);
        adimPanel2Layout.setHorizontalGroup(
            adimPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adimPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(adimPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adimPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(adimPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adimPanel2Layout.createSequentialGroup()
                                .addComponent(logoutBtn)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adimPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(addSecbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remSecbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewbtn)
                        .addGap(18, 18, 18)
                        .addComponent(hisbtn)
                        .addGap(18, 18, 18)
                        .addComponent(alertBtn)
                        .addContainerGap())))
        );
        adimPanel2Layout.setVerticalGroup(
            adimPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adimPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn))
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adimPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(adimPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adimPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adimPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(remSecbtn)
                        .addComponent(addSecbtn)
                        .addComponent(viewbtn)
                        .addComponent(hisbtn)
                        .addComponent(alertBtn))))
        );

        adminPanel3.setBackground(new java.awt.Color(0, 51, 51));
        adminPanel3.setLayout(new java.awt.CardLayout());

        welcomep.setBackground(new java.awt.Color(0, 0, 255));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("                                         WELCOME ADMIN");

        javax.swing.GroupLayout welcomepLayout = new javax.swing.GroupLayout(welcomep);
        welcomep.setLayout(welcomepLayout);
        welcomepLayout.setHorizontalGroup(
            welcomepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        welcomepLayout.setVerticalGroup(
            welcomepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        adminPanel3.add(welcomep, "card2");

        addSp.setBackground(new java.awt.Color(102, 0, 153));

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FIRST NAME");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LAST NAME");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USER NAME");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PASSWORD");

        addtex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtex2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addSpLayout = new javax.swing.GroupLayout(addSp);
        addSp.setLayout(addSpLayout);
        addSpLayout.setHorizontalGroup(
            addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSpLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(addSpLayout.createSequentialGroup()
                            .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(addSpLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel7)))
                            .addGap(65, 65, 65)
                            .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addtex2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addtex1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addtex3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(addSpLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addtex4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addSpLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(addbtn)))
                .addContainerGap(1334, Short.MAX_VALUE))
        );
        addSpLayout.setVerticalGroup(
            addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSpLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addSpLayout.createSequentialGroup()
                        .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addtex1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(addtex2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addtex3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(addSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(addtex4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(addbtn)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        adminPanel3.add(addSp, "card3");

        remSp.setBackground(new java.awt.Color(102, 102, 0));

        jLabel9.setText("USER NAME");

        rembtn.setText("REMOVE");
        rembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rembtnActionPerformed(evt);
            }
        });

        remuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remuserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout remSpLayout = new javax.swing.GroupLayout(remSp);
        remSp.setLayout(remSpLayout);
        remSpLayout.setHorizontalGroup(
            remSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remSpLayout.createSequentialGroup()
                .addGroup(remSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(remSpLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(remuser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(remSpLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(rembtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        remSpLayout.setVerticalGroup(
            remSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remSpLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(remSpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remuser))
                .addGap(58, 58, 58)
                .addComponent(rembtn)
                .addGap(82, 82, 82))
        );

        adminPanel3.add(remSp, "card4");

        viwp.setBackground(new java.awt.Color(0, 51, 51));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRST NAME", "LAST NAME", "ID", "SEX", "BLOCK_NO", "ROOM_NO", "DEPARTMENT", "PC_BRAND", "SERIAL_NO", "PHONE"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout viwpLayout = new javax.swing.GroupLayout(viwp);
        viwp.setLayout(viwpLayout);
        viwpLayout.setHorizontalGroup(
            viwpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        viwpLayout.setVerticalGroup(
            viwpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1891, Short.MAX_VALUE)
        );

        adminPanel3.add(viwp, "card5");

        hisp.setBackground(new java.awt.Color(102, 102, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRST NAME", "LAST NAME", "ID", "SEX", "BLOCK_NO", "ROOM_NO", "DEPARTMENT", "PC_BRAND", "SERIAL_NO", "PHONE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(10).setHeaderValue("STATUS");
        }

        javax.swing.GroupLayout hispLayout = new javax.swing.GroupLayout(hisp);
        hisp.setLayout(hispLayout);
        hispLayout.setHorizontalGroup(
            hispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        hispLayout.setVerticalGroup(
            hispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1891, Short.MAX_VALUE)
        );

        adminPanel3.add(hisp, "card6");

        alertPanle.setBackground(new java.awt.Color(102, 102, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRST NAME", "LAST NAME", "ID", "SERIAL_NO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout alertPanleLayout = new javax.swing.GroupLayout(alertPanle);
        alertPanle.setLayout(alertPanleLayout);
        alertPanleLayout.setHorizontalGroup(
            alertPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        alertPanleLayout.setVerticalGroup(
            alertPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1891, Short.MAX_VALUE)
        );

        adminPanel3.add(alertPanle, "card6");

        javax.swing.GroupLayout adimPanel1Layout = new javax.swing.GroupLayout(adimPanel1);
        adimPanel1.setLayout(adimPanel1Layout);
        adimPanel1Layout.setHorizontalGroup(
            adimPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adimPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adimPanel1Layout.setVerticalGroup(
            adimPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adimPanel1Layout.createSequentialGroup()
                .addComponent(adimPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adimPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adimPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void remSecbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remSecbtnActionPerformed
        // TODO add your handling code here:
        adminPanel3.removeAll();
        adminPanel3.repaint();
        adminPanel3.revalidate();

        adminPanel3.add(remSp);
        adminPanel3.repaint();
        adminPanel3.revalidate();
        
         
    }//GEN-LAST:event_remSecbtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
         login lg = new login();
        lg.setVisible(true);
        dispose();

    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addSecbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSecbtnActionPerformed
        // TODO add your handling code here:
        adminPanel3.removeAll();
        adminPanel3.repaint();
        adminPanel3.revalidate();

        adminPanel3.add(addSp);
        adminPanel3.repaint();
        adminPanel3.revalidate();
        
    }//GEN-LAST:event_addSecbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        adminPanel3.removeAll();
        adminPanel3.repaint();
        adminPanel3.revalidate();

        adminPanel3.add(viwp);
        adminPanel3.repaint();
        adminPanel3.revalidate();
       
    }//GEN-LAST:event_viewbtnActionPerformed

    private void hisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisbtnActionPerformed
        // TODO add your handling code here:
        adminPanel3.removeAll();
        adminPanel3.repaint();
        adminPanel3.revalidate();

        adminPanel3.add(hisp);
        adminPanel3.repaint();
        adminPanel3.revalidate();
        
        
                
        
    }//GEN-LAST:event_hisbtnActionPerformed

    private void rembtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rembtnActionPerformed
        // TODO add your handling code here:
        jdbc dbc  = new jdbc();
        String remUser = remuser.getText();
       
         try{
              int a = JOptionPane.showConfirmDialog(this,"DO YOU REAL WANT TO DELETE THE SECURITY","CONFORMATION",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
                       if(a==0){
                           String qury = "delete from security where userName = '"+ remUser +"'";
                           dbc.s1.executeUpdate(qury);
                           JOptionPane.showMessageDialog(null,"Sucessfully deleted" +remUser);
                       }
         
            
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,"not deleted");
       }
       rembtnclear(); 
    }//GEN-LAST:event_rembtnActionPerformed

    private void remuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remuserActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        
        if(!(addtex1.getText()).isEmpty()){
            if(!(addtex2.getText()).isEmpty()){
                if(!(addtex3.getText()).isEmpty()){
                    if(!(addtex4.getText()).isEmpty()){
                        register();
                    }else{
                       JOptionPane.showMessageDialog(null,"Please Enter password"); 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please Enter user name");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Please Enter Last Name");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Enter First Name");
        }
        addbtnclear();
    }//GEN-LAST:event_addbtnActionPerformed

    private void alertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertBtnActionPerformed
        // TODO add your handling code here:
         adminPanel3.removeAll();
        adminPanel3.repaint();
        adminPanel3.revalidate();

        adminPanel3.add(alertPanle);
        adminPanel3.repaint();
        adminPanel3.revalidate();
                File file = new File("since.txt");
        try{
              if(file.exists()){
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            
                        String fname = input.next();
                        String llname =input.next(); 
                        String Id = input.next();
                        String serial_no = input.next();
                       
	DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String data [] = {fname,llname,Id,serial_no};
        model.addRow(data);
	
}
input.close();
        }
else{
	System.out.println("file does not exits");
}
        }catch(Exception e){
            System.out.println(e);
            
        }
    }//GEN-LAST:event_alertBtnActionPerformed

    private void addtex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtex2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtex2ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSecbtn;
    private javax.swing.JPanel addSp;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField addtex1;
    private javax.swing.JTextField addtex2;
    private javax.swing.JTextField addtex3;
    private javax.swing.JTextField addtex4;
    private javax.swing.JPanel adimPanel1;
    private javax.swing.JPanel adimPanel2;
    private javax.swing.JPanel adminPanel3;
    private javax.swing.JButton alertBtn;
    private javax.swing.JPanel alertPanle;
    private javax.swing.JButton hisbtn;
    private javax.swing.JPanel hisp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton remSecbtn;
    private javax.swing.JPanel remSp;
    private javax.swing.JButton rembtn;
    private javax.swing.JTextField remuser;
    private javax.swing.JButton viewbtn;
    private javax.swing.JPanel viwp;
    private javax.swing.JPanel welcomep;
    // End of variables declaration//GEN-END:variables

    private void register() {
         jdbc dbc = new jdbc();
        String fname,lname,username,pass; 
       
        fname = addtex1.getText();
        lname = addtex2.getText();
        username= addtex3.getText();
        
        pass = addtex4.getText();
        
       try{
           String qr ="insert into security values('"+fname+"','"+lname+"','"+username+"','"+pass+"')";
           dbc.s1.executeUpdate(qr);
         
            JOptionPane.showMessageDialog(null,"Sucessfully inserted");
            
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,"Security with the same user name exists");
       }
       
}

    private void addbtnclear() {
        addtex1.setText("");
        addtex2.setText("");
        addtex3.setText("");
        addtex4.setText("");
           
        
    }

    private void rembtnclear() {
        remuser.setText("");
    }

   
}
