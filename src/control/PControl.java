/*
 * �ļ�����PControl.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��14��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PControl extends KeyAdapter{
    
    private GameControl gameControl;
    public PControl(GameControl gameControl) {
        this.gameControl = gameControl;
    }
    
    /**
     * keyboard pressed event
     */
    @Override
    public void keyPressed(KeyEvent e) {
        //TODO ö��д������
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                this.gameControl.keyup();
                break;
                
            case KeyEvent.VK_DOWN:
                this.gameControl.keydown();
                break;
                    
            case KeyEvent.VK_LEFT:
                this.gameControl.keyleft();
                break;
                
            case KeyEvent.VK_RIGHT:
                this.gameControl.keyright();
                break;
                    

            default:
                break;
        }
    }

}
