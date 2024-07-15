import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia extends JFrame {
    private JButton hobbiesButton;

    public Biografia() {
        setTitle("Biografía");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel bioLabel = new JLabel("<html>Biografía del usuario:<br>Nombre: Juan Pérez<br>Edad: 30<br>Profesión: Ingeniero</html>");
        bioLabel.setBounds(10, 10, 280, 100);
        add(bioLabel);

        hobbiesButton = new JButton("Ver Hobbies");
        hobbiesButton.setBounds(10, 120, 260, 25);
        add(hobbiesButton);

        hobbiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hobbies hobbiesScreen = new Hobbies();
                hobbiesScreen.setVisible(true);
                dispose();
            }
        });
    }
}
