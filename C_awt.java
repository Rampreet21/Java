import java.awt.*;
import java.awt.event.*;

public class C_awt {
    public static void main(String[] args) {
        
        Frame fra = new Frame("RK");
        
        Button btu = new Button("Click");

        btu.setBounds(600, 300, 130, 40);
        btu.setBackground(Color.RED); 
        btu.setForeground(Color.blue); 
        btu.setFont(new Font("Arial", Font.BOLD, 24)); 


        fra.add(btu);
        fra.setSize(1280, 720);
        fra.setLayout(null);
        fra.setBackground(Color.BLACK); 
        fra.setVisible(true);

        fra.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fra.dispose();
            }
        });

    }
}
