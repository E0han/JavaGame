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
import ui.FrameGame;
import ui.PanelGame;

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
        this.gameService.gameStart();
        this.panelGame.repaint();
        this.gameThread = new Thread() {
            @Override
            public void run() {
                //Main loop
                panelGame.repaint();
                while(true) {
                    try {
                        gameService.mainAction();
                        Thread.sleep(200);
                        panelGame.repaint();
                    }
                    catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        //Start the thread
        this.gameThread.start();
        //
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
}
