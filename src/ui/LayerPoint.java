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

public class LayerPoint extends Layer {

    public LayerPoint(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        //g.drawImage(Img.IMG_RANKZONE, this.x, this.y,this.w, this.h,null);
        
    }
    /**
     * This method will print the Score 
     * as the int value input
     */
    public void paintPoint(Graphics g, int Number) {
        
    }
}
