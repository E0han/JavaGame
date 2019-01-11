/*
 * 文件名：LayDataBase.java
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

public class LayerDataBase extends Layer {
    private static Image IMG_DB = new ImageIcon("graphics/string/db.png").getImage();
    public LayerDataBase(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        //this means 相对坐标
        g.drawImage(IMG_DB, this.x+8, this.y+16,null );
    }
}
