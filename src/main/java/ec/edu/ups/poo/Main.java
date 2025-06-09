package ec.edu.ups.poo;

import ec.edu.ups.poo.models.Carrito;
import ec.edu.ups.poo.models.Producto;

public class Main {
    public static void main(String[] args) {
        Producto jabon = new Producto("001","Jabón",3);
        Producto manzanas = new Producto("002","Manzanas",1.5);
        Producto esfero = new Producto("003","Esfero",0.5);

        Carrito carrito = new Carrito();
        carrito.addItem(jabon,1);
        carrito.addItem(manzanas,5);
        carrito.addItem(esfero,3);

        System.out.println(carrito);
    }
}
