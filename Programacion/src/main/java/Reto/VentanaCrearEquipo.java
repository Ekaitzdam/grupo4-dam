package Reto;

import javax.swing.*;

public class VentanaCrearEquipo {
    private JPanel VentanaCrearEquipo;
    private JTextField textField1;
    private JTextField textField2;
    private JButton crearButton;
    private JButton cancelarButton;


    public VentanaCrearEquipo() {
        JFrame frame = new JFrame("VentanaCrearEquipo");
        frame.setContentPane(VentanaCrearEquipo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
