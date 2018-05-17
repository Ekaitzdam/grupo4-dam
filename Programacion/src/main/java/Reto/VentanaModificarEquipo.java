package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarEquipo {
    private JTextField textoNombre;
    private JTextField textoSueldoanual;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JPanel VMEquipo;

    public VentanaModificarEquipo() {
        JFrame frame = new JFrame("VentanaModificarEquipo");
        frame.setContentPane(VMEquipo);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.getRootPane().setDefaultButton(guardarButton);
        frame.setVisible(true);

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textoNombre.setText("");
                textoSueldoanual.setText("");

            }
        });
    }
}
