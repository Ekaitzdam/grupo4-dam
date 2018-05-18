package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearDuenio {
    private JTextField textoNombre;
    private JTextField textoApellidos;
    private JTextField textoCodigo;
    private JButton crearButton;
    private JButton cancelarButton;
    private JPanel VentanaCrearDuenio;

    public VentanaCrearDuenio() {
        JFrame frame = new JFrame("VentanaCrearDuenio");
        frame.setContentPane(VentanaCrearDuenio);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.getRootPane().setDefaultButton(crearButton);
        frame.setVisible(true);
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textoNombre.setText("");
                textoApellidos.setText("");
                textoCodigo.setText("");

            }
        });
    }
}
