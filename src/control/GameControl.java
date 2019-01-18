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
     * ��Ϸ�߼���
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
    	this.dto.setCoverImgShown(false);//the cover image disappear
        this.dto.setGameLoss(false);//player in the game, not fail yet
        this.dto.setProcessLock(true);//now the space key cannot use
        this.gameService.gameStart();//game start
        this.gameThread = new MainThread();//start main thread
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
