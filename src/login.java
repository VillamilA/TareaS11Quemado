import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField textField1;
    private JPanel acceso;
    private JPasswordField passwordField1;
    private JButton Login;
    private JLabel usuario;
    private JLabel contra;
    private JFrame frame;

    public login (){
        super("Acceso");
        setContentPane(acceso);
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biografia ventana_n = new biografia();
                ventana_n.iniciar();
                dispose();

            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300,400);
        // para cerrrrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
