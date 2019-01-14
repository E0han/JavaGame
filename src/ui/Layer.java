/*
 * �ļ�����Lay.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
     * �������Ͻ�x����
     */
    protected int x;
    /**
     * �������Ͻ�y����
     */
    protected int y;
    /**
     * ���ڿ��
     */
    protected int w;
    /**
     * ���ڸ߶�
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
