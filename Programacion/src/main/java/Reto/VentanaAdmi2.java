package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAdmi2 {
    private JPanel VentanaAdmi2;
    private JButton generarCalendarioButton;
    private JButton introducirResultadosButton;
    private JButton atrasButton;


    public VentanaAdmi2() {
        JFrame frame = new JFrame("VentanaAdmi2");
        frame.setContentPane(VentanaAdmi2);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        /*Aqui generamos el calendario aleatoriamente*/
        generarCalendarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*Mediante este boton, el administrador introduce los resultados de la temporada*/
        introducirResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VAResultados resultado = new VAResultados();

            }
        });

        /*Retrocedemos a la ventana anterior*/
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
