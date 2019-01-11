package library;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMIT TIWARI
 */
public class lib1 extends javax.swing.JFrame {

    /**
     * Creates new form lib1
     */
    public lib1() {
        initComponents();
        ImageIcon img=new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\gps.jpg");
        Image img2=img.getImage().getScaledInstance(l1.getWidth(),l1.getHeight(),1);
        ImageIcon img3=new ImageIcon(img2);
        l1.setIcon(img3);
        ImageIcon imgg=new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\gpslogo.gif");
        Image imgg2=imgg.getImage().getScaledInstance(l2.getWidth(),l2.getHeight(),1);
        ImageIcon imgg3=new ImageIcon(imgg2);
        l2.setIcon(imgg);
        ImageIcon img11=new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\library.png");
        Image img22=img11.getImage().getScaledInstance(bookshow.getWidth(),bookshow.getHeight(),1);
        ImageIcon img33=new ImageIcon(img22);
        bookshow.setIcon(img33);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        bookshow = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Goverment Polytechnic Saharanpur-Libreriy System");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 2024, 1000));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(62, 178, 159));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 100));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Click For Continue");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, -1, 44));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Government Polytechnic Saharanpur Library System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jp1.setBackground(new java.awt.Color(62, 178, 159));
        jp1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp1.add(bookshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 430, 280));

        l1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 488));

        jPanel2.add(jp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 106, 1200, 490));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(lib1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lib1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lib1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lib1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lib1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookshow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jp1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gpslogo.gif")));
    }
}
