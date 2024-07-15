import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbies extends JFrame {
    private JButton backButton;

    public Hobbies() {
        setTitle("Hobbies");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel hobbyLabel = new JLabel(new ImageIcon("ruta/a/la/imagen/del/hobby.jpg"));
        hobbyLabel.setBounds(10, 10, 360, 200);
        add(hobbyLabel);

        backButton = new JButton("Regresar");
        backButton.setBounds(10, 220, 360, 25);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biografia biografiaScreen = new Biografia();
                biografiaScreen.setVisible(true);
                dispose();
            }
        });
    }
}

