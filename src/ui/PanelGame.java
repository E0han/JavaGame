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
    public PanelGame() {
        
    }
    @Override
    public void paintComponent(Graphics g) {
        Image img = new ImageIcon("graphics/window/window.png").getImage();
        //g.drawImage(img,0,0,null);
        g.drawImage(img,0,0,64,64,0,0,16,16,null);
    }
}
