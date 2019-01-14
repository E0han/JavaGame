/*
 * �ļ�����LayGame.java
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
import java.awt.Point;

import javax.swing.ImageIcon;

public class LayerGame extends Layer {
    private static Image ACT = new ImageIcon("graphics/game/rect.png").getImage();
    private static int ACT_SIZE = 32;
    
    
    public LayerGame(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        //g.drawImage(ACT, 32, 32, null, null);
        Point[] points = this.dto.getGameact().getActPoint();
        for(int i=0; i<points.length;i++) {
            g.drawImage(ACT,
                this.x + points[i].x*ACT_SIZE,
                this.x + points[i].y*ACT_SIZE,
                this.x + points[i].x*ACT_SIZE+ACT_SIZE,
                this.x + points[i].y*ACT_SIZE+ACT_SIZE,
            32,0,64,32,null);
        }
        this.dto.getGameact();
        
    }
}
