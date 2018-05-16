package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDGestionJugador {
    private JList list1;
    private JCheckBox jugador1CheckBox;
    private JPanel VDGestionJugadores;
    private JCheckBox jugador2CheckBox;
    private JCheckBox jugador3CheckBox;
    private JCheckBox jugador4CheckBox;
    private JCheckBox jugador5CheckBox;
    private JCheckBox jugador6CheckBox;
    private JButton fijarButton;
    private JButton seleccionarButton;
    private JButton atrasButton;

    public VentanaDGestionJugador() {
        JFrame frame = new JFrame("VentanaDGestionJugador");
        frame.setContentPane(VDGestionJugadores);
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
    }
}
