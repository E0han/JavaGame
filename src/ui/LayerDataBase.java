/*
 * �ļ�����LayDataBase.java
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

public class LayerDataBase extends Layer {
    private static Image IMG_DB = new ImageIcon("graphics/string/db.png").getImage();
    public LayerDataBase(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        //this means �������
        g.drawImage(IMG_DB, this.x+8, this.y+16,null );
    }
}
