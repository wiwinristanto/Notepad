/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.prj1.notepad;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author wiwin.ristanto
 */
public class Tampilan extends javax.swing.JFrame implements KeyListener {

    public Tampilan() {
        initComponents();
        txtInput.addKeyListener(this);
//        keyPressed();

    }

//    private void keyPressed(KeyEvent n){
//         txtInput.getText();
//         
//         if (n.getKeyCode() == KeyEvent.VK_ENTER){
//              try
//                {
//                    PrintWriter printwriter = new PrintWriter(new FileWriter("test.txt"));
//                    printwriter.write(txtInput.getText());
//                    printwriter.flush();
//                    printwriter.close();
//                    } catch (IOException e) {
//                    System.err.println("Error Ocured");
//                    e.printStackTrace();
//                }
//         }
//       
//     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Notepad");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtInput.setColumns(20);
        txtInput.setRows(5);
        txtInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInputMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtInput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapus)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnSimpan))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        txtInput.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser("../..");
//        fileChooser.setCurrentDirectory(dir);
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if(file==null){
                return;
            }
            if(!file.getName().toLowerCase().endsWith(".txt")){
                file = new File(file.getParentFile().getParentFile().getName()+".txt#");
            }
            
            try {
                String namingfile = null;
                String extentioString = null;
                String directory = fileChooser.getSelectedFile().getParent();
                File tempFile = File.createTempFile(namingfile,extentioString,new File(directory)
                );

                txtInput.setText(txtInput.getText()+fileChooser.getSelectedFile().getName());
                
                PrintWriter printWriter = new PrintWriter(new FileWriter(fileChooser.getName()));
                printWriter.write(txtInput.getText());
                printWriter.flush();
                printWriter.close();
            } catch (IOException e) {
                System.err.println("Error Occured");
                e.printStackTrace();
            }

        }

//        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInputMouseClicked
    }//GEN-LAST:event_txtInputMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent p) {
        System.out.println(p.getKeyCode() == KeyEvent.VK_ENTER);
//      if(p.getKeyCode() == KeyEvent.VK_ENTER){
//          try{
//            
//            PrintWriter printWriter = new PrintWriter(new FileWriter("test.txt"));
//            printWriter.write(txtInput.getText());
//            printWriter.flush();
//            printWriter.close();
//        } catch (IOException e){
//            System.err.println("Error Occured");
//            e.printStackTrace();
//        } 
//      }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent p) {
        if (p.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                PrintWriter printWriter = new PrintWriter(new FileWriter("test.txt"));
                printWriter.write(txtInput.getText());
                printWriter.flush();
                printWriter.close();
            } catch (IOException e) {
                System.err.println("Error Occured");
                e.printStackTrace();
            }
        }
    }

}
