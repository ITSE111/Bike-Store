/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bike.store;

import java.awt.Toolkit;
//import static javax.swing.UIManager.get;

/**
 *
 * @author HP
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Log In");
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
        logo = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        text_login = new javax.swing.JTextField();
        sing_button = new javax.swing.JButton();
        sign_up = new javax.swing.JLabel();
        forgot_password = new javax.swing.JLabel();
        password_text = new javax.swing.JPasswordField();
        name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(249, 242, 220));

        panel2.setBackground(new java.awt.Color(249, 242, 220));
        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));

        welcome.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(23, 30, 56));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("WELCOME");

        text_login.setBackground(new java.awt.Color(249, 242, 220));
        text_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_login.setForeground(new java.awt.Color(23, 30, 56));
        text_login.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_login.setToolTipText("");
        text_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 132, 75), 1, true));
        text_login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text_login.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        text_login.setName(""); // NOI18N
        text_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_loginActionPerformed(evt);
            }
        });

        sing_button.setBackground(new java.awt.Color(230, 132, 75));
        sing_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sing_button.setForeground(new java.awt.Color(23, 30, 56));
        sing_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Bike Store\\icons\\bicycle color 32px.png")); // NOI18N
        sing_button.setText("Log IN");
        sing_button.setBorder(null);
        sing_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sing_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sing_buttonActionPerformed(evt);
            }
        });

        sign_up.setForeground(new java.awt.Color(23, 30, 56));
        sign_up.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign_up.setText("Sign Up");
        sign_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_upMouseClicked(evt);
            }
        });

        forgot_password.setForeground(new java.awt.Color(23, 30, 56));
        forgot_password.setText("Forgot your password?");
        forgot_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(253, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(forgot_password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sign_up))
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(sing_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(sing_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgot_password)
                    .addComponent(sign_up))
                .addGap(21, 21, 21))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Bike Store\\icons\\logo log in.png")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo)
                        .addContainerGap(400, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(logo)
                .addGap(25, 25, 25)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_loginActionPerformed

    private void sing_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sing_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sing_buttonActionPerformed

    private void password_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textActionPerformed

    private void sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseClicked
        sign_up sign= new sign_up();
        sign.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sign_upMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgot_password;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel name;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JLabel sign_up;
    private javax.swing.JButton sing_button;
    private javax.swing.JTextField text_login;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bike-shop color.png")));
    }
}