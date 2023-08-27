package CrossPlatform;
import javax.swing.*;

public class WindowsButton implements Button
{
    @Override
    public void render() {

        JFrame frame = new JFrame("Windows Buttom Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,100);

        JButton button = new JButton("Click me");
        button.putClientProperty("JButton.buttonType", "windows");
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public JButton onClick() {
       JButton button = new JButton("Click me");
       button.putClientProperty("JButton.buttonType", "windows");
       return button;

    }

    class windowsButtonEcenttHandler{
        public void attachEventListener(JButton button){
            button.addActionListener(e->{
                JOptionPane.showMessageDialog(null,"Button Clicked");
            });
        }
    }
}
