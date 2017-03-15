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

/**
 *
 * @author Arasa Estos son los metodos basicos que creeo que usaremos si hacen
 * falta mas se acaba en clase o decimelo y el domingo le añado mas cosas si se
 * os ocurre algo hecharle un ojillo y ya el martes los metemos a la interfaz
 * grafica
 *
 */
public class Metodos {

    //Creo un ArrayList de tipo Producto        

    ArrayList<Producto> item = new ArrayList<>();
    File f = new File("");

    //Añado Items esto habra que meterlo en un bucle para que lo pregunte hasta que se le de a salir 
    public void addItem() {
        item.add(JOptionPane.showInputDialog("Introduce el producto añadido"));
    }

    //Vendemos un producto que tambien tendra que ir en un bucle 

    public void delItem() {
        item.remove(JOptionPane.showInputDialog("Introduce el producto vendido"));
    }
            //Este metodo muestra toda la lista de productos que es lo que se deveria sobrescribir en el fichero cadavez que se termina de 
    //trabajar con el

    public void viewItem() {
        for (int x = 0; x < item.size(); x++) {
            System.out.println(item.get(x));
        }

    }
}
