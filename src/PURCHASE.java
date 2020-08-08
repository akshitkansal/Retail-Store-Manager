
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author 6
 */
public class PURCHASE extends javax.swing.JFrame {

    /** Creates new form PURCHASE */
    public PURCHASE() {
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
        jLabel4 = new javax.swing.JLabel();
        C1 = new javax.swing.JComboBox();
        T2 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agent Orange", 3, 36)); // NOI18N
        jLabel1.setText(" PURCHASE");

        jLabel2.setText(" PRODUCT ID ");

        jLabel3.setText(" PRODUCT NAME");

        jLabel4.setText("QUANTITY");

        C1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                C1ItemStateChanged(evt);
            }
        });

        T2.setText(" ");

        T4.setText(" ");

        jButton1.setText("UPDATE STOCK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C1, 0, 152, Short.MAX_VALUE)
                            .addComponent(T4)
                            .addComponent(T2))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try
      {
          Class.forName("java.sql.DriverManager");
          Connection c = (Connection) DriverManager.getConnection("jdbc:Mysql://localhost:3306/RETAIL","root","QWERTY");
          Statement s = (Statement) c.createStatement();
          String q =( "select product_id from p_info");
          //JOptionPane.showMessageDialog(null ,q);
          ResultSet RS = s.executeQuery(q);
          System.out.print(RS);
         while( RS.next())
         {int id= RS.getInt("product_id");
C1.addItem(id);}
     }
    catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());

    }         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void C1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_C1ItemStateChanged
        // TODO add your handling code here:
        try
      {
          Class.forName("java.sql.DriverManager");
          Connection c = (Connection) DriverManager.getConnection("jdbc:Mysql://localhost:3306/RETAIL","root","QWERTY");
          Statement s = (Statement) c.createStatement();
          String q =( "select product_name from p_info where product_id="+C1.getSelectedItem());
         // JOptionPane.showMessageDialog(null ,q);
          ResultSet RS = s.executeQuery(q);
          System.out.print(RS);
         RS.first();
     String name = RS.getString("product_name");
T2.setText(name);

     }
    catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());

    }
    }//GEN-LAST:event_C1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
      {
          Class.forName("java.sql.DriverManager");
          Connection c = (Connection) DriverManager.getConnection("jdbc:Mysql://localhost:3306/RETAIL","root","QWERTY");
          Statement s = (Statement) c.createStatement();
          String q =( "update stock set quantity = quantity+"+T4.getText()+" where pid ="+C1.getSelectedItem()+";");
          //JOptionPane.showMessageDialog(null ,q);
          s.executeUpdate(q);
          JOptionPane.showMessageDialog(this, "Stock Updated");
         }
    catch(HeadlessException | ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());

    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PURCHASE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox C1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
