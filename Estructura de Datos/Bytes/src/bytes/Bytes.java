/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author UTPL
 */
public class Bytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
           // File file = new File("pilotos.txt");
            File file = new File("C:\\Users\\UTPL\\Desktop\\Estructura de Datos\\Bytes\\pilotos.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado " + file.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("ERROR.");
        }
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\UTPL\\Desktop\\Estructura de Datos\\Bytes\\pilotos.txt", true)) {
            String data = "Esto es un ejemplo de Stream con bytes\n";
            byte b[] = data.getBytes();
            fos.write(b);

            fos.flush();
            fos.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\UTPL\\Desktop\\Estructura de Datos\\Bytes\\pilotos.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura.");

        }
    }

}
