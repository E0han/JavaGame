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

public class LayerPoint extends Layer {

    public LayerPoint(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
    }
}
