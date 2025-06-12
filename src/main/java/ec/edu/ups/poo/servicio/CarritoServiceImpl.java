package ec.edu.ups.poo.servicio;

import ec.edu.ups.poo.modelo.Item_Carrito;
import ec.edu.ups.poo.modelo.Producto;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CarritoServiceImpl implements CarritoService{
    private final List<Item_Carrito> items;

    public CarritoServiceImpl() {
        items = new ArrayList<>();
    }

    @Override
    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new Item_Carrito(producto, cantidad));
    }

    @Override
    public void eliminarProducto(int codigoProducto) {
        Iterator<Item_Carrito> it = items.iterator();
        while (it.hasNext()) {
            if (it.next().getProducto().getCodigo() == codigoProducto) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public void vaciarCarrito() {
        items.clear();
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Item_Carrito item : items) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total;
    }

    @Override
    public List<Item_Carrito> obtenerItems() {
        return items;
    }

    @Override
    public boolean estaVacio() {
        return items.isEmpty();
    }
}
