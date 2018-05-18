package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGestionarEquipo {
    private JComboBox comboEquipo;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JButton atrasButton;
    private JPanel VGEquipo;


    public VentanaGestionarEquipo() {
        JFrame frame = new JFrame("VentanaGestionarEquipo");
        frame.setContentPane(VGEquipo);
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
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaModificarEquipo equipo = new VentanaModificarEquipo();

            }
        });
    }
}
