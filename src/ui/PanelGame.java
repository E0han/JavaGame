/*
 * �ļ�����PanelGame.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��10��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel {
    private Lay[] lays = null;
    public PanelGame() {
        lays = new Lay[] {
            new Lay(173,41,246,342),
            new Lay(26,41,119,222),
            new Lay(446, 41, 119,100),
            new Lay(26,284,119,100),
            new Lay(446,162,119,222)
        };
    }
    @Override
    public void paintComponent(Graphics g) {
        for(int i =0;i<lays.length;i++) {
            lays[i].createWindow(g);
        }
        //g.drawImage(img,0,0,null);    
    }
}
