package Pertemuan1.Tugas1;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloRivaldy {
    private static void createAndShowGUI() {

        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello Rivaldy");
        frame.getContentPane().add(label);
    
        frame.pack();
        frame. setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}