/*
 * �ļ�����LayPoint.java
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

public class LayerPoint extends Layer {
    private static List<Image> NUM_CONFIG;
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
    public LayerPoint(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        paintPoint(g);
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
