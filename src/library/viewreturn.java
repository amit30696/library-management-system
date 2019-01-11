package library;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class viewreturn extends javax.swing.JFrame implements MouseListener{
    int count=0;
    JCheckBox cb[]=null;
    ArrayList list=new ArrayList();
    String s=null;
    int i;
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public viewreturn() {
          initComponents();
         
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
             ps=con.prepareStatement("select * from returnbook");
             rs=ps.executeQuery();
             while(rs.next())
             {
                count=+count;
                list.add(rs.getString("bookid"));
             }
             
             p2.setLayout(new GridLayout(count,9));
             ps=con.prepareStatement("select * from returnbook");
             rs=ps.executeQuery();
             JLabel l22=new JLabel("Book Id");
             p2.add(l22);
             JLabel l33=new JLabel("Book Name");
             p2.add(l33);
             JLabel l44=new JLabel("Author Name");
             p2.add(l44);
             JLabel l55=new JLabel("Student Id");
             p2.add(l55);
             JLabel l66=new JLabel("Student Name");
             p2.add(l66);
             JLabel l77=new JLabel("Branch");
             p2.add(l77);
             JLabel l88=new JLabel("Year & Semester");
             p2.add(l88);
             JLabel l99=new JLabel("Date of Issue");
             p2.add(l99);
             JLabel l10=new JLabel("Date of Return");
             p2.add(l10);
           
             cb=new JCheckBox[list.size()];
             for(int i=0;i<list.size();i++)
             {
                 cb[i]=new JCheckBox((String)list.get(i));
             }
             int i=0;
             while(rs.next())
             {
                  
                  p2.add(cb[i]);
                  cb[i].addMouseListener(this);
                  p2.add(new JLabel(rs.getString("bookname")));
                  p2.add(new JLabel(rs.getString("author")));
                  p2.add(new JLabel(rs.getString("stuid")));
                  p2.add(new JLabel(rs.getString("name")));
                  p2.add(new JLabel(rs.getString("branch")));
                  p2.add(new JLabel(rs.getString("year")));
                  p2.add(new JLabel(rs.getString("doi")));
                  p2.add(new JLabel(rs.getString("dor")));
                  i++;
             }
             
           }
           catch(Exception ex)
           {
           ex.printStackTrace();
           }         
          
           
          if(list.size()>=500)
          {
             try
                {
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","5432139");
                ps=con.prepareStatement("delete from returnbook");
                rs=ps.executeQuery();
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
          }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(62, 178, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Return Book Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, 30));

        p2.setBackground(new java.awt.Color(204, 204, 204));
        p2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 51)));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(p2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1340, 510));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\back.png")); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 50, 50));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 100, 40));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\Reset.png")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new viewstudata().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
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
                  for(int i=0;i<list.size();i++)
               {
                   if(cb[i].isSelected())
               {
                ps=con.prepareStatement("delete from returnbook where bookid='"+cb[i].getText()+"'");
                rs=ps.executeQuery();
               }
               }
                if(rs.next())
                {
                    ArrayList l1=new ArrayList();
                       for(int i=0;i<list.size();i++)
               {
                   if(cb[i].isSelected())
               {
                    l1.add(cb[i].isSelected());
               }
               }
                 JOptionPane.showMessageDialog(null,+l1.size()+" rows deleted successfully");
                 new viewreturn().setVisible(true);
                 this.setVisible(false);
                }
                else
                 {
                 JOptionPane.showMessageDialog(null," Not  deleted successfully");
                 }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
          
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewreturn().setVisible(true);
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
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables

    
    public void mouseClicked(MouseEvent e) {
     
        
    }

    
    public void mousePressed(MouseEvent e) {
        
    }

    
    public void mouseReleased(MouseEvent e) {
        
    }

    
    public void mouseEntered(MouseEvent e) {
        
    }

    
    public void mouseExited(MouseEvent e) {
        
    }
}
