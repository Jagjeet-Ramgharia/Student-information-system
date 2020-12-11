
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jagjeet singh
 */
public class manageStudentsForm extends javax.swing.JFrame {

    /**
     * Creates new form manageStudentsForm
     */
    student std = new student();
    DefaultTableModel model;
    public manageStudentsForm() {
        initComponents();
        std.fillStudentJtable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.DARK_GRAY);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Fname = new javax.swing.JTextField();
        jTextField_Lname = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButtonRemoveStudent = new javax.swing.JButton();
        jButtonAddStudent = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_STD_ID = new javax.swing.JTextField();
        jButtonEditStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Val_Find = new javax.swing.JTextField();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Students");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Birth Date :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jTextField_Fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FnameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, -1));

        jTextField_Lname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, -1));

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 150, -1));

        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 150, 70));

        jButtonRemoveStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 60, 30));

        jButtonAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 20));

        jTextField_STD_ID.setEditable(false);
        jTextField_STD_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_STD_IDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_STD_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, -1));

        jButtonEditStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 60, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "BirthDate", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 810, 350));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 80, 30));

        jTextField_Val_Find.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Val_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Val_FindActionPerformed(evt);
            }
        });
        jTextField_Val_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Val_Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 270, 30));
        jPanel1.add(jDateChooserBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 150, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stdmngform.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled-1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FnameActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
        
        if(jTextField_STD_ID.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "No Student Selected");
        }else{
        int id = Integer.valueOf(jTextField_STD_ID.getText());
        std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
        std.fillStudentJtable(jTable1, "");
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
        MainForm.jLabel_StdCount.setText("Student Count =" + Integer.toString( MyFunction.countData("jTable1")));
        
        jTextField_STD_ID.setText("");
        jTextArea_Address.setText("");
        jTextField_Fname.setText("");
        jTextField_Lname.setText("");
        jTextField_Phone.setText("");
        jRadioButtonFemale.setSelected(false);
        jRadioButtonMale.setSelected(false);
        jDateChooserBirthDate.setDate(null);
        
        }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed

                      AddStudentForm AddSf = new AddStudentForm();
                      AddSf.setVisible(true);
                      AddSf.pack();
                      AddSf.setLocationRelativeTo(null);
                      AddSf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        

    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed
             public boolean verifText()
       {
           if(jTextField_Fname.getText().equals("") || jTextField_Lname.getText().equals("") || jTextField_Phone.getText().equals("") || jTextArea_Address.getText().equals("") ||jTextField_STD_ID.getText().equals("") || jDateChooserBirthDate.getDate() == null)
           {
               JOptionPane.showMessageDialog(null, "No Field Should Be Empty");
               return false;
           }else if(jDateChooserBirthDate.getDate().compareTo(new Date()) > 0)
               
           {
               JOptionPane.showMessageDialog(null, "Enter a Valid Date");
               return false;
           } 
           else {
               return true;
           }
           
           
           
       }
    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
                  String fname = jTextField_Fname.getText();
                  String lname = jTextField_Lname.getText();
                  String phone = jTextField_Phone.getText();
                  String address = jTextArea_Address.getText();
                  int id = Integer.valueOf(jTextField_STD_ID.getText());
                  String sex = "" ;
        if(jRadioButtonFemale.isSelected())
        {
            sex = "Female";
        }else if(jRadioButtonFemale.isSelected())
        {
            sex = "Male" ;
        }
        if(verifText())
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");
            String bdate = dateFormat.format(jDateChooserBirthDate.getDate());
            student std = new student();
            std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address, id, bdate);
           // MainForm.jLabel_StdCount.setText("Student Count =" + Integer.toString( MyFunction.countData("student")));
        }

    }//GEN-LAST:event_jButtonEditStudentActionPerformed
         int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         rowIndex = jTable1.getSelectedRow();
         
         if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
         {
             jRadioButtonMale.setSelected(true);
         }else
         {
             jRadioButtonFemale.setSelected(true);
         }
         jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
         jTextField_Fname.setText(model.getValueAt(rowIndex, 1).toString());
         jTextField_Lname.setText(model.getValueAt(rowIndex, 2).toString());
         jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
         jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
         
         Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-DD").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooserBirthDate.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_Val_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Val_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Val_FindActionPerformed

    private void jTextField_Val_FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyTyped
        
    }//GEN-LAST:event_jTextField_Val_FindKeyTyped

    private void jTextField_Val_FindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyPressed
        
    }//GEN-LAST:event_jTextField_Val_FindKeyPressed

    private void jTextField_Val_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
    }//GEN-LAST:event_jTextField_Val_FindKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
            rowIndex = jTable1.getSelectedRow();
         jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
         jTextField_Fname.setText(model.getValueAt(rowIndex, 1).toString());
         jTextField_Lname.setText(model.getValueAt(rowIndex, 2).toString());
         jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
         jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
         
         if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
         {
             jRadioButtonMale.setSelected(true);
         }else
         {
             jRadioButtonFemale.setSelected(true);
         }
         
          Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-DD").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooserBirthDate.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        }
        
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField_STD_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_STD_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_STD_IDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_Fname;
    private javax.swing.JTextField jTextField_Lname;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_STD_ID;
    private javax.swing.JTextField jTextField_Val_Find;
    // End of variables declaration//GEN-END:variables
}
