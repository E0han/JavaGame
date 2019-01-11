/*
 * 文件名：Lay.java
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

public class Layer {
    private static final int SIZE =7;
    private static final Image IMG = new ImageIcon("graphics/window/window.png").getImage();
    private static final int IMGW = IMG.getWidth(null);
    private static final int IMGH = IMG.getHeight(null);
    /**
     * 窗口左上角x坐标
     */
    protected int x;
    /**
     * 窗口左上角y坐标
     */
    protected int y;
    /**
     * 窗口宽度
     */
    protected int w;
    /**
     * 窗口高度
     */
    protected int h;
    
    public Layer(int x,int y,int w,int h) {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    /**
     * 绘制窗口
     * Description: <br>
     * 1、…<br>
     * 2、…<br>
     * Implement: <br>
     * 1、…<br>
     * 2、…<br>
     *  
     * @see
     */
    public void createWindow(Graphics g) {
      //left-up
        g.drawImage(IMG,x,y,x + SIZE,y+SIZE,0,0,SIZE,SIZE,null);
        //middle-up
        g.drawImage(IMG,x+SIZE,y,x+w-SIZE,y+SIZE,SIZE,0,IMGW-SIZE,SIZE,null);
        //right-up
        g.drawImage(IMG,x+w-SIZE,y,x+w,y+SIZE,IMGW - SIZE,0,IMGW,SIZE,null);
        //left-mid
        g.drawImage(IMG, x, y+SIZE,x+w-SIZE,y+h-SIZE,0,SIZE,SIZE,IMGH-SIZE,null);
        //middle
        g.drawImage(IMG, x+SIZE,y+SIZE,x+w-SIZE,y+h-SIZE,SIZE,SIZE,IMGW-SIZE,IMGH-SIZE,null);
        //right-mid
        g.drawImage(IMG,x+w-SIZE,y+SIZE,x+w,y+h-SIZE,IMGW-SIZE,SIZE,IMGW,IMGH-SIZE,null);
        //left-down
        g.drawImage(IMG,x,y+h-SIZE,x+SIZE,y+h,0,IMGH-SIZE,SIZE,IMGH,null);
        //mid-down
        g.drawImage(IMG,x+SIZE,y+h-SIZE,x+w-SIZE,y+h,SIZE,IMGH-SIZE,IMGW-SIZE,IMGH,null);
        //right-down
        g.drawImage(IMG,x+w-SIZE,y+h-SIZE,x+w,y+h,IMGW-SIZE,IMGH-SIZE,IMGW,IMGH,null);
    }
    /**
     * @author 0han
     * @param g 
     * @see
     */
    public void paint(Graphics g) {}
}
