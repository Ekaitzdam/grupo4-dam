package Reto;

import javax.swing.*;

public class VentanaRegistrar {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton salirButton;
    private JPanel VentanaRegistrar;


    public VentanaRegistrar() {
        JFrame frame = new JFrame("VentanaRegistrar");
        frame.setContentPane(VentanaRegistrar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
