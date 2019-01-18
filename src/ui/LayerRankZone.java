/*
 * 文件名：LayerRank.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Font;
import java.awt.Graphics;

public class LayerRankZone extends Layer{
  //Image Address
    private static final int MAX_ROW = 5;
    private static final int Y0 = 0;
    private static final int SPA = 0;
    
    public LayerRankZone(int x, int y, int w, int h) {
        super(x,y,w,h);
        }
    
    public void paint(Graphics g) {
        //this.createWindow(g);
        g.drawImage(Img.IMG_RANKZONE, this.x , this.y,this.w, this.h,null);
    }
    
    /**
     * Display your rank
     */
    //TODO Need to resize and font
    
}
