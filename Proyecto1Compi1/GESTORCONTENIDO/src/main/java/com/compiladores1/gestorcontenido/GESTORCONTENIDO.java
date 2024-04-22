/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compiladores1.gestorcontenido;

import com.compiladores1.gestorcontenido.ui.FramePrincipal;
import java.io.StringReader;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.JMarsDarkTheme;
import mdlaf.themes.MaterialLiteTheme;
import mdlaf.themes.MaterialOceanicTheme;
//import java.io.StringReader;

/**
 *
 * @author mgome
 */
public class GESTORCONTENIDO {
    public static void main(String[] args) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialOceanicTheme()));
        } catch (UnsupportedLookAndFeelException e) {
            
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            FramePrincipal fp = new FramePrincipal();
            fp.setVisible(true);
            fp.setLocationRelativeTo(null);
            fp.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        });
    }
}
