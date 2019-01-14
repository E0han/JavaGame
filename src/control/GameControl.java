/*
 * 文件名：GameControl.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package control;

import ui.PanelGame;

public class GameControl {
    private PanelGame panelGame;
    
    /**
     * 游戏逻辑层
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
