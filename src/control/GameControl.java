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

import dao.Data;
import dto.GameDto;
import service.GameTeris;
import ui.LayerPoint;
import window.FrameGame;
import window.PanelGame;

public class GameControl {
    private PanelGame panelGame;
    /**
     * data access implement A
     */
    private Data dataA;
    /**
     * 游戏逻辑层
     */
    private GameTeris gameService;
    //the game auto run thread
    private Thread gameThread = null;
    
    /**
     *  Data source
     */
    private GameDto dto = null;
    //private FrameGame frameGame;

    public GameControl() {
      //Game data source
        this.dto = new GameDto();
      //create game logic blocks and install data source
      //create game panel
        this.panelGame = new PanelGame(this,this.dto);
        this.gameService = new GameTeris(this.dto);
        //create the game window, install the game's panel
        new FrameGame(this.panelGame);
    }
    
    public void gameStart(){
        this.dto.setGameLoss(false);
            this.dto.setProcessLock(true);
            this.gameService.gameStart();
            this.gameThread = new MainThread();
        //Start the thread
            this.gameThread.start();
        //
            this.panelGame.repaint();
    } 
    
    
    
    private class MainThread extends Thread{
        @Override
        public void run() {
            //Main loop
            while(true) {
                if(!dto.isStart()) {
                    break;
                }
                try {
                    Thread.sleep(150);
                    gameService.mainAction();
                    panelGame.repaint();
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
}
    
    
    public void keyup() {
        this.gameService.keyup();
        this.panelGame.repaint();
    }


    public void keydown() {
        boolean flag=false;
        while(!flag) {
            flag=this.gameService.keydown();
            this.panelGame.repaint();
        }
    }

    public void keyleft() {
        this.gameService.keyleft();
        this.panelGame.repaint();
    }
    public void keyright() {
        this.gameService.keyright();
        this.panelGame.repaint();
    }
    public void pointsUp() {
        this.gameService.pointsUp();
    }
}
