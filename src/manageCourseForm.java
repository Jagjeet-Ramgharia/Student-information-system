
import java.awt.Color;
import java.util.Date;
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
public class manageCourseForm extends javax.swing.JFrame {

    /**
     * Creates new form manageCourseForm
     */
    course c = new course();
    DefaultTableModel model;
    public manageCourseForm() {
        initComponents();
        model = (DefaultTableModel)coursetable.getModel();
        c.fillCourseJtable(coursetable);
        coursetable.setRowHeight(30);
        coursetable.setShowGrid(true);
        coursetable.setSelectionBackground(Color.DARK_GRAY);
        coursetable.setGridColor(Color.yellow);
        
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
        jLabel4 = new javax.swing.JLabel();
        jTextField_CourseLabel = new javax.swing.JTextField();
        hours = new javax.swing.JSpinner();
        jButtonAddCourse = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursetable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField_CourseId = new javax.swing.JTextField();
        jButtonEditCourse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Course");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hours :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jTextField_CourseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_CourseLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CourseLabelActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_CourseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, -1));

        hours.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours.setModel(new javax.swing.SpinnerNumberModel(1, 1, 300, 1));
        jPanel1.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 62, -1));

        jButtonAddCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        jButtonAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCourseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 60, 30));

        jButtonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 60, 30));

        coursetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Course", "Hours"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        coursetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(coursetable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 810, 340));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jTextField_CourseId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_CourseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CourseIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_CourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, -1));

        jButtonEditCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        jButtonEditCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditCourseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 60, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled-1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stdmngform.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 543));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCourseActionPerformed
                             
                      addCourseForm Addcf = new addCourseForm();
                      Addcf.setVisible(true);
                      Addcf.pack();
                      Addcf.setLocationRelativeTo(null);
                      Addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



    }//GEN-LAST:event_jButtonAddCourseActionPerformed

  
    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        this.dispose();
        //        if(jTextField_STD_ID.getText().equals(""))
        //        {
            //            JOptionPane.showMessageDialog(null, "No Student Selected");
            //        }else{
            //            int id = Integer.valueOf(jTextField_STD_ID.getText());
            //            std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
            //            std.fillStudentJtable(jTable1, "");
            //            jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
            //            std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
            //            MainForm.jLabel_StdCount.setText("Student Count =" + Integer.toString( MyFunction.countData("student")));
            //
            //            jTextField_STD_ID.setText("");
            //            jTextArea_Address.setText("");
            //            jTextField_Fname.setText("");
            //            jTextField_Lname.setText("");
            //            jTextField_Phone.setText("");
            //            jRadioButtonFemale.setSelected(false);
            //            jRadioButtonMale.setSelected(false);
            //            jDateChooserBirthDate.setDate(null);
            //
            //        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jTextField_CourseLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CourseLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CourseLabelActionPerformed

    private void jTextField_CourseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CourseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CourseIdActionPerformed
               public boolean verifText()
       {
           return false;
       }
    private void jButtonEditCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditCourseActionPerformed
       int courseid = Integer.valueOf(jTextField_CourseId.getText());
       String courselabel = jTextField_CourseLabel.getText();
       if(verifText()){
       c.insertUpdateDeleteStudent('c', null, courselabel, courseid);
           
       }
    }//GEN-LAST:event_jButtonEditCourseActionPerformed
        int rowIndex;
    private void coursetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursetableMouseClicked
        rowIndex = coursetable.getSelectedRow();
        jTextField_CourseId.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_CourseLabel.setText(model.getValueAt(rowIndex, 1).toString());
    }//GEN-LAST:event_coursetableMouseClicked

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
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable coursetable;
    private javax.swing.JSpinner hours;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddCourse;
    private javax.swing.JButton jButtonEditCourse;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_CourseId;
    private javax.swing.JTextField jTextField_CourseLabel;
    // End of variables declaration//GEN-END:variables

   
}
