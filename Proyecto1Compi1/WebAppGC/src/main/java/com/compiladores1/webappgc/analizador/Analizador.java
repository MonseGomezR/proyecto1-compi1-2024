/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compiladores1.webappgc.analizador;

import java.io.StringReader;

/**
 *
 * @author mgome
 */
public class Analizador {
    private AnalizadorLexico al;
    private parser parser;
    private String resultado;
    
    public Analizador() {
        
    }
    
    public boolean analizarEntrada(String entrada) {
        boolean exito = false;
        al = new AnalizadorLexico(new StringReader(entrada));
        parser parser = new parser(al);

        try {
            parser.parse();
            resultado = "Analisis sintactico completado exitosamente.";
            exito = true;
        } catch (Exception e) {
            resultado = "Error durante el analisis sintactico: " + e.getMessage();
        }
        
        return exito;
    }
    
    public String getResultado() {
        return resultado;
    }
}
