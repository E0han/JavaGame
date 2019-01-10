/*
 * 文件名：PanelGame.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月10日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel {
    public PanelGame() {
        
    }
    @Override
    public void paintComponent(Graphics g) {
        Image img = new ImageIcon("graphics/window/window.png").getImage();
        //g.drawImage(img,0,0,null);
        g.drawImage(img,0,0,64,64,0,0,16,16,null);
    }
}
