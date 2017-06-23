/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor.siglas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.*;

/**
 *
 * @author richardcj
 */
public class ReadFile {

    private ArrayList<String> siglas = new ArrayList<String>();

    public ArrayList<String> getSiglas() {
        return siglas;
    }


    public void readFile() {
        try {
            //Este archivo se encuentra en la dentro de 
            //FileReader readFile = new FileReader("fileIn.txt");
            // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream("fileIn.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line

            //Collect data un ArrayList 
            int i = 0;
            String[] array = new String[10];
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                System.out.println(strLine);
                array[i] = strLine;
                siglas.add(i, strLine);
                i++;
                System.out.println(Arrays.toString(array));
                System.out.println(siglas);

            }

        } catch (Exception e) {
            /**
             * Comprobar los errrores en caso de haberlos. Cuando se realiza una
             * lectura de ficheros
             */
            System.err.println("Ha ocurrido un problema al leer el fichero");
        }
    }
}
