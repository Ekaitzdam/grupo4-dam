package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearEquipo {
    private JPanel VentanaCrearEquipo;
    private JTextField textoNombre;
    private JTextField textoSueldo;
    private JButton crearButton;
    private JButton cancelarButton;


    public VentanaCrearEquipo() {
        JFrame frame = new JFrame("VentanaCrearEquipo");
        frame.setContentPane(VentanaCrearEquipo);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
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

            }
        });
    }
}
