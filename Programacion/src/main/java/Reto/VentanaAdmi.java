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
    private JButton salirButton;


    public VentanaAdmi() {
        JFrame frame = new JFrame("VentanaAdmi");
        frame.setContentPane(VentanaAdmi);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        DefaultComboBoxModel elegirComboBoxModel = new DefaultComboBoxModel();
        elegirComboBox.setModel(elegirComboBoxModel);
        elegirComboBoxModel.addElement("Jugadores");
        elegirComboBoxModel.addElement("Equipos");
        elegirComboBoxModel.addElement("Dueños");

        crearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String seleccion = elegirComboBoxModel.getSelectedItem().toString();


                if(seleccion.equalsIgnoreCase("Jugadores")){

                    VentanaCrearJugador jugador = new VentanaCrearJugador();
                }

                if(seleccion.equalsIgnoreCase("Equipos")){

                    VentanaCrearEquipo equipo = new VentanaCrearEquipo();
                }

                if(seleccion.equalsIgnoreCase("Dueños")) {

                    VentanaCrearDuenio duenio = new VentanaCrearDuenio();
                }

            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
