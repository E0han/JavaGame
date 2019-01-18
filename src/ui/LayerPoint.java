/*
 * 文件名：LayPoint.java
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
import java.util.ArrayList;
import java.util.List;

public class LayerPoint extends Layer {

    public LayerPoint(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        drawNumber(this.x, this.y, this.dto.getNowPoint(), g,32);
    }
    /**
     * This method will print the Score 
     * as the int value input
     */
    public void paintPoint(Graphics g) {
        g.drawImage(NUM_CONFIG.get(0),this.x, this.y,this.w, this.h,null);
    }
    public void paintPoint(Graphics g, int number) {
        
    }
}
