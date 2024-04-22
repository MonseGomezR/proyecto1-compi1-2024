package com.compiladores1.gestorcontenido.ui;

import com.compiladores1.gestorcontenido.ui.aux.NumLinea;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;

/**
 *
 * @author mgome
 */
public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        lineasConsola();
        editorSpace.setVisible(false);
        editorSpace.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        editorSpace = new javax.swing.JPanel();
        consolaSP = new javax.swing.JScrollPane();
        consolaTA = new javax.swing.JTextArea();
        guardarXMLButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JPanel();
        goToConsultas = new javax.swing.JButton();
        gotoEditor = new javax.swing.JButton();

        titleBar.setBackground(new java.awt.Color(204, 204, 204));
        titleBar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        closeButton.setText("X");
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setFocusPainted(false);
        closeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        closeButton.setMaximumSize(new java.awt.Dimension(30, 30));
        closeButton.setMinimumSize(new java.awt.Dimension(30, 30));
        closeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        titleBar.add(closeButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        editorSpace.setEnabled(false);

        consolaSP.setBorder(null);

        consolaTA.setColumns(20);
        consolaTA.setRows(5);
        consolaTA.setBorder(null);
        consolaTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consolaTAKeyPressed(evt);
            }
        });
        consolaSP.setViewportView(consolaTA);

        guardarXMLButton.setText("Guardar XML");
        guardarXMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarXMLButtonActionPerformed(evt);
            }
        });

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editorSpaceLayout = new javax.swing.GroupLayout(editorSpace);
        editorSpace.setLayout(editorSpaceLayout);
        editorSpaceLayout.setHorizontalGroup(
            editorSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorSpaceLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(editorSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consolaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(editorSpaceLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(volverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarXMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        editorSpaceLayout.setVerticalGroup(
            editorSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorSpaceLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(consolaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editorSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarXMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        menuPrincipal.setPreferredSize(new java.awt.Dimension(1000, 600));

        goToConsultas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        goToConsultas.setText("Consultas");
        goToConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goToConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goToConsultasMouseExited(evt);
            }
        });
        goToConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToConsultasActionPerformed(evt);
            }
        });

        gotoEditor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gotoEditor.setText("Editor");
        gotoEditor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoEditorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoEditorMouseExited(evt);
            }
        });
        gotoEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoEditorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(goToConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(gotoEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goToConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gotoEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToConsultasMouseEntered
        
    }//GEN-LAST:event_goToConsultasMouseEntered

    private void goToConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToConsultasMouseExited
        
    }//GEN-LAST:event_goToConsultasMouseExited

    private void goToConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goToConsultasActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        closeButton.setBackground(Color.red);
        closeButton.setForeground(Color.white);
        closeButton.setBorder(null);
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButton.setBackground(titleBar.getBackground());
        closeButton.setForeground(Color.black);
    }//GEN-LAST:event_closeButtonMouseExited

    private void gotoEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoEditorActionPerformed
        menuPrincipal.setVisible(false);
        menuPrincipal.setEnabled(false);
        editorSpace.setVisible(true);
        editorSpace.setEnabled(true);
    }//GEN-LAST:event_gotoEditorActionPerformed

    private void gotoEditorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoEditorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gotoEditorMouseEntered

    private void gotoEditorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoEditorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gotoEditorMouseExited

    private void guardarXMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarXMLButtonActionPerformed
        javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
        String ruta = "";
        try{
                if(jF1.showSaveDialog(null)== JFileChooser.APPROVE_OPTION){

                ruta= jF1.getSelectedFile().getAbsolutePath();
                File archivo = new File(ruta);
                BufferedWriter bw;
                if(archivo.exists()) {
                    
                } else {
                    bw = new BufferedWriter(new FileWriter(archivo));
                    try {
                        Files.write(Paths.get(ruta+".xml"), "Aquí el texto".getBytes(), StandardOpenOption.APPEND);
                    }catch (IOException e) {
                    }
                    bw.close();
                } 
         }
     }
         catch(Exception ex){

                 ex.printStackTrace();
                 }
    }//GEN-LAST:event_guardarXMLButtonActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        menuPrincipal.setVisible(true);
        menuPrincipal.setEnabled(true);
        editorSpace.setVisible(false);
        editorSpace.setEnabled(false);
    }//GEN-LAST:event_volverButtonActionPerformed

    private void consolaTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consolaTAKeyPressed
        repaint();
        revalidate();
    }//GEN-LAST:event_consolaTAKeyPressed

    private void lineasConsola() {
        NumLinea numeroLinea = new NumLinea(consolaTA);
        consolaSP.setRowHeaderView(numeroLinea);
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Declaracion de Variables ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane consolaSP;
    private javax.swing.JTextArea consolaTA;
    private javax.swing.JPanel editorSpace;
    private javax.swing.JButton goToConsultas;
    private javax.swing.JButton gotoEditor;
    private javax.swing.JButton guardarXMLButton;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JPanel titleBar;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
