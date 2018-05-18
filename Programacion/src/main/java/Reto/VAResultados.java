package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VAResultados {
    private JComboBox elegirJornadacomboBox;
    private JComboBox elegirPartidocomboBox;
    private JComboBox elegirGanadorcomboBox;
    private JButton guardarButton;
    private JButton atrasButton;
    private JPanel VAResultados;

    public VAResultados() {
        JFrame frame = new JFrame("VAResultados");
        frame.setContentPane(VAResultados);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        DefaultComboBoxModel elegirJornadaComboBoxModel = new DefaultComboBoxModel();
        elegirJornadacomboBox.setModel(elegirJornadaComboBoxModel);
        elegirJornadaComboBoxModel.addElement("Jornada 1");
        elegirJornadaComboBoxModel.addElement("Jornada 2");
        elegirJornadaComboBoxModel.addElement("Jornada 3");
        elegirJornadaComboBoxModel.addElement("Jornada 4");
        elegirJornadaComboBoxModel.addElement("Jornada 5");
        elegirJornadaComboBoxModel.addElement("Jornada 6");
        elegirJornadaComboBoxModel.addElement("Jornada 7");
        elegirJornadaComboBoxModel.addElement("Jornada 8");
        elegirJornadaComboBoxModel.addElement("Jornada 9");
        elegirJornadaComboBoxModel.addElement("Jornada 10");
        elegirJornadaComboBoxModel.addElement("Jornada 11");
        elegirJornadaComboBoxModel.addElement("Jornada 12");
        elegirJornadaComboBoxModel.addElement("Jornada 13");
        elegirJornadaComboBoxModel.addElement("Jornada 14");


        DefaultComboBoxModel elegirPartidoComboBoxModel = new DefaultComboBoxModel();
        elegirPartidocomboBox.setModel(elegirPartidoComboBoxModel);
        elegirPartidoComboBoxModel.addElement("A");
        elegirPartidoComboBoxModel.addElement("B");
        elegirPartidoComboBoxModel.addElement("C");
        elegirPartidoComboBoxModel.addElement("D");

        DefaultComboBoxModel elegirGanadorComboBoxModel = new DefaultComboBoxModel();
        elegirGanadorcomboBox.setModel(elegirGanadorComboBoxModel);
        elegirGanadorComboBoxModel.addElement("Izquierda");
        elegirGanadorComboBoxModel.addElement("Derecha");



        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
