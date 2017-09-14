import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOButton  implements ActionListener {
    ImageIcon X,O;
    byte value=1;
    JButton button[]=TicTacToe.buttons;
    public XOButton(){
        X=new ImageIcon(this.getClass().getResource("X.png"));
        O=new ImageIcon(this.getClass().getResource("O.jpeg"));


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton b =(JButton)e.getSource();

        if(b.getIcon()==null){
        if (value%2!=0) {
            b.setIcon(X);
            value++;
        }
        else{
            b.setIcon(O);
            value++;
        }

        }
        if(checkWinner()){
            if(value%2==0)
            JOptionPane.showMessageDialog(null,"Winner is X");
            else
                JOptionPane.showMessageDialog(null,"Winner is O");
            new TicTacToe();

        }
        if(value==10){
            JOptionPane.showMessageDialog(null,"Game Draw");
            new TicTacToe();
        }

        
        }
    boolean checkWinner()

    {
        if ((button[0].getIcon() == button[1].getIcon()) && (button[1].getIcon() == button[2].getIcon())&&(button[0].getIcon()!=null)) {
            return true;
        }
        else if ((button[0].getIcon() == button[3].getIcon()) && (button[3].getIcon() == button[6].getIcon())&&(button[0].getIcon()!=null)) {
            return true;
        }
        else if ((button[0].getIcon() == button[4].getIcon()) && (button[4].getIcon() == button[8].getIcon())&&(button[0].getIcon()!=null)) {
            return true;
        }
        else if ((button[1].getIcon() == button[4].getIcon()) && (button[4].getIcon() == button[7].getIcon())&&(button[4].getIcon()!=null)) {
            return true;
        }
        else if ((button[2].getIcon() == button[4].getIcon()) && (button[4].getIcon() == button[6].getIcon())&&(button[4].getIcon()!=null)) {
            return true;
        }
        else if ((button[2].getIcon() == button[5].getIcon()) && (button[5].getIcon() == button[8].getIcon())&&(button[8].getIcon()!=null)) {
            return true;
        }
        else if ((button[3].getIcon() == button[4].getIcon()) && (button[4].getIcon() ==button[5].getIcon())&&(button[4].getIcon()!=null)) {
            return true;
        }
        else if ((button[6].getIcon() == button[7].getIcon()) && (button[7].getIcon() == button[8].getIcon())&&(button[8].getIcon()!=null)) {
            return true;
        }
        else
            return false;

    }
    }


