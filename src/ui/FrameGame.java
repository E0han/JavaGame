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
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class FrameGame extends JFrame {
    public FrameGame(){
     // Title
        this.setTitle("Game by 0han");
        //Default close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Size
        this.setSize(600,450);
        //user can not change the size:
        this.setResizable(false);
        //居中
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        this.setLocation(width/2-350,height/2-250);
        //居中end
        this.setContentPane(new PanelGame());
    } 
}
