package ec.edu.ups.poo.models;


import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Item_Carrito> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public void addItem(Producto producto, int cantidad) {
        items.add(new Item_Carrito(producto, cantidad));
    }
    public List<Item_Carrito> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Carrito \n" + items;
    }

    public double calcularTotal() {
        double total = 0;
        for  (Item_Carrito item : items) {
            total += item.calcularPrecio();
        }
        return total;
    }
}
