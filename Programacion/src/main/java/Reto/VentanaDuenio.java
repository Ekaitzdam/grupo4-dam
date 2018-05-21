package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDuenio {
    private JButton gestionarJugadoresButton;
    private JButton fijarJugadorButton;
    private JButton resultadosButton;
    private JButton clasificacionButton;
    private JButton salirButton;
    private JPanel VentanaDuenio;


    public VentanaDuenio() {
        JFrame frame = new JFrame("VentanaDuenio");
        frame.setContentPane(VentanaDuenio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });


        gestionarJugadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaDGestionJugador gestion = new VentanaDGestionJugador();

            }
        });
        resultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VUResultado resultado = new VUResultado();

            }
        });
    }
}
