/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import model.NewClass;

/**
 *
 * @author 24
 */
public class nn {

    public void exec2() {
        NewClass.execute("prueba2.bat");
    }

    public String leerTxt(String direccion) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                //hacer el ciclo While mientras el bfRead Tiene datos!
                temp = temp + bfRead; //aquí estamos guardando el texto del archivo
            }
            texto = temp;
        } catch (Exception e) {
            System.err.println("No se Encontró el Archivo");
        }
        return texto;
    }

    public void abrirarchivo(String archivo) {
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
