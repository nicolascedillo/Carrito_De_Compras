package ec.edu.ups.poo.models;

public class Item_Carrito {
    private Producto producto;
    private int cantidad;

    public Item_Carrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\tItem: " + producto +
                ", Cantidad: " + cantidad +
                ", Total (Item) : " + calcularPrecio() + "\n";
    }

    public  double calcularPrecio() {
        return  producto.getPrecio() * cantidad;
    }
}
