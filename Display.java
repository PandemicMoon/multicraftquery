import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Display {
  private JFrame frame;
  private JTextArea textArea;
  public Display() {
    frame = new JFrame("Multicraft Query");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(725, 450);
    frame.setLocationRelativeTo(null);
    
    textArea = new JTextArea("Welcome to Pandemic Moon's Multicraft Query,\nadapted to work with any multicraft installation from chromestone's MCProhosting Query.", 50, 50);
    textArea.setEditable(false);
    
    JScrollPane scrollPane = new JScrollPane(textArea);
    JPanel panel = new JPanel();
    panel.setOpaque(true);
    panel.add(scrollPane);
    
    JButton button = new JButton("Exit");
    button.addMouseListener(new MouseInputAdapter() {
      public void mouseClicked(MouseEvent event) {
        System.exit(0);
      }
    });
    panel.add(button);
    
    frame.add(panel);
  }
  public void show() {
    frame.setVisible(true);
  }
  public void hide() {
    frame.setVisible(false);
  }
  public void append(String text) {
    textArea.append("\n" + text);
  }
  public void dispose() {
    frame.dispose();
  }
}
