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

public class Layer {
    private static final int SIZE =7;
    private static final Image IMG = new ImageIcon("graphics/window/window.png").getImage();
    private static final int IMGW = IMG.getWidth(null);
    private static final int IMGH = IMG.getHeight(null);
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
    
    public Layer(int x,int y,int w,int h) {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    /**
     * ���ƴ���
     * Description: <br>
     * 1����<br>
     * 2����<br>
     * Implement: <br>
     * 1����<br>
     * 2����<br>
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
