package library;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class searchbook extends javax.swing.JFrame {

    String bookname=null;
    String authorname=null;
    int bookid;
    String show=null;
    String bban=null;
    String bbbn=null;
    int showbookid;
    public searchbook() {
        initComponents();
        hide.setVisible(false);
        jScroll.setVisible(false);
        rbt2.setSelected(true);
        t1.setText("Enter Book Name");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrol = new javax.swing.JPanel();
        hide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t44 = new javax.swing.JTextField();
        t33 = new javax.swing.JTextField();
        t22 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton5 = new javax.swing.JButton();
        t45 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScroll = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rbt2 = new javax.swing.JRadioButton();
        rbt1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrol.setBackground(new java.awt.Color(62, 178, 159));
        jScrol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setBackground(new java.awt.Color(0, 204, 255));
        hide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOOK DETIALS");
        hide.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("AUTHOR'S NAME");
        hide.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("BOOK ID");
        hide.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("BOOK NAME");
        hide.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("BRANCH");
        hide.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        t44.setEditable(false);
        t44.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hide.add(t44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 290, 30));

        t33.setEditable(false);
        t33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hide.add(t33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 290, 30));

        t22.setEditable(false);
        t22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hide.add(t22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 290, 30));

        t11.setEditable(false);
        t11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hide.add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 290, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\gifbook.gif")); // NOI18N
        hide.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 50));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("ISSUE THIS BOOK");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        hide.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 220, 40));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("X");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        hide.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 30, 30));
        hide.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\back.png")); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        hide.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 50, 50));

        t45.setEditable(false);
        t45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hide.add(t45, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 290, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("No. Of Almirah");
        hide.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jScrol.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 570, 350));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Book in Library");
        jScrol.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 44));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\home.png")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jScrol.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 50, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\bookpile3.png")); // NOI18N
        jScrol.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 710));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t1.setFocusCycleRoot(true);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jScrol.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 650, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\sea.jpg")); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jScrol.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, 70, 60));

        jScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "BOOK NAME", "AUTHOR NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        textarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textareaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(textarea);

        jScroll.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 560));

        jScrol.add(jScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 650, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Book Search By");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        buttonGroup1.add(rbt2);
        rbt2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbt2.setText("By Book Name");
        rbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt2MouseClicked(evt);
            }
        });
        jPanel1.add(rbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttonGroup1.add(rbt1);
        rbt1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbt1.setText("By Author Name");
        rbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt1MouseClicked(evt);
            }
        });
        jPanel1.add(rbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jScrol.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 160, 180, 150));

        getContentPane().add(jScrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new gpslib3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
      
        
    }//GEN-LAST:event_t1KeyTyped

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_t1KeyPressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amit","54321");
         ps=con.prepareStatement("select * from issuebook where bookid='"+bookid+"'");
         rs=ps.executeQuery();
         if(rs.next())
         {
             
             JOptionPane.showMessageDialog(null,"This Book Already Issue");
              hide.setVisible(false);
              jScroll.setVisible(true);
         }
        else
         {
        new issuebook().setVisible(true);
        new searchbook().setVisible(false);
        this.setVisible(false);
         }
        }
       catch(Exception ex)
       {
         ex.printStackTrace();
       }
       
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(t1.getText().equals("") || t1.getText().equals("Enter Book Name"))
         {
             JOptionPane.showMessageDialog(null,"Please Enter Valid Book Name!");
             hide.setVisible(false);
         }
        else
        {
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
        hide.setVisible(true);
        jScroll.setVisible(false);
        String book=null;
        String branch=null;
        show=t1.getText();
        book=t1.getText();
        
             try
       {
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amit","54321");
         ps=con.prepareStatement("select * from add_book where book_id='"+showbookid+"'");
         rs=ps.executeQuery();
         if(rs.next())
         {
           bookid=Integer.parseInt(rs.getString("book_id"));
           t11.setText(Integer.toString(bookid));
           book=rs.getString("bookname");
           t22.setText(book);
           authorname=rs.getString("authorname");
           t33.setText(authorname);
           branch=rs.getString("branch");
           t44.setText(branch);
           String almirah=rs.getString("almirah");
           t45.setText(almirah);
         }
         else
         {
            hide.setVisible(false);
            JOptionPane.showMessageDialog(null,"Please Enter Valid Book Name!");
            t1.setText("");
         }
         
        }
       catch(Exception ex)
       {
         ex.printStackTrace();
       }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        hide.setVisible(false);
        jScroll.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
         DefaultTableModel model1=(DefaultTableModel)textarea.getModel();
         model1.setRowCount(0);
        jScroll.setVisible(true);
       String bookname,authorname,bookid,show;
       show=t1.getText();
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
           
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amit","54321");
         if(rbt2.isSelected())
         {
         ps=con.prepareStatement("select  book_id,bookname,authorname from add_book where bookname like '"+show.toUpperCase()+"%'");
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
              model1.addRow(obj);
         }
       
         }
         
         if(rbt1.isSelected())
         {
         ps=con.prepareStatement("select book_id,bookname,authorname from add_book where authorname like '"+show.toUpperCase()+"%'");
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
              model1.addRow(obj);
         }
         }
       }
       catch(Exception ex)
       {
         ex.printStackTrace();
       }
         if(show.equals(""))
             {
                  hide.setVisible(false);
                  jScroll.setVisible(false);
             }

    }//GEN-LAST:event_t1KeyReleased

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        if(t1.getText().equals("Enter Book Name")||t1.getText().equals("By Author Name")||t1.getText().equals("By Book Name"))
        {
        t1.setText("");
        }
    }//GEN-LAST:event_t1MouseClicked

    private void textareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textareaMouseClicked
        // TODO add your handling code here:
        int i=textarea.getSelectedRow();
        String tc=textarea.getModel().getValueAt(i,1).toString();
        showbookid=Integer.parseInt(textarea.getModel().getValueAt(i,0).toString());
        t1.setText(tc);
    }//GEN-LAST:event_textareaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         hide.setVisible(false);
         jScroll.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void rbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt1MouseClicked
        // TODO add your handling code here:
        bban=rbt1.getLabel();
         if(rbt1.isEnabled())
        {
          t1.setText(bban);
          hide.setVisible(false);
        }
    }//GEN-LAST:event_rbt1MouseClicked

    private void rbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt2MouseClicked
        // TODO add your handling code here:
        bbbn=rbt2.getLabel();
        if(rbt2.isEnabled())
        {
          t1.setText(bbbn);
          hide.setVisible(false);
        }
    }//GEN-LAST:event_rbt2MouseClicked

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
            java.util.logging.Logger.getLogger(searchbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jScrol;
    private javax.swing.JPanel jScroll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbt1;
    private javax.swing.JRadioButton rbt2;
    private javax.swing.JTextField t1;
    public javax.swing.JTextField t11;
    private javax.swing.JTextField t22;
    private javax.swing.JTextField t33;
    private javax.swing.JTextField t44;
    private javax.swing.JTextField t45;
    private javax.swing.JTable textarea;
    // End of variables declaration//GEN-END:variables
}
