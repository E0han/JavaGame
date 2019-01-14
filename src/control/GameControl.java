/*
 * �ļ�����GameControl.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��14��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package control;

import ui.PanelGame;

public class GameControl {
    private PanelGame panelGame;
    
    /**
     * ��Ϸ�߼���
     */
    private GameService gameService;
    
    
    public GameControl(PanelGame panelGame, GameService gameService) {
        this.panelGame = panelGame;
        this.gameService = gameService;
    }
    public void keyup() {
        this.gameService.keyup();
        this.panelGame.repaint();
    }


    public void keydown() {
        this.gameService.keydown();
        this.panelGame.repaint();
    }


    public void keyleft() {
        this.gameService.keyleft();
        this.panelGame.repaint();
    }
    public void keyright() {
        this.gameService.keyright();
        this.panelGame.repaint();
    }
}
