import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField user;
    private JPanel acceso;
    private JPasswordField password;
    private JButton Login;
    private JLabel usuario;
    private JLabel contra;
    private JFrame frame;

    public login() {
        super("Acceso");
        setContentPane(acceso);
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String contra = "POO123";
                String usuario = "avillamil";
                String contraIngresada =  password.getText();
                String UsuarioIngresado = user.getText();
                if(contra.equals(contraIngresada) && usuario.equals(UsuarioIngresado)) {
                    biografia ventana_n = new biografia();
                    ventana_n.iniciar();
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                }
            }
        });
    }

    public void iniciar() {
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 600);
        // para cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}