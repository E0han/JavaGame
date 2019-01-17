/*
 * �ļ�����LayerLogo.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��14��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerLogo extends Layer{
    //Image Address
    public LayerLogo(int x, int y, int w, int h) {
        super(x,y,w,h);
    }
    
    public void paint(Graphics g) {
        this.createWindow(g);
        g.drawImage(Img.LOGO, this.x, this.y,this.w, this.h,null);
    }
}
