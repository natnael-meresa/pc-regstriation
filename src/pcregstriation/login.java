
package pcregstriation;

import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

 
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginSecu = new javax.swing.JButton();
        usertext = new javax.swing.JTextField();
        loginadm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(2000, 2000));

        jPanel2.setBackground(new java.awt.Color(35, 35, 72));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/natnael/Pictures/aastulogo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AASTU PC REGISTRATION SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(559, 380));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("USER NAME");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, 30));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("PASSWORD");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 23));

        loginSecu.setText("LOGIN AS SECURITY");
        loginSecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSecuActionPerformed(evt);
            }
        });
        jPanel3.add(loginSecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertextActionPerformed(evt);
            }
        });
        jPanel3.add(usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 148, 32));

        loginadm.setText("LOGIN AS ADMIN");
        loginadm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginadmActionPerformed(evt);
            }
        });
        jPanel3.add(loginadm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        jLabel5.setText("LOGIN FORM");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 120, 30));
        jPanel3.add(userpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 259, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginSecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSecuActionPerformed
        // TODO add your handling code here:
        jdbc dbc = new jdbc();
     String user = usertext.getText();
     String pass = userpass.getText();
    
     
        try {
             String qury = "select * from security";
        rs = dbc.s1.executeQuery(qury);
        boolean chek = false;
        while(rs.next()){
            if(!" ".equals(user)){
            if(user.equals(rs.getString(3) )){
                if(pass.equals(rs.getString(4))){
                    chek = true;
                     main fram = new main();
                     fram.setVisible(true);
                    dispose();
                }
            
            }
            }else{
                JOptionPane.showMessageDialog(null,"please enter user name"); 
               
            }
           
        }
        if(!chek){
                JOptionPane.showMessageDialog(null,"user name does not exist or password does not match");  
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       cleartext();
        
    }//GEN-LAST:event_loginSecuActionPerformed

    private void usertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_usertextActionPerformed

    private void loginadmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadmActionPerformed
        // TODO add your handling code here:
             jdbc dbc = new jdbc();
     String user = usertext.getText();
     String pass = userpass.getText();
     String qury = "select * from admin";
        try {
            
        rs = dbc.s1.executeQuery(qury);
        while(rs.next()){
            if(user.equals(rs.getString(1))){
                if(pass.equals(rs.getString(2))){
                    admin adminFrame = new admin();
                    adminFrame.setVisible(true);
                    dispose();
                }
                else{
           JOptionPane.showMessageDialog(null,"wrong pass word");  
           break;
            }
            }
            else{
           JOptionPane.showMessageDialog(null,"user name does not exist");
           break;
            }
        }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    cleartext();
        
    }//GEN-LAST:event_loginadmActionPerformed

   
 ResultSet rs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginSecu;
    private javax.swing.JButton loginadm;
    private javax.swing.JPasswordField userpass;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables

    private void cleartext() {
    usertext.setText("");
    userpass.setText("");
    }
}
