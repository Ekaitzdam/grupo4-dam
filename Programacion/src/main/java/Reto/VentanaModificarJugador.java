package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarJugador {
    private JTextField textoNombre;
    private JTextField textoNickname;
    private JTextField textoSueldo;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JPanel VMJugador;

    public VentanaModificarJugador() {
        JFrame frame = new JFrame("VentanaModificarJugador");
        frame.setContentPane(VMJugador);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.getRootPane().setDefaultButton(guardarButton);
        frame.setVisible(true);

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoNombre.setText("");
                textoNickname.setText("");
                textoSueldo.setText("");

            }
        });
    }
}
