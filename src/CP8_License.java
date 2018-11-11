
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CP8_License extends javax.swing.JFrame {
    public CP8_License() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        B1 = new javax.swing.JButton();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        R1 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        R4 = new javax.swing.JRadioButton();
        T1 = new javax.swing.JTextField();
        L6 = new javax.swing.JLabel();
        R5 = new javax.swing.JRadioButton();
        R6 = new javax.swing.JRadioButton();
        R7 = new javax.swing.JRadioButton();
        R8 = new javax.swing.JRadioButton();
        L7 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        R9 = new javax.swing.JRadioButton();
        R10 = new javax.swing.JRadioButton();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        L14 = new javax.swing.JLabel();
        T8 = new javax.swing.JTextField();
        L15 = new javax.swing.JLabel();
        T9 = new javax.swing.JTextField();
        L16 = new javax.swing.JLabel();
        T10 = new javax.swing.JTextField();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B1.setText("BACK");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        L1.setText("APPLICATION FORM FOR DRIVING LICENSE");

        L2.setText("Part A: Personal Details");

        L3.setText("1. Have you previously held a learner permit and/or driving license ?");

        L4.setText("If yes,which one?");

        L5.setText("Driver number (if known)");

        buttonGroup1.add(R1);
        R1.setText("Yes");
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(R2);
        R2.setText("No");

        buttonGroup2.add(R3);
        R3.setText("Learner Permit");
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(R4);
        R4.setText("Driving License");

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        L6.setText("2. Title");

        buttonGroup3.add(R5);
        R5.setText("Mr.");
        R5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5ActionPerformed(evt);
            }
        });

        buttonGroup3.add(R6);
        R6.setText("Mrs.");

        buttonGroup3.add(R7);
        R7.setText("Miss");
        R7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7ActionPerformed(evt);
            }
        });

        buttonGroup3.add(R8);
        R8.setText("Other");

        L7.setText("3. Full Name:");

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        L8.setText("4. Address line1");

        L9.setText("Address line2");

        L10.setText("Town");

        L11.setText("Country/City");

        L12.setText("5. Date of Birth");

        L13.setText("6. Gender");

        buttonGroup4.add(R9);
        R9.setText("Male");
        R9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9ActionPerformed(evt);
            }
        });

        buttonGroup4.add(R10);
        R10.setText("Female");

        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });

        L14.setText("7. Place of Birth");

        L15.setText("8. Mobile No.");

        L16.setText("Email Id");

        B2.setText("NEXT");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("SUBMIT");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L5)
                        .addGap(47, 47, 47)
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(R3)
                        .addGap(85, 85, 85)
                        .addComponent(R4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(R9)
                        .addGap(46, 46, 46)
                        .addComponent(R10)
                        .addGap(342, 342, 342))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B1)
                .addGap(29, 29, 29)
                .addComponent(B3)
                .addGap(30, 30, 30)
                .addComponent(B2)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(T10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(L1)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(L3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                        .addComponent(R1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(R5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(R6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(R7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(R8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(L10)
                                                        .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(L11))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(L12)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(L8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(L7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(L13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(L14)
                                                        .addComponent(L15)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(T8)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(T3)
                                                                .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(T6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                                                    .addComponent(T5, javax.swing.GroupLayout.Alignment.LEADING)))
                                                            .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(T9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(86, 86, 86)
                                                                .addComponent(L16)))
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
                                        .addGap(29, 29, 29)))))
                        .addGap(38, 38, 38)
                        .addComponent(R2)))
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(R1)
                    .addComponent(R2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(R3)
                    .addComponent(R4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L5)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L6)
                    .addComponent(R5)
                    .addComponent(R6)
                    .addComponent(R7)
                    .addComponent(R8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L7)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L8)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L9)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L10)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L11)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L12)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L13)
                    .addComponent(R9)
                    .addComponent(R10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L14)
                    .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L16)
                        .addComponent(T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(B2)
                    .addComponent(B3))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
                CP4_Registration f=new CP4_Registration();
                f.setVisible(true);
                this.dispose(); 
    }//GEN-LAST:event_B1ActionPerformed

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1ActionPerformed

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void R5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R5ActionPerformed

    private void R7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R7ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void R9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R9ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
              
        CP82_License f=new CP82_License();
                f.setVisible(true);
                this.dispose();
                
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
       
        String n1=T1.getText();
        String n2=T2.getText();
        String n3=T3.getText();
        String n4=T4.getText();
        String n5=T5.getText();
        String n6=T6.getText();
        String n7=T7.getText();
        String n8=T8.getText();
        String n9=T9.getText();
        String n10=T10.getText();
        String n11=R1.getText();
        String n12=R2.getText();
        String n13=R3.getText();
        String n14=R4.getText();
        String n15=R5.getText();
        String n16=R6.getText();
        String n17=R7.getText();
        String n18=R8.getText();
        String n19=R9.getText();
        String n20=R10.getText(); 
         if(n11.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill,if you have previously applied or not...");
        }
        if(n12.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill,if you have previously applied or not...");
        }
       
        if(n13.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill type of license...");
        }
        if(n14.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill type of license...");
        }
        if(n15.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Title...");
        }
        if(n16.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Title...");
        }
        if(n17.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Title...");
        }
        if(n18.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Title...");
        }
        if(n19.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Gender...");
        }
        if(n20.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Gender...");
        }
        if(n2.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your name first...");
        }
        if(n3.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your address first...");
        }
        if(n5.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your town first...");
        }
        if(n6.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your country/city first...");
        }
        if(n7.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your Date of birth first...");
        }
        if(n8.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your Place of birth first...");
        }
        if(n9.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your Phone no. first...");
        }
        if(n10.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill your Email Id first...");
        }
        else{
        try {
             
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","new","new");
            
            PreparedStatement pst=con.prepareStatement("Insert into LICENSE values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, n1);
            pst.setString(2, n2);
            pst.setString(3, n3);
            pst.setString(4, n4);
            pst.setString(5, n5);
            pst.setString(6, n6);
            pst.setString(7, n7);
            pst.setString(8, n8);
            pst.setString(9, n9);
            pst.setString(10, n10);
            pst.setString(11, n11);
            pst.setString(12, n12);
            pst.setString(13, n13);
            pst.setString(14, n14);
            pst.setString(15, n15);
            pst.setString(16, n16);
            pst.setString(17, n17);
            pst.setString(18, n18);
            pst.setString(19, n19);
            pst.setString(20, n20);
            int x=pst.executeUpdate();
            
            if(x>0)
            {
      
                  JOptionPane.showMessageDialog(this, "SUCCESSFULLY REGISTERED ...");
                 
            }
            else
            {
                      JOptionPane.showMessageDialog(this, "ERROR !!!");
            }
        
            con.close();
               } 
            catch (Exception e1)
                    {
                     System.out.println(e1);
                    }
        }  
           
        
    }//GEN-LAST:event_B3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CP8_License().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L16;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R10;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JRadioButton R4;
    private javax.swing.JRadioButton R5;
    private javax.swing.JRadioButton R6;
    private javax.swing.JRadioButton R7;
    private javax.swing.JRadioButton R8;
    private javax.swing.JRadioButton R9;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    // End of variables declaration//GEN-END:variables
}
