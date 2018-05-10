package Reto;

import javax.swing.*;

public class VentanaCrearDuenio {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton crearButton;
    private JButton cancelarButton;
    private JPanel VentanaCrearDuenio;

    public VentanaCrearDuenio() {
        JFrame frame = new JFrame("VentanaCrearDuenio");
        frame.setContentPane(VentanaCrearDuenio);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
