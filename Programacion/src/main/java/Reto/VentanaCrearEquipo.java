package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearEquipo {
    private JPanel VentanaCrearEquipo;
    private JTextField textField1;
    private JTextField textField2;
    private JButton crearButton;
    private JButton cancelarButton;


    public VentanaCrearEquipo() {
        JFrame frame = new JFrame("VentanaCrearEquipo");
        frame.setContentPane(VentanaCrearEquipo);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
