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

import dto.GameDto;

public class Layer {
    private static final Image Window_IMG = new ImageIcon("graphics/window/window.png").getImage();
    private static final int IMGW = Window_IMG.getWidth(null);
    private static final int IMGH = Window_IMG.getHeight(null);
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
    /**
     * Game's data
     */
    protected GameDto dto=null;
    
    public Layer(int x,int y,int w,int h) {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    
    //
    public void createWindow(Graphics g) {
      //left-up
        g.drawImage(Window_IMG, x, y, w, h, null);
}
    
    public void setDto(GameDto dto) {
        this.dto = dto;
    }
    /**
     * @author 0han
     * @param g 
     * @see
     */
    public void paint(Graphics g) {}
}
