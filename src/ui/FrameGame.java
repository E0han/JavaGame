/*
 * 文件名：FrameGame.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月10日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class FrameGame extends JFrame {
    public FrameGame(PanelGame panelGame){
        GameConfig cfg = ConfigFactory.getGameConfig();
     // Title
        this.setTitle("Game by 0han");
        //Default close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Size
        this.setSize(cfg.getWidth(),cfg.getHeight());
        //user can not change the size:
        this.setResizable(false);
        //居中
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        this.setLocation(width/2-350,height/2-250);
        //居中end
        this.setContentPane(panelGame);
        this.setVisible(true);
    } 
}
