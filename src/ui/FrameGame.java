/*
 * �ļ�����FrameGame.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��10��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package ui;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class FrameGame extends JFrame {
    public FrameGame(){
     // Title
        this.setTitle("Game by 0han");
        //Default close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Size
        this.setSize(600,450);
        //user can not change the size:
        this.setResizable(false);
        //����
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        this.setLocation(width/2-350,height/2-250);
        //����end
        this.setContentPane(new PanelGame());
    } 
}
