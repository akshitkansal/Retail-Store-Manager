/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;




/**
 *
 * @author 6
 */
public class SALE extends javax.swing.JFrame {

    /** Creates new form SALE */
    public SALE() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        C1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        T7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        T8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("BILL NO.");

        jLabel2.setText("DATE");

        jLabel3.setText("TIME");

        T1.setText(" ");

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText(" CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        T2.setText(" ");

        T3.setText(" ");

        T4.setText(" ");

        T5.setText(" ");

        T6.setText(" ");

        jLabel4.setText("Product id");

        jLabel5.setText("Product Name");

        jLabel6.setText("Price");

        jLabel7.setText("Tax(%)");

        C1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                C1ItemStateChanged(evt);
            }
        });

        jLabel8.setText("Qunatity");

        jLabel9.setText("Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(T4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(T7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addComponent(jLabel9)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(T8)
                        .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try
    {
          Class.forName("java.sql.DriverManager");
          Connection c = DriverManager.getConnection("jdbc:Mysql://localhost:3306/RETAIL","root","QWERTY");
          Statement s = c.createStatement();
          String q =( "select DATE(SYSDATE()),TIME(SYSDATE());");
        ResultSet RS = s.executeQuery(q);
        RS.first();
      String CD = RS.getString("DATE(SYSDATE())");
      String TYM = RS.getString("TIME(SYSDATE())");
     T2.setText(CD);
     T3.setText(TYM);
  }
  catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
  }
try {
            Class.forName("java.sql.DriverManager");
            Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/RETAIL","root","QWERTY");
            Statement S = C.createStatement();
            String q="select Product_id from P_INFO;";
            ResultSet RS=S.executeQuery(q);
        while(RS.next())
        {
        String PID =RS.getString("Product_id");
        C1.addItem(PID);
        }
        }

        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this,e);
        }
       //BILLNO
        try {
            Class.forName("java.sql.DriverManager");
            Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/RETAIL","root","QWERTY");
            Statement S = C.createStatement();
            String q="select sale_id from SALE ;";
            ResultSet RS=S.executeQuery(q);
            RS.last();
            int BILL_NO =RS.getInt("sale_id");
            BILL_NO = BILL_NO+1;
            T1.setText(BILL_NO+ "");
        }
        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double amount;
        int quantity = Integer.parseInt(T7.getText());
        int tax= Integer.parseInt(T6.getText());
        int price= Integer.parseInt(T5.getText());
        amount=(quantity*price);
        amount=amount+(amount*tax/100);
        T8.setText(""+amount);
         try {
            Class.forName("java.sql.DriverManager");
            Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/RETAIL","root","QWERTY");
            Statement S = C.createStatement();
            String q1="Insert into sale values("+T1.getText()+","+C1.getSelectedItem()+",'"+T4.getText()+"',"+price+","+quantity+","+amount+","+tax+",'"+T2.getText()+" "+T3.getText()+"');";
            S.executeUpdate(q1);
            JOptionPane.showMessageDialog(this, "Sale recorded!");
            String q2 = "update stock set quantity = quantity-"+quantity+" where pid ="+C1.getSelectedItem()+";";
            S.executeUpdate(q2);
        }

        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void C1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_C1ItemStateChanged
        // TODO add your handling code here:
         try {
            Class.forName("java.sql.DriverManager");
            Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/RETAIL","root","QWERTY");
            Statement S = C.createStatement();
            int id= Integer.parseInt((String) C1.getSelectedItem());
            String q="select * from P_INFO where product_id="+id+";";
            ResultSet RS=S.executeQuery(q);
            RS.first();
            T4.setText(RS.getString("product_name"));
            T5.setText(RS.getString("price"));
            T6.setText(RS.getString("tax"));
        }

        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_C1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
