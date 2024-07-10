import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobbies extends JFrame{
    private JButton regresarButton;
    private JButton cerrarButton;
    private JPanel hobbies;

    public hobbies() {

        super("Hobbies");
        setContentPane(hobbies);
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biografia ultima = new biografia();
                ultima.iniciar();
                dispose();
            }
        });
    }


    public void iniciar() {
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300, 400);
        // para cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
