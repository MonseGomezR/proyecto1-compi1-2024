/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compiladores1.gestorcontenido.conexionhttps;
import java.io.*;
import java.net.*;
/**
 *
 * @author mgome
 */
public class ClienteHTTP {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/WebAppGC/print");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "text/plain");
            
            OutputStream os = con.getOutputStream();
            String input = "";
            os.write(input.getBytes());
            os.flush();
            os.close();
            
            int responseCode = con.getResponseCode();
            System.out.println("Código de respuesta: " + responseCode);
            // Leer la respuesta del servidor   
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println("Respuesta del servidor: " + response.toString());
            // Cerrar el scanner
        } catch (IOException e) {
        }
    }
}
