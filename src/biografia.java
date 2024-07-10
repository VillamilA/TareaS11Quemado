import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biografia extends JFrame {
    private JPanel biografia;
    private JButton verHobbiesButton;

    public biografia() {
        super("Datos");
        setContentPane(biografia);
        verHobbiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hobbies ventana_hobbies = new hobbies();
                ventana_hobbies.iniciar();
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