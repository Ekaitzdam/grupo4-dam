package Reto;

import javax.swing.*;

public class VentanaCrearJugador {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton crearButton;
    private JButton cancelarButton;
    private JPanel VentanaCrearJugador;


    public VentanaCrearJugador() {
        JFrame frame = new JFrame("VentanaCrearJugador");
        frame.setContentPane(VentanaCrearJugador);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
