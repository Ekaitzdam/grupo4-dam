package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGestionarJugador {
    private JComboBox comboJugador;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JButton atrasButton;
    private JPanel VGJugador;


    public VentanaGestionarJugador() {
        JFrame frame = new JFrame("VentanaGestionarJugador");
        frame.setContentPane(VGJugador);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VConfirmarEliminacion eliminar = new VConfirmarEliminacion();
            }
        });
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaModificarJugador jugador = new VentanaModificarJugador();

            }
        });
    }
}
