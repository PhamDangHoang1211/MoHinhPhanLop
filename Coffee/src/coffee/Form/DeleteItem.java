/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.Form;

import coffee.BLL.FileBLL;
import coffee.DTO.CartDTO;
import coffee.DTO.MiniProductDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hung Tuong Vy
 */
public class DeleteItem extends javax.swing.JFrame {

    /**
     * Creates new form DeleteItem
     */
    private MiniProductDTO MiniProduct;
    private String note;
    public DeleteItem(MiniProductDTO MiniProduct,String note) {
        this.MiniProduct=MiniProduct;
        this.note=note;
        initComponents();
        System.out.println(getIce(note));
        update();
        nameProduct.setText(MiniProduct.getName());
        
        
    }
    public ArrayList<CartDTO> getListCart() throws IOException{
        FileBLL file=new FileBLL();
        ArrayList<CartDTO> ListCart=file.ReadFiletoList("C:\\Users\\hoang\\Desktop\\java\\Coffee\\temp.txt");
        return ListCart;
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
        nameProduct = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxSize = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        boxSugar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        boxIce = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnDelAll = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        Qty = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        nameProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameProduct.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Size");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 74, -1));

        boxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M" }));
        boxSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSizeActionPerformed(evt);
            }
        });
        jPanel2.add(boxSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 147, -1));

        jLabel3.setText("Sugar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 37, -1));

        boxSugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "70", "50", "30" }));
        jPanel2.add(boxSugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 147, -1));

        jLabel4.setText("Ice");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 37, -1));

        boxIce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "70", "50", "0", " " }));
        boxIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIceActionPerformed(evt);
            }
        });
        jPanel2.add(boxIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 147, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btnCancel.setText("Canel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelAll.setText("Delete");
        btnDelAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelAllActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnDelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnDelAll)
                    .addComponent(btnEdit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 500, 100));
        jPanel2.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 55, -1));

        jLabel2.setText("Qty");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void update(){
        if(MiniProduct.getCategory_id()==1)
        {
            boxIce.disable();
        }
        boxSize.setSelectedItem(MiniProduct.getSize().toString());
        boxIce.setSelectedItem(getIce(note));
        boxSugar.setSelectedItem(getSugar(note));
        Qty.setValue(MiniProduct.getQty());
    }
    public String getIce(String note){
        String ice=null;
        if(note.length()==15)
        {
            int ice1=note.charAt(4);
            int ice2=note.charAt(5);
             ice= Character.toString((char) ice1)+Character.toString((char) ice2);
        }
        if(note.length()>=16)
        {
            int ice1=note.charAt(4);
            int ice2=note.charAt(5);
            int ice3=note.charAt(6);
            String temp=Character.toString((char) ice3);
            if(temp.equals(" "))
             ice= Character.toString((char) ice1)+Character.toString((char) ice2);
            else{
                ice= Character.toString((char) ice1)+Character.toString((char) ice2)+Character.toString((char) ice3);
            }
        }
        return ice;
    }
     public String getSugar(String note){
        String sugar=null;
        if(note.length()==15)
        {
            int ice1=note.charAt(13);
            int ice2=note.charAt(14);
             sugar= Character.toString((char) ice1)+Character.toString((char) ice2);
        }
        if(note.length()==16)
        {
            int ice1=note.charAt(14);
            int ice2=note.charAt(15);
             sugar= Character.toString((char) ice1)+Character.toString((char) ice2);
        }
        if(note.length()==17)
        {
            int ice1=note.charAt(14);
            int ice2=note.charAt(15);
            int ice3=note.charAt(16);
             sugar= Character.toString((char) ice1)+Character.toString((char) ice2)+Character.toString((char) ice3);
        }
        return sugar;
    }
    private void boxIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIceActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            // TODO add your handling code here:
          
            ArrayList<CartDTO> ListCart=getListCart();
            for(int i=0;i<ListCart.size();i++)
            {
                if(MiniProduct.getBarcode().equals(ListCart.get(i).getBarcode()))
                {
                    String Note="Ice "+boxIce.getSelectedItem().toString()+" Sugar "+boxSugar.getSelectedItem().toString();
                    ListCart.get(i).setNote(Note);
                    ListCart.get(i).setSize(boxSize.getSelectedItem().toString());
                    ListCart.get(i).setQty((int) Qty.getValue());
                }
            }
            FileBLL file=new FileBLL();
            file.WriteFile_FW("C:\\Users\\Hung Tuong Vy\\Documents\\NetBeansProjects\\Coffee\\temp.txt",ListCart);
            CashierForm.tableUpdate();
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(DeleteItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void boxSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSizeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDelAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelAllActionPerformed
        try {
            // TODO add your handling code here:
            ArrayList<CartDTO> ListCart=getListCart();
            for(int i=0;i<ListCart.size();i++)
            {
                if(MiniProduct.getBarcode().equals(ListCart.get(i).getBarcode()))
                {
                    ListCart.remove(i);
                }
            }
            FileBLL file=new FileBLL();
            file.WriteFile_FW("C:\\Users\\Hung Tuong Vy\\Documents\\NetBeansProjects\\Coffee\\temp.txt",ListCart);
            CashierForm.tableUpdate();
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(DeleteItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDelAllActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DeleteItem().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Qty;
    private javax.swing.JComboBox<String> boxIce;
    private javax.swing.JComboBox<String> boxSize;
    private javax.swing.JComboBox<String> boxSugar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelAll;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameProduct;
    // End of variables declaration//GEN-END:variables
}