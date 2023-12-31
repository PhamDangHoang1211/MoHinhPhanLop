/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.Form;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.TableModel;

/**
 *
 * @author Hung Tuong Vy
 */
public class PrintBills extends javax.swing.JFrame {

    /**
     * Creates new form PrintBills
     */
    Date date=new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    String strDate = formatter.format(date);
    private String Name;
    private int Sub;
    private int Pay;
    private int Balance;
    public PrintBills() {
        initComponents();
    }
    public PrintBills(String Name, int Sub, int Pay, int Balance,TableModel tableModel) throws PrinterException {
        initComponents();
        this.Name=Name;
        this.Sub=Sub;
        this.Pay=Pay;
        this.Balance=Balance;
        txtPrint.setText("*************************************************************************************\n");
        txtPrint.setText(txtPrint.getText()+"******************************D3H Team***********************************\n");
        txtPrint.setText(txtPrint.getText()+"\n");
        txtPrint.setText(txtPrint.getText()+"Product \t"+"Size \t"+"Note \t"+"Qty \t"+"Price \n");
        for(int i=0;i<tableModel.getRowCount();i++)
        {
            String Product=tableModel.getValueAt(i, 1).toString();
            String Size=tableModel.getValueAt(i, 2).toString();
            String Note=tableModel.getValueAt(i, 3).toString();
            String Qty=tableModel.getValueAt(i, 4).toString();
            String Price=tableModel.getValueAt(i, 5).toString();
            txtPrint.setText(txtPrint.getText()+Product +"\t"+Size+"\t"+Note +"\t"+Qty +"\t"+Price+ "\n");
        }
        txtPrint.setText(txtPrint.getText()+"\n");
        txtPrint.setText(txtPrint.getText()+"\n");
        txtPrint.setText(txtPrint.getText()+"                             SubTotal\t  "+Sub+" \n");
        txtPrint.setText(txtPrint.getText()+"                             Pay\t "+Pay+" \n");
        txtPrint.setText(txtPrint.getText()+"                             Balance\t "+Balance+" \n");
        txtPrint.setText(txtPrint.getText()+" Date :"+strDate+"                        By:     Staff\t "+Name+" \n");
        txtPrint.print();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        txtPrint.setColumns(20);
        txtPrint.setRows(5);
        jScrollPane1.setViewportView(txtPrint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(PrintBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPrint;
    // End of variables declaration//GEN-END:variables
}
