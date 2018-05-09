package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAdmi {
    private JComboBox combo;
    private JButton crearButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JPanel VentanaAdmi;


    public VentanaAdmi() {
        JFrame frame = new JFrame("VentanaAdmi");
        frame.setContentPane(VentanaAdmi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        combo = new JComboBox();
        combo.addItem("Dueños");
        combo.addItem("Equipos");
        combo.addItem("Jugadores");

        crearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {





            }
        });

    }
}
