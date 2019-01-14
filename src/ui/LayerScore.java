/*
 * 文件名：LayerScore.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerScore extends Layer{
  //Image Address
    private static Image IMG_SCORE=new ImageIcon("graphics/window/scoreZone.png").getImage();
    
    public LayerScore(int x, int y, int w, int h) {
        super(x,y,w,h);
    }
    
    public void paint(Graphics g) {
        this.createWindow(g);
        g.drawImage(IMG_SCORE, this.x, this.y,this.w, this.h,null);
    }
}
