import javax.swing.*;

public class MessagePane {
    public static void messagePane(String message){
        JOptionPane pane = new JOptionPane();
        JOptionPane.showMessageDialog(pane, message);
        pane.setSize(100, 100);
        pane.setVisible(false);
    }
}
