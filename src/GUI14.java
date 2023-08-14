import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class GUI14 {
    static Font font = new Font("Ani",Font.BOLD,50);
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel =new JPanel();
        jFrame.add(jPanel);
        jFrame.setLocationRelativeTo(null);
        JSlider jSlider= new JSlider(5,100,20);
        jSlider.setMajorTickSpacing(5);
        jFrame.add(jSlider, BorderLayout.SOUTH);
        jSlider.setPaintTicks(true);
        JLabel jLabel= new JLabel("Моя первая надпись!");
        jLabel.setFont(font);
        jPanel.add(jLabel);
        jSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int value = ((JSlider)e.getSource()).getValue();
                jLabel.setFont(new Font("Ani",Font.BOLD,value));
            }
        });


    }
    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        jFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 700 / 2, dim.height / 2 - 300 / 2, 700, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
