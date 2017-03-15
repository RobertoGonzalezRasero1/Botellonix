/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import proyectoprogramacion.*;
/**
 *
 * @author Arasa
 */
public class Grafica {
Metodos obj = new Metodos();
int i =0 ;

do{
    
    switch(i){
        case 1:
            obj.addItem();
            break;
        case 2:
            obj.delItem();
            break;
        case 3:
            obj.viewItem();
            break;
        case 4:
          break;
    }
   
}while(i<4);

    
    

}
