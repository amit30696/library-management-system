package library;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author AMIT TIWARI
 */
public class returnbook extends javax.swing.JFrame {
    String image=null;
    String date=null;
    Date showdate=null;
    String s=null;
    public returnbook() {
        initComponents();
         ImageIcon img=new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\lib.png");
         Image img2=img.getImage().getScaledInstance(book.getWidth(), book.getHeight(), 1);
         ImageIcon img3=new ImageIcon(img2);
         book.setIcon(img3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        book = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t9 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(62, 178, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(62, 178, 159));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\home.png")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("IssueBook  Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, 20));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 260, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, 20));

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 260, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Author's Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 20));

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 260, 40));

        jButton3.setBackground(new java.awt.Color(51, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Retrive");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 110, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Student's Id");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, 20));

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 260, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Student's Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 20));

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 260, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Branch");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Date of Issue");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, 20));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.white));
        jPanel3.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 170));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 180, 170));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Student's Photo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, -1, 20));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\submit.png")); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 100, 30));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\Reset.png")); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 100, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Year & Semster");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, 20));

        t7.setEditable(false);
        t7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 260, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Father's Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, 20));

        t6.setEditable(false);
        t6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 260, 40));

        book.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 520));

        t8.setEditable(false);
        t8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        jPanel2.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 260, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Date of Return");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, 20));

        jdate.setDateFormatString("dd/MM/YYYY");
        jdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdateMouseClicked(evt);
            }
        });
        jPanel2.add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 260, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Book");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        t10.setEditable(false);
        t10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 260, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Mobile");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, 20));

        t9.setForeground(new java.awt.Color(51, 0, 255));
        t9.setDateFormatString("dd-MM-YYYY");
        t9.setEnabled(false);
        jPanel2.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new gpslib3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int bookid=Integer.parseInt(t1.getText());
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
            ps=con.prepareStatement("select bookname,authorname,stuid,stuname,fname,year,iod,branch,image,mobile from issuebook where bookid='"+bookid+"'");
            rs=ps.executeQuery();
            if(rs.next())
            {
                String bookname=rs.getString("bookname");
                t2.setText(bookname);
                String author=rs.getString("authorname");
                t3.setText(author);
                String stureg=rs.getString("stuid");
                t4.setText(stureg);
                String name=rs.getString("stuname");
                t5.setText(name);
                String fathername=rs.getString("fname");
                t6.setText(fathername);
                String Branch=rs.getString("branch");
                t7.setText(Branch);
                String semester=rs.getString("year");
                t8.setText(semester);
                Date dateofissue=rs.getDate("iod");
                Format formatter1 = new SimpleDateFormat("dd/MM/YYYY");
                String ss = formatter1.format(dateofissue);
                ((JTextField)t9.getDateEditor().getUiComponent()).setText(ss);
                showdate=new Date();
                Format formatter = new SimpleDateFormat("dd/MM/YYYY");
                String s = formatter.format(showdate);
                ((JTextField)jdate.getDateEditor().getUiComponent()).setText(s);
                image=rs.getString("image");
                String mobile=rs.getString("mobile");
                t10.setText(mobile);
                ImageIcon img=new ImageIcon(image);
                Image img2=img.getImage().getScaledInstance(photo.getWidth(),photo.getHeight(),1);
                ImageIcon img3=new ImageIcon(img2);
               photo.setIcon(img3);

            }
            else
            {
                JOptionPane.showMessageDialog(null,bookid+" is not correct BookId !\n Please enter valid BookId !");
                 t1.setText("");
                 t2.setText("");
                 t3.setText("");
                 t4.setText("");
                 t5.setText("");
                 t6.setText("");
                 t7.setText("");
                 t8.setText("");
                 t9.setDate(null);
                 t10.setText("");
                 jdate.setDate(null);
                 photo.setIcon(null);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_t1ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
                 char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
          evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int bookid=Integer.parseInt(t1.getText());
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
            ps=con.prepareStatement("select bookname,authorname,stuid,stuname,fname,year,iod,branch,image,mobile from issuebook where bookid='"+bookid+"'");
            rs=ps.executeQuery();
            if(rs.next())
            {
                String bookname=rs.getString("bookname");
                t2.setText(bookname);
                String author=rs.getString("authorname");
                t3.setText(author);
                String stureg=rs.getString("stuid");
                t4.setText(stureg);
                String name=rs.getString("stuname");
                t5.setText(name);
                String fathername=rs.getString("fname");
                t6.setText(fathername);
                String Branch=rs.getString("branch");
                t7.setText(Branch);
                String semester=rs.getString("year");
                t8.setText(semester);
                Date dateofissue=rs.getDate("iod");
                Format formatter1 = new SimpleDateFormat("dd/MM/YYYY");
                String ss = formatter1.format(dateofissue);
                ((JTextField)t9.getDateEditor().getUiComponent()).setText(ss);
                 showdate=new Date();
                Format formatter = new SimpleDateFormat("dd/MM/YYYY");
                s = formatter.format(showdate);
                ((JTextField)jdate.getDateEditor().getUiComponent()).setText(s);
                image=rs.getString("image");
                String mobile=rs.getString("mobile");
                t10.setText(mobile);
                 
               ImageIcon img=new ImageIcon(image);
               Image img2=img.getImage().getScaledInstance(photo.getWidth(),photo.getHeight(),1);
               ImageIcon img3=new ImageIcon(img2);
               photo.setIcon(img3);

            }
            else
            {
                JOptionPane.showMessageDialog(null,bookid+" is not correct BookId !\n Please enter valid BookId !");
                 t1.setText("");
                 t2.setText("");
                 t3.setText("");
                 t4.setText("");
                 t5.setText("");
                 t6.setText("");
                 t7.setText("");
                 t8.setText("");
                 t9.setDate(null);
                 t10.setText("");
                 jdate.setDate(null);
                 photo.setIcon(null);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        
    }//GEN-LAST:event_t4ActionPerformed

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t4KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int bookid=Integer.parseInt(t1.getText());
        String bookname=t2.getText();
        String authorname=t3.getText();
        int stuid=Integer.parseInt(t4.getText());
        String stuname=t5.getText();
        String fname=t6.getText();
        String branch=t7.getText();
        String year=t8.getText();
        String doi=((JTextField)t9.getDateEditor().getUiComponent()).getText();
        String date=((JTextField)jdate.getDateEditor().getUiComponent()).getText();
        
        
        String mobile=t10.getText();
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
            ps=con.prepareStatement("insert into returnbook values('"+bookname+"','"+authorname+"','"+stuid+"','"+stuname+"','"+fname+"','"+branch+"','"+year+"','"+image+"','"+mobile+"','"+bookid+"','"+doi+"','"+date+"')");
            rs=ps.executeQuery();
            if(rs.next())
            {
                ps=con.prepareStatement("delete from issuebook where bookid='"+bookid+"'");  
                rs=ps.executeQuery();
                JOptionPane.showMessageDialog(null,"Book return Successfully");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setDate(null);
                t10.setText("");
                jdate.setDate(null);
                photo.setIcon(null);
               

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book  not return Successfully");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setDate(null);
        t10.setText("");
        jdate.setDate(null);
        photo.setIcon(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void jdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdateMouseClicked
           
    }//GEN-LAST:event_jdateMouseClicked

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
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel book;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private com.toedter.calendar.JDateChooser t9;
    // End of variables declaration//GEN-END:variables
}