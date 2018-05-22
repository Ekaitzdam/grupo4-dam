package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAdmi {
    private JComboBox elegirComboBox;
    private JButton crearButton;
    private JButton gestionarButton;
    private JPanel VentanaAdmi;
    private JButton salirButton;
    private JButton masButton;


    public VentanaAdmi() {
        JFrame frame = new JFrame("VentanaAdmi");
        frame.setContentPane(VentanaAdmi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        /*Con este boton salimos del programa*/
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        /*Con este boton gestionamos los jugadores, equipos y los dueños*/
        gestionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String seleccion = elegirComboBoxModel.getSelectedItem().toString();


                if(seleccion.equalsIgnoreCase("Jugadores")){

                    VentanaGestionarJugador jugador = new VentanaGestionarJugador();
                }

                if(seleccion.equalsIgnoreCase("Equipos")){

                    VentanaGestionarEquipo equipo = new VentanaGestionarEquipo();
                }

                if(seleccion.equalsIgnoreCase("Dueños")) {

                    VentanaGestionarDuenio duenio = new VentanaGestionarDuenio();
                }

            }
        });

        /*Con este boton generamos calendarios y resultados*/
        masButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAdmi2 admi2 = new VentanaAdmi2();

            }
        });
    }
}
