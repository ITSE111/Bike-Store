/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bike.store;

import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class sign_up extends javax.swing.JFrame {

    /**
     * Creates new form sign_up
     */
    public sign_up() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Sign Up");
        this.setLocationRelativeTo(null);
        this.setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        text_signUp = new javax.swing.JTextField();
        singUp_button = new javax.swing.JButton();
        password_text = new javax.swing.JPasswordField();
        name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        password_text2 = new javax.swing.JPasswordField();
        re_password = new javax.swing.JLabel();
        logIn = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(249, 242, 220));

        panel2.setBackground(new java.awt.Color(249, 242, 220));
        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));

        text_signUp.setBackground(new java.awt.Color(249, 242, 220));
        text_signUp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_signUp.setForeground(new java.awt.Color(23, 30, 56));
        text_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_signUp.setToolTipText("");
        text_signUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));
        text_signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text_signUp.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        text_signUp.setName(""); // NOI18N
        text_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_signUpActionPerformed(evt);
            }
        });

        singUp_button.setBackground(new java.awt.Color(230, 132, 75));
        singUp_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        singUp_button.setForeground(new java.awt.Color(23, 30, 56));
        singUp_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Bike Store\\icons\\bicycle color 32px.png")); // NOI18N
        singUp_button.setText("Sign Up");
        singUp_button.setBorder(null);
        singUp_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        singUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUp_buttonActionPerformed(evt);
            }
        });

        password_text.setBackground(new java.awt.Color(249, 242, 220));
        password_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_text.setForeground(new java.awt.Color(23, 30, 56));
        password_text.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password_text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));
        password_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(23, 30, 56));
        name.setText("Name");

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(23, 30, 56));
        password.setText("Password");

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(23, 30, 56));
        email.setText("Email");

        emailtext.setBackground(new java.awt.Color(249, 242, 220));
        emailtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailtext.setForeground(new java.awt.Color(23, 30, 56));
        emailtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailtext.setToolTipText("");
        emailtext.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));
        emailtext.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailtext.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        emailtext.setName(""); // NOI18N
        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });

        password_text2.setBackground(new java.awt.Color(249, 242, 220));
        password_text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_text2.setForeground(new java.awt.Color(23, 30, 56));
        password_text2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password_text2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));
        password_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_text2ActionPerformed(evt);
            }
        });

        re_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        re_password.setForeground(new java.awt.Color(23, 30, 56));
        re_password.setText("Re-enter password");

        logIn.setForeground(new java.awt.Color(23, 30, 56));
        logIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logIn.setText("Log In");
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(181, 181, 181))
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(text_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(re_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(singUp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(email)
                .addGap(3, 3, 3)
                .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(text_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(re_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(password_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(singUp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        logo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Bike Store\\icons\\logo log in.png")); // NOI18N
        logo2.setText("jLabel2");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_signUpActionPerformed

    private void singUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUp_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singUp_buttonActionPerformed

    private void password_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textActionPerformed

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed

    private void password_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_text2ActionPerformed

    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
        LogIn log =new LogIn();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logInMouseClicked

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel logIn;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel name;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JPasswordField password_text2;
    private javax.swing.JLabel re_password;
    private javax.swing.JButton singUp_button;
    private javax.swing.JTextField text_signUp;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
           setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bike-shop color.png")));
    
       }
}