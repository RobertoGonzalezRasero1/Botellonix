/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

/**
 *
 * @author Arasa
 */
public class Producto {
    String nombre;
    int cantidad;
    float precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setValores(String nombre,float precio,int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }
    public String getValores(){
        String valores=this.nombre+","+this.precio+","+this.cantidad;
        return valores;
    }
}
