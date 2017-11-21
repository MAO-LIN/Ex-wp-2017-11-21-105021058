import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    private int w=Toolkit.getDefaultToolkit().getScreenSize().width;
    private int h=Toolkit.getDefaultToolkit().getScreenSize().height;
    public Server(){
        initComp();
    }
    private void initComp(){
        this.setBounds(0, 0,300,150);

    }
}
