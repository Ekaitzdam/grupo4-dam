package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarDuenio {
    private JTextField textoNombre;
    private JTextField textoApellidos;
    private JTextField textocodigo;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JPanel VMDuenio;

    public VentanaModificarDuenio() {
        JFrame frame = new JFrame("VentanaModificarDuenio");
        frame.setContentPane(VMDuenio);
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
                textoApellidos.setText("");
                textocodigo.setText("");


            }
        });
    }
}
