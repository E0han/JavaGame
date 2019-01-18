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
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import dto.GameDto;

public class Layer {
    private static final Image Window_IMG = new ImageIcon("graphics/window/window.png").getImage();
    private static final int IMGW = Window_IMG.getWidth(null);
    private static final int IMGH = Window_IMG.getHeight(null);
    protected static List<Image> NUM_CONFIG;
    static {
        NUM_CONFIG = new ArrayList<Image>(10);
        NUM_CONFIG.add(Img.zero);
        NUM_CONFIG.add(Img.one);
        NUM_CONFIG.add(Img.two);
        NUM_CONFIG.add(Img.three);
        NUM_CONFIG.add(Img.four);
        NUM_CONFIG.add(Img.five);
        NUM_CONFIG.add(Img.six);
        NUM_CONFIG.add(Img.seven);
        NUM_CONFIG.add(Img.eight);
        NUM_CONFIG.add(Img.nine);
        
    }
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
    protected  static final int IMG_RECT_H = Img.RECT.getHeight(null);
    
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
    /**
     * This version of drawNUmber is used for the score position
     * it will automatically print 0 before the numeber you input
     * and make it looks better than single number
     */
    protected void drawNumber(int x, int y, int num, Graphics g,int p) {
        String strNum = Integer.toString(num);
        int PAD=0;
        for (int j = 0; j < 6-strNum.length(); j++ ) {
            g.drawImage(NUM_CONFIG.get(0),x+PAD,y,this.w, this.h,null);
            PAD+=p;
        }
        for (int i = 0; i < strNum.length(); i++ ) {
            int bit=strNum.charAt(i)-'0';
            g.drawImage(NUM_CONFIG.get(bit),x+PAD,y,this.w, this.h,null);
            PAD+=p;
        }
    }
    
    /**
     * This version of drawNUmber is for the rank position
     * Input any int as flag to indicate you gonna use this 
     * rather the one above
     */
    protected void drawNumber(int x, int y, int num, Graphics g,int p, int flag) {
        String strNum = Integer.toString(num);
        int PAD=0;
        for (int i = 0; i < strNum.length(); i++ ) {
            int bit=strNum.charAt(i)-'0';
            g.drawImage(NUM_CONFIG.get(bit),x+PAD,y,this.w, this.h,null);
            PAD+=p;
        }
    }
}
