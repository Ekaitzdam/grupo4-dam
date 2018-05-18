package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearJugador {
    private JTextField textoNombre;
    private JTextField textoNickname;
    private JTextField textoSueldo;
    private JTextField textoCodigo;
    private JButton crearButton;
    private JButton cancelarButton;
    private JPanel VentanaCrearJugador;


    public VentanaCrearJugador() {
        JFrame frame = new JFrame("VentanaCrearJugador");
        frame.setContentPane(VentanaCrearJugador);
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
                textoNickname.setText("");
                textoSueldo.setText("");
                textoCodigo.setText("");

            }
        });
    }
}
