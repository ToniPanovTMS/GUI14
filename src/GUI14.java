import javax.swing.*;
import java.awt.*;

class GUI14 {
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel =new JPanel();
        jFrame.add(jPanel);
        JLabel jLabel= new JLabel("Моя первая надпись!");
        jPanel.add(jLabel);
    }
    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        jFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 300 / 2, dim.height / 2 - 150 / 2, 300, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
