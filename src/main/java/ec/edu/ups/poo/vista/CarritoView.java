package ec.edu.ups.poo.vista;

import javax.swing.*;

public class CarritoView extends JFrame {
    private JPanel panelPrincipal;
    private JLabel itemsLabel;
    private JLabel nroItemsLabel;
    private JPanel panelItems;
    private JLabel costoLabel;
    private JButton agregarProductoButton;
    private JButton salirButton;

    public  CarritoView() {
        setContentPane(panelPrincipal);
        setTitle("Items Carrito");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new  CarritoView();
    }
}
