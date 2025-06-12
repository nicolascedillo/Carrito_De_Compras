package ec.edu.ups.poo.servicio;

import ec.edu.ups.poo.modelo.Item_Carrito;
import ec.edu.ups.poo.modelo.Producto;

import java.util.List;

public interface CarritoService {
    void agregarProducto(Producto producto, int cantidad);

    void eliminarProducto(int codigoProducto);

    void vaciarCarrito();

    double calcularTotal();

    List<Item_Carrito> obtenerItems();

    boolean estaVacio();
}
