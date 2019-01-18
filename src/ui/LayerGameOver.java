/*
 * 文件名：LayerGameOver.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月18日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Graphics;

public class LayerGameOver extends Layer{

    public LayerGameOver(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        g.drawImage(Img.GAMEOVER, this.x, this.y,this.w, this.h,null);
    }
}
