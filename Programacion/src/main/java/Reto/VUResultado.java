package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VUResultado {
    private JPanel VUResultado;
    private JButton salirButton;
    private JTable tabla;

    public VUResultado() {
        JFrame frame = new JFrame("VUResultado");
        frame.setContentPane(VUResultado);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        tabla.setModel(new TablaClasificacionModel());


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
            }
        });
    }
}
