import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 10, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 10, 160, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 40, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 40, 160, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 250, 25);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Verificar las credenciales
                if (username.equals("usuario") && password.equals("contraseña")) {
                    Biografia biografiaScreen = new Biografia();
                    biografiaScreen.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}


