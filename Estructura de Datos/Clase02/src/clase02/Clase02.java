/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author UTPL
 */
public class Clase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
           // File file = new File("estudiantes.txt");
            File file = new File("C:\\Users\\UTPL\\Desktop\\Estructura de Datos\\Clase02\\estudiantes.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("ERROR.");
        }

        //Escribir un archiv usando Write
        try (FileWriter myWriter = new FileWriter("C:\\Users\\UTPL\\Desktop\\Estructura de Datos\\Clase02\\estudiantes.txt", true)) {

            //my Writer.("Ejemplo de escritura en archivo usando Write \n");
            myWriter.write("El archivo ha sido escrito\n");
            myWriter.append("Ejemplo de escritura\n");
            myWriter.close();
            System.out.println("El archivo ha sido escrito\n");
        } catch (IOException e) {
            System.out.println("ERROR DE ESCRITURA");
        }

        //Leer archivo
        System.out.println("Leemos el archivo");
        try (FileReader myReader = new FileReader("C:\\Users\\UTPL\\Desktop\\Estructura de Datos\\Clase02\\estudiantes.txt")) {
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }
    }

}
