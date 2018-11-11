
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CP7_Pancard extends javax.swing.JFrame {
    public CP7_Pancard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        CB1 = new javax.swing.JComboBox();
        L8 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L15 = new javax.swing.JLabel();
        L16 = new javax.swing.JLabel();
        L18 = new javax.swing.JLabel();
        L19 = new javax.swing.JLabel();
        L17 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        T12 = new javax.swing.JTextField();
        T11 = new javax.swing.JTextField();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        T10 = new javax.swing.JTextField();
        T13 = new javax.swing.JTextField();
        T14 = new javax.swing.JTextField();
        T15 = new javax.swing.JTextField();
        T16 = new javax.swing.JTextField();
        T17 = new javax.swing.JTextField();
        CB2 = new javax.swing.JComboBox();
        CB3 = new javax.swing.JComboBox();
        B2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B1.setText("BACK");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        L1.setText("NAME :");

        L2.setText("FATHER'S NAME :");

        L3.setText("MOBILE NO. :");

        L4.setText("INCOME :");

        L7.setText("RESIDENTIAL ADDRESS :");

        L5.setText("EMAIL ID :");

        L6.setText("DATE OF BIRTH :");

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });

        T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T7ActionPerformed(evt);
            }
        });

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        CB1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "<15,000", "15,000-25,000", "25,000-50,000", "50,000-1,00,000", ">1,00,000" }));

        L8.setText("House no.,Building,Village :");

        L14.setText("OFFICIAL ADDRESS :");

        L9.setText("City,Town :");

        L10.setText("Pin code :");

        L11.setText("Street,Road :");

        L12.setText("State,U.T.");

        L13.setText("Country :");

        L15.setText("Office Name :");

        L16.setText("Shop no. :");

        L18.setText("Street,Road :");

        L19.setText("City,Town :");

        L17.setText("Pin code :");

        L20.setText("Country :");

        T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T11ActionPerformed(evt);
            }
        });

        T14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T14ActionPerformed(evt);
            }
        });

        T16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T16ActionPerformed(evt);
            }
        });

        T17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T17ActionPerformed(evt);
            }
        });

        CB2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "AUSTRIA", "INDIA", "AFGANISTAN", "CHINA", "PAKISTAN", "SRILANKA", "BHUTAN", "NEPAL", "MYNMAR", "RUSSIA", "CANADA", "CHILA", "DUBAI", "SWISTZERLAND", "ICELAND", "HONKONG", "SINGAPORE", "BRAZIL", " " }));

        CB3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "INDIA", "AFGANISTAN", "CHINA", "PAKISTAN", "SRILANKA", "BHUTAN", "NEPAL", "MYNMAR", "RUSSIA", "CANADA", "CHILA", "DUBAI", "SWISTZERLAND", "ICELAND", "HONKONG", "SINGAPORE", "BRAZIL" }));
        CB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB3ActionPerformed(evt);
            }
        });

        B2.setText("CONTINUE");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        jLabel1.setText("PANCARD ENROLMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(L14)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(L17, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(T15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L9)
                                    .addComponent(L10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(T10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(T9))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L15)
                                    .addComponent(L16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(T14, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(T13))))
                        .addGap(0, 338, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CB1, javax.swing.GroupLayout.Alignment.LEADING, 0, 141, Short.MAX_VALUE)
                                    .addComponent(T4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T5, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(B1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(L5)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(L6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T6)
                                    .addComponent(T7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L12)
                                    .addComponent(L11)
                                    .addComponent(L13)
                                    .addComponent(L18)
                                    .addComponent(L19)
                                    .addComponent(L20))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CB2, 0, 142, Short.MAX_VALUE)
                                        .addComponent(T17)
                                        .addComponent(CB3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(T11)
                                        .addComponent(T12)
                                        .addComponent(T16)))
                                .addGap(0, 80, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L2)
                            .addComponent(L3)
                            .addComponent(L1)
                            .addComponent(L4))
                        .addGap(31, 31, 31)
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(L6)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(L7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L8)
                    .addComponent(L11)
                    .addComponent(T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L9)
                    .addComponent(L12)
                    .addComponent(T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L10)
                    .addComponent(L13)
                    .addComponent(T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(L14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L15)
                            .addComponent(T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L16)
                            .addComponent(T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L19)
                            .addComponent(T17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L20)
                                .addComponent(CB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 137, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1)
                            .addComponent(B2))
                        .addGap(62, 62, 62))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
            CP4_Registration f=new CP4_Registration();
            f.setVisible(true);
            this.dispose(); 
    }//GEN-LAST:event_B1ActionPerformed

    private void T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T7ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T6ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T16ActionPerformed

    private void T17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T17ActionPerformed

    private void CB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB3ActionPerformed

    private void T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T11ActionPerformed

    private void T14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T14ActionPerformed
        
    }//GEN-LAST:event_T14ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
            CP72_Pancard f=new CP72_Pancard();
            f.setVisible(true);
            this.dispose(); 
            
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
        String n11=T11.getText();
        String n12=T12.getText();
        String n13=T13.getText();    
        String n14=T14.getText();
        String n15=T15.getText();
        String n16=T16.getText();    
        String n17=T17.getText();
        
        String n18=CB1.getSelectedItem().toString(); 
        String n19=CB2.getSelectedItem().toString(); 
        String n20=CB3.getSelectedItem().toString();
        
        if(n1.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n2.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n3.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n4.equals("select"))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n5.equals("select"))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n6.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n7.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n8.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n9.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n10.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n11.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n12.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n13.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n14.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n15.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n16.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n17.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n18.equals("SELECT"))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n19.equals("SELECT"))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        if(n20.equals("SELECT"))
        {
            JOptionPane.showMessageDialog(this, "Incomplete Information...");
        }
        
        else{
        try {
             
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","new","new");
            
            PreparedStatement pst=con.prepareStatement("Insert into PANCARD values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
           
    }                                  

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CP4_Registration().setVisible(true);
            }
        });
    }//GEN-LAST:event_B2ActionPerformed

    public static void main() {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CP7_Pancard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JComboBox CB1;
    private javax.swing.JComboBox CB2;
    private javax.swing.JComboBox CB3;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L16;
    private javax.swing.JLabel L17;
    private javax.swing.JLabel L18;
    private javax.swing.JLabel L19;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T11;
    private javax.swing.JTextField T12;
    private javax.swing.JTextField T13;
    private javax.swing.JTextField T14;
    private javax.swing.JTextField T15;
    private javax.swing.JTextField T16;
    private javax.swing.JTextField T17;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
