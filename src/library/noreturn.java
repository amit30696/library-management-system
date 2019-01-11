package library;
import java.sql.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMIT TIWARI
 */
public class noreturn extends javax.swing.JFrame {

    /**
     * Creates new form noreturn
     */
    ArrayList<String> list=new ArrayList<String>();
    public noreturn() {
        initComponents();
        shownoreturnbook();
        send.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nobook = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        send = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(62, 178, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nobook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Name", "Author Name", "Student Id", "Student Name", "Father name", "Branch", "Year & Semester", "Email Id", "Issue Of Date", "Mobile NUmber"
            }
        ));
        jScrollPane1.setViewportView(nobook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1330, 580));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\printing.png")); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 70, 70));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\back.png")); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 60, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List Of Book Who not Return Book in Library");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        send.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        send.setForeground(new java.awt.Color(51, 51, 51));
        send.setText("Click Here for Send Mail");
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\590327a7429ca181824390.gif")); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 110, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new viewstudata().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MessageFormat head=new MessageFormat("List Of Book Who not return In Library");
        MessageFormat foot=new MessageFormat("Dear Student! Please Submit Book in Library");
        try
        {
         nobook.print(JTable.PrintMode.FIT_WIDTH, head, foot);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to print!\n Please try Again !!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      Connection con=null;
      PreparedStatement ps=null;
      ResultSet rs=null;
      try
      {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
       try
      {
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","5432139");
         ps=con.prepareStatement("select bookid,bookname,authorname,stuid,stuname,fname,branch,year,email_id,iod,mobile from issuebook where sysdate-iod>=15");
         rs=ps.executeQuery();
         while(rs.next())
         {
             list.add(rs.getString("email_id"));
         }
         
             final String user="00110011amit@gmail.com";
             final String pass="amit@@@@";
         
              Properties p=System.getProperties();
              p.setProperty("mail.smtp.auth","true");
              p.setProperty("mail.smtp.starttls.enable","true");
              p.put("mail.smtp.ssl.true","smtp.gmail.com");
              p.setProperty("mail.smtp.host","smtp.gmail.com");
              p.setProperty("mail.smtp.port","587");
         
         
              Session s=Session.getInstance(p,new javax.mail.Authenticator() 
              {
                protected PasswordAuthentication getPasswordAuthentication()
                {
                   return new PasswordAuthentication(user,pass);
                }
              }
             );
         try
         {
            MimeMessage m=new MimeMessage(s);
            m.setFrom(new InternetAddress("00110011amit@gmail.com"));
            for(int i=0;i<list.size();i++)
         {
            m.setRecipient(Message.RecipientType.TO,new InternetAddress(list.get(i)));
            m.setSubject("Friend");
            m.setText("Dear Student! I inform you that you issue a book.Plase submit book in library");
            Transport.send(m);
         }
            JOptionPane.showMessageDialog(null,list.size()+" Message send successfully!");
         }
         catch(Exception ex)
         {
           ex.printStackTrace();
         }    
         
         
      }
         catch(Exception ex)
                 {
                     ex.printStackTrace();
                 }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        send.setVisible(true);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        send.setVisible(false);
    }//GEN-LAST:event_jButton3MouseExited
    
    private void shownoreturnbook()
    {
      DefaultTableModel model=(DefaultTableModel)nobook.getModel();
      model.setRowCount(0);
      Connection con=null;
      PreparedStatement ps=null;
      ResultSet rs=null;
      try
      {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
       try
      {
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","5432139");
        ps=con.prepareStatement("select bookid,bookname,authorname,stuid,stuname,fname,branch,year,email_id,iod,mobile from issuebook where sysdate-iod>=15");
        rs=ps.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        int cols=rsmd.getColumnCount();
        while(rs.next())
         {
              Object obj[]=new Object[cols];
              for(int i=0;i<cols;i++)
              {
              obj[i]=rs.getObject(i+1);
              }
              model.addRow(obj);
         }
         
         
      
      
      
      }
       catch(Exception ex)
       {
         ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(noreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(noreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(noreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(noreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new noreturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nobook;
    private javax.swing.JLabel send;
    // End of variables declaration//GEN-END:variables
}
