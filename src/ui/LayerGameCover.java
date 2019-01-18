/*
 * �ļ�����LayerGameOver.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��18��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package ui;

import java.awt.Graphics;

public class LayerGameCover extends Layer{

    public LayerGameCover(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

    public void overPaint(Graphics g) {
        g.drawImage(Img.GAMEOVER, this.x, this.y,this.w, this.h,null);
    }
    public void startPaint(Graphics g) {
    	g.drawImage(Img.GAMECOVER, this.x, this.y,this.w, this.h,null);
    }
}
