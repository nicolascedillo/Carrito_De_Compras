package ec.edu.ups.poo.vista;

import javax.swing.*;
import java.awt.event.*;

public class ProductoView extends JFrame {

    private JPanel panelPrincipal;
    private JTextField textFieldCodigo;
    private JLabel codigo;
    private JLabel nombre;
    private JTextField textFieldNombre;
    private JLabel precio;
    private JTextField textFieldPrecio;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton salirButton;

    public  ProductoView() {
        setContentPane(panelPrincipal);
        setTitle("Datos del Producto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(356, 186);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });


        textFieldPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldPrecio.setText("");
            }
        });
    }

    public static void main(String[] args) {
        //new  ProductoView();
    }

    private void mostrarDatos(){
        String codigo = textFieldCodigo.getText();
        String nombre = textFieldNombre.getText();
        String precio = textFieldPrecio.getText();

        System.out.println(codigo);
        System.out.println(nombre);
        System.out.println(precio);
    }
}
