/*
 * �ļ�����LayerRank.java
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

public class LayerRankZone extends Layer{
  //Image Address
    private static Image IMG_RANKZONE=new ImageIcon("graphics/window/rankZone.png").getImage();
    
    public LayerRankZone(int x, int y, int w, int h) {
        super(x,y,w,h);
    }
    
    public void paint(Graphics g) {
        this.createWindow(g);
        g.drawImage(IMG_RANKZONE, this.x, this.y,this.w, this.h,null);
    }
}
