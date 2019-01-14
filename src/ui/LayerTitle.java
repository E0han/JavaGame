/*
 * �ļ�����LayerTitle.java
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

public class LayerTitle extends Layer{
  //Image Address
    private static Image IMG_LOGO=new ImageIcon("graphics/string/Title.png").getImage();
    
    public LayerTitle(int x, int y, int w, int h) {
        super(x,y,w,h);
    }
    
    public void paint(Graphics g) {
        this.createWindow(g);
        g.drawImage(IMG_LOGO, this.x, this.y, this.w, this.h,null);
    }
}
