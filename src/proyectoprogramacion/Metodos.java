/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arasa Estos son los metodos basicos que creeo que usaremos si hacen
 * falta mas se acaba en clase o decimelo y el domingo le añado mas cosas si se
 * os ocurre algo hecharle un ojillo y ya el martes los metemos a la interfaz
 * grafica
 *
 */
public class Metodos {

    File f = new File("productos.txt");
    Scanner sc = null;

    //Creo un ArrayList de tipo Producto        
    ArrayList<Producto> item = new ArrayList<>();
    Producto p = new Producto();

    //Añado Items esto habra que meterlo en un bucle para que lo pregunte hasta que se le de a salir 
    public void addItem() {
        p.setValores(JOptionPane.showInputDialog("Introduzca el nombre del producto"), Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio del producto")), Integer.parseInt("Introduzca la cantidad del producto"));
        item.add(p);
    }

    //Vendemos un producto que tambien tendra que ir en un bucle 
    public void delItem() {
        item.removeAll(item);

    }
    //Este metodo muestra toda la lista de productos que es lo que se deveria sobrescribir en el fichero cadavez que se termina de 
    //trabajar con el

    public void viewItem() {
        for (int x = 0; x < item.size(); x++) {
            System.out.println(item.get(x));
        }

    }

    public void abrirFichero() {

        try {
            sc = new Scanner(f);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void escribirArchivo(String nomeFich) {
        File f = new File(nomeFich);
        PrintWriter escribir = null;
        try {
            // abrimos ficheiro para escribir
            escribir = new PrintWriter(f);
            for (int i = 0; i < 4; i++) {
                escribir.println(i);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error escritura" + ex.getMessage());
        } finally {
            escribir.close();
        }

    }

    public void añadir(String nomeFich, Producto prod) {

        FileWriter fw = null;
        PrintWriter esc = null;
        try {
            fw = new FileWriter(nomeFich, true);
            esc = new PrintWriter(fw);
            esc.append("\n");

            Iterator dato = item.iterator();
            esc.append((CharSequence) dato);

        } catch (IOException ex) {
            System.out.println("error añadir" + ex.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (esc != null) {
                    esc.close();
                }
            } catch (IOException ex) {
                System.out.println("error de cierre" + ex.getMessage());
            }
        }
    }
}
