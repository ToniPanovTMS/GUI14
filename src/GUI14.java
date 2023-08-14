import javax.swing.*;
import java.awt.*;

class GUI14 {
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel =new JPanel();
        jFrame.add(jPanel);
        Font font = new Font("Ani",Font.BOLD,50);
        JLabel jLabel= new JLabel("Моя первая надпись!");
        jLabel.setFont(font);
        jPanel.add(jLabel);
    }
    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        jFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 300 / 2, dim.height / 2 - 150 / 2, 600, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
