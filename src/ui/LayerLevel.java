/*
 * 文件名：LayLevel.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerLevel extends Layer {
    private static Image IMG_DISK = new ImageIcon("graphics/string/db.png").getImage();
    
    public LayerLevel(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
    }
}
