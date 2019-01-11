package library;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class stureg extends javax.swing.JFrame {

    String path=null;
    String branch=null;
    String gender;
    String year;
    String date;
    public stureg() {
        initComponents();
       ImageIcon img=new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\student.png");
       Image img2=img.getImage().getScaledInstance(stu.getWidth(),stu.getHeight(),1);
       ImageIcon img3=new ImageIcon(img2);
       stu.setIcon(img3);
        setIcon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ct2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ct1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jdate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        but2 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        stu = new javax.swing.JLabel();
        el = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Govterment Polytechnic Saharanpur-Libreriy System-Registration Page");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 186, 166));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 235, 33));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setText("Mother's Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 30));

        t3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 235, 35));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setText("Branch");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 29));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setText("Year & Semmester");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 20));

        ct2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "First Year & First Semmester", "First Year & Second Semmester", "Second Year & Threerd Semmester", "Second Year & Fourth Semmester", "Third Year & Fiveth Semmester", "Third Year & Sixed Semmester" }));
        ct2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ct2ItemStateChanged(evt);
            }
        });
        ct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct2ActionPerformed(evt);
            }
        });
        jPanel1.add(ct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 235, 38));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 25));

        ct1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Computer Science & Enggering", "Morden Office & Management", "PGDCA", "EC" }));
        ct1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ct1ItemStateChanged(evt);
            }
        });
        ct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct1ActionPerformed(evt);
            }
        });
        jPanel1.add(ct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 235, 38));

        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 235, 33));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, 34));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setText("Father's Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, 29));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, 34));

        t5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t5FocusLost(evt);
            }
        });
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t5MouseExited(evt);
            }
        });
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 235, 33));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel9.setText("email-Id");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, 34));

        t4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 235, 33));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel10.setText("Date of Birth");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, 34));

        text.setColumns(20);
        text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 235, 110));

        r1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setText(" Male");
        r1.setFocusPainted(false);
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        r2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setText("Female");
        r2.setFocusPainted(false);
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel12.setText("Mobile Number");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 34));

        l1.setBackground(new java.awt.Color(51, 204, 255));
        l1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 0, 0))));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 156, 151));

        jButton4.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jButton4.setText("Choose Image");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, -1, 36));

        jdate.setDateFormatString("dd/MM/YYYY");
        jdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdateMouseClicked(evt);
            }
        });
        jPanel1.add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 235, 35));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Registration Page");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, 27));

        but2.setBackground(new java.awt.Color(255, 255, 255));
        but2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        but2.setForeground(new java.awt.Color(255, 255, 255));
        but2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\Reset.png")); // NOI18N
        but2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but2.setFocusPainted(false);
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        jPanel1.add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 100, 30));

        but1.setBackground(new java.awt.Color(255, 255, 255));
        but1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        but1.setForeground(new java.awt.Color(255, 255, 255));
        but1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\submit.png")); // NOI18N
        but1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but1.setFocusPainted(false);
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        jPanel1.add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 90, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\home.png")); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, 100, 30));
        jPanel1.add(stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 490));

        el.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        el.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(el, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void email_validation()
    {
      String myemail=t5.getText();
      String email_pattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern=Pattern.compile(email_pattern);
        Matcher matcher=pattern.matcher(myemail);
        if(matcher.matches())
        {
          el.setText("");
        }
        else
        {
         el.setText("please enter valid Email_Id");
        }
       
    }
            
    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void ct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_r2ActionPerformed

    private void ct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf=new JFileChooser();
        int i=jf.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION)
        {
          File f=jf.getSelectedFile();
          path=f.getAbsolutePath();
          ImageIcon img=new ImageIcon(path);
          Image img2=img.getImage().getScaledInstance(l1.getWidth(),l1.getHeight(),1);
          ImageIcon img3=new ImageIcon(img2);
          l1.setIcon(img3);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ct1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ct1ItemStateChanged
        // TODO add your handling code here:
        branch=(String)((JComboBox)evt.getItemSelectable()).getSelectedItem();
    }//GEN-LAST:event_ct1ItemStateChanged

    private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
        gender=r1.getLabel();
    }//GEN-LAST:event_r1MouseClicked

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
        gender=r2.getLabel();
    }//GEN-LAST:event_r2MouseClicked

    private void ct2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ct2ItemStateChanged
        // TODO add your handling code here:
        year=(String)((JComboBox)evt.getItemSelectable()).getSelectedItem();
    }//GEN-LAST:event_ct2ItemStateChanged

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        ct1.setSelectedIndex(0);
        ct2.setSelectedIndex(0);
        jdate.setDate(null);
        t4.setText("");
        r1.setSelected(true);
        r2.setSelected(false);
        t5.setText("");
        text.setText("");
        l1.setIcon(null);
        el.setText("");
    }//GEN-LAST:event_but2ActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        // TODO add your handling code here:
        if(el.getText().equals("please enter valid Email_Id"))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid Email Id!");
        }
        else
        {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String stuname=t1.getText();
        String fname=t2.getText();
        String mname=t3.getText();
        String mono=t4.getText();
        String email=t5.getText();
        String address=text.getText();
        date=((JTextField)jdate.getDateEditor().getUiComponent()).getText();
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
          ps=con.prepareStatement("insert into gpsreg values('"+stuname+"','"+fname+"','"+mname+"','"+branch+"','"+year+"','"+mono+"','"+date+"','"+gender+"','"+email+"','"+address+"',gpsregno.nextVal,'"+path+"')");
          rs=ps.executeQuery();
          if(rs.next())
          {
          ps=con.prepareStatement("select id from gpsreg where stuname='"+stuname+"' and fname='"+fname+"'");
          rs=ps.executeQuery();
          if(rs.next())
          {
        int reg=Integer.parseInt(rs.getString("id"));
        JOptionPane.showMessageDialog(null,"Registration Successfully\n Student's Id is: "+reg);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        ct1.setSelectedIndex(0);
        ct2.setSelectedIndex(0);
        jdate.setDate(null);
        t4.setText("");
        r1.setSelected(true);
        r2.setSelected(false);
        t5.setText("");
        text.setText("");
        l1.setIcon(null);
            }
          }
          else
          {
           JOptionPane.showMessageDialog(null,"Registration Failed");
          }
        }
        catch(Exception ex)
        {
         ex.printStackTrace();
         JOptionPane.showMessageDialog(null,"Please enter all field!");
        }
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
                char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)||t4.getText().length()==10 )
        {
          getToolkit().beep();
          evt.consume();
        }        
    }//GEN-LAST:event_t4KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new gpslib3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)||(c==KeyEvent.VK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
          getToolkit().beep();
          evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)||(c==KeyEvent.VK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
          getToolkit().beep();
          evt.consume();
        }
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)||(c==KeyEvent.VK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
          getToolkit().beep();
          evt.consume();
        }
    }//GEN-LAST:event_t3KeyTyped

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(((c==KeyEvent.VK_SPACE)))
        {
          evt.consume();
        }
    }//GEN-LAST:event_t5KeyTyped

    private void jdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jdateMouseClicked

    private void t5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyReleased
               
    }//GEN-LAST:event_t5KeyReleased

    private void t5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseExited
        // TODO add your handling code here:   
    }//GEN-LAST:event_t5MouseExited

    private void t5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t5FocusLost
               email_validation();
    }//GEN-LAST:event_t5FocusLost

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t5MouseClicked

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stureg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> ct1;
    private javax.swing.JComboBox<String> ct2;
    private javax.swing.JLabel el;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JLabel stu;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gpslogo.gif")));
    }
}
