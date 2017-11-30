/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 24
 */
public class NewClass {

    public static void execute(String comando) {
        try {
            String linea;
            Process p = Runtime.getRuntime().exec(comando);
            try (BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                while ((linea = input.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException err) {
            System.out.println("error");
            System.out.println(err);
        }
    }
}
