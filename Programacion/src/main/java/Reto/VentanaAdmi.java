package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAdmi {
    private JComboBox elegirComboBox;
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


        DefaultComboBoxModel elegirComboBoxModel = new DefaultComboBoxModel();
        elegirComboBox.setModel(elegirComboBoxModel);
        elegirComboBoxModel.addElement("Jugadores");
        elegirComboBoxModel.addElement("Equipos");
        elegirComboBoxModel.addElement("Duenios");

        crearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String seleccion = elegirComboBoxModel.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null, seleccion);

                if(seleccion.equalsIgnoreCase("Jugadores")){

                    VentanaCrearJugador jugador = new VentanaCrearJugador();
                }

                if(seleccion.equalsIgnoreCase("Equipos")){

                    VentanaCrearEquipo equipo = new VentanaCrearEquipo();
                }

                if(seleccion.equalsIgnoreCase("Duenios")) {

                    VentanaCrearDuenio duenio = new VentanaCrearDuenio();
                }

            }
        });

    }
}
