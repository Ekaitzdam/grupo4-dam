package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VConfirmarEliminacion {
    private JButton siButton;
    private JButton noButton;
    private JPanel VCEliminacion;


    public VConfirmarEliminacion() {
        JFrame frame = new JFrame("VConfirmarEliminacion");
        frame.setContentPane(VCEliminacion);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
