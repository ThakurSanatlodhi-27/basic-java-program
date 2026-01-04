import javax.swing.*;
public class LearningSwing {
    public static void main(String args[]){
        JFrame jFrame=new JFrame("MY FIRST APP");

        JButton jButton=new JButton("CLICK ME");
        jButton.setBounds(100, 80, 120, 30);
        jFrame.add(jButton);
        jFrame.setSize(300,200);
              jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

   
