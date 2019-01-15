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
        //print the blocks
        for(int i=0; i<points.length;i++) {
            g.drawImage(ACT,
                this.x + points[i].x*ACT_SIZE,
                this.x + points[i].y*ACT_SIZE,
                this.x + points[i].x*ACT_SIZE+ACT_SIZE,
                this.x + points[i].y*ACT_SIZE+ACT_SIZE,
            0,0,32,32,null);
        }
        //print the map
        boolean[][] map = this.dto.getGameMap();
        for (int x = 0; x < map.length; x++ ) {
            for (int y = 0; y < map[x].length; y++ ) {
                if (map[x][y]) {
                    g.drawImage(ACT,
                        this.x + x*ACT_SIZE,
                        this.x + y*ACT_SIZE,
                        this.x + x*ACT_SIZE+ACT_SIZE,
                        this.x + y*ACT_SIZE+ACT_SIZE,
                    0,0,32,32,null);
                }
            }
        }
        
    }
}
