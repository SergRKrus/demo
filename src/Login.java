import com.mysql.cj.log.Log;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
    public static JTextField login;

    public static void login () {
        JFrame jf = new JFrame ("Авторизация");
        jf.setSize(365, 260);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelLogin = new JPanel();
        jf.add(panelLogin);

        JLabel logLabel = new JLabel("  Логин:  ");
        panelLogin.add(logLabel);
        panelLogin.add(Box.createHorizontalStrut(12));
        login = new JTextField(15);
        panelLogin.add(login);

        JLabel passwrdLabel = new JLabel("Пароль:");
        panelLogin.add(passwrdLabel);
        panelLogin.add(Box.createHorizontalStrut(12));
        JPasswordField password = new JPasswordField(15);
        panelLogin.add(password);

        JButton enter = new JButton("Войти");
        panelLogin.add(enter);

        /// вход
        enter.addActionListener(e -> {
            String pass = new String(password.getPassword());
            String queryLogin = "SELECT * FROM appaccosys.users WHERE( login = '" + login.getText() + "' AND password = '" + pass + "')";
            });

        jf.setVisible(true);
    }
}
