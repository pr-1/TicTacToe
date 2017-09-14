import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    JPanel p= new JPanel();
    static JButton[] buttons =new JButton[9];
    XOButton listener=new XOButton();
    public static void main(String[] args) {

        TicTacToe f=new TicTacToe();
    }
    public TicTacToe(){
        setTitle("TicTacToe");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++)
        {
            buttons[i]=  new JButton();
            buttons[i].addActionListener(listener);
            p.add(buttons[i]);
        }
        add(p);
        setVisible(true);
    }
}
