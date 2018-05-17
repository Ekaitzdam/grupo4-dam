package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGestionarDuenio {
    private JComboBox comboBox1;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JButton atrasButton;
    private JPanel VGDuenio;


    public VentanaGestionarDuenio() {
        JFrame frame = new JFrame("VentanaGestionarDuenio");
        frame.setContentPane(VGDuenio);
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

                VentanaModificarDuenio duenio = new VentanaModificarDuenio();
            }
        });
    }


}
