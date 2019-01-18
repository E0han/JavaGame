package window;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class FrameGame extends JFrame {
    public FrameGame(PanelGame panelGame){
        GameConfig cfg = ConfigFactory.getGameConfig();
     // Title
        this.setTitle("Tetris by 0han[DEBUG]");
        //Default close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Size
        this.setSize(cfg.getWidth(),cfg.getHeight());
        //this.setRealWindowSize();
        //user can not change the size:
        this.setResizable(true);
        //æ”÷–
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        //this.setLocation(width/2,height/2);
        //æ”÷–end
        this.setContentPane(panelGame);
        this.setVisible(true);
    }
    
    private void setRealWindowSize() {
        /**
         * ScreenSize updated
         */
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = dim.getWidth();
        double screenHeight = dim.getHeight();
        this.setSize((int)(screenWidth*0.3),(int)((screenWidth*0.3)/0.75));
        
    }
}
