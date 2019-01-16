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

import java.awt.Font;
import java.awt.Graphics;

public class LayerRankZone extends Layer{
  //Image Address
    private static final int MAX_ROW = 5;
    private static final int Y0 = 0;
    private static final int SPA = 0;
    
    public LayerRankZone(int x, int y, int w, int h) {
        super(x,y,w,h);
        }
    
    public void paint(Graphics g) {
        this.createWindow(g);
        g.drawImage(Img.IMG_RANKZONE, this.x, this.y,this.w, this.h,null);
        drawNumber(g, 1,2);
    }
    
    /**
     * Display your rank
     */
    //TODO Need to resize and font
    
    private void drawNumber(Graphics g, int x, int y) {
        String rankNumber = "0";
        Font drawFont = new Font("Silom",Font.BOLD,16);
        g.drawString(rankNumber,this.x+125, this.y+75);
          
    }
}
