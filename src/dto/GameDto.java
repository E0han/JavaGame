/*
 * 文件名：GameDto.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package dto;

import java.util.List;

import entity.GameAct;
import ui.Layer;
import ui.LayerPoint;
import window.PanelGame;

public class GameDto {
    
    private List<Player> dbRecord;
    private List<Player> diskRecord;
    private boolean[][] gameMap;
    private GameAct gameact;
    private LayerPoint scorePoint;
    private boolean GameLoss;
    private int nowPoint; // game point
    private int nowRemoveline;
    private boolean start =false;

    
    public GameDto() {
        dtoInit();
        
    }
    /**
     * dto initilization
     */
    public void dtoInit() {
        this.gameMap = new boolean[14][29];
        this.nowPoint=0;
        this.nowRemoveline=0;
    }
    
    
    public List<Player> getDbRecord() {
        return dbRecord;
    }
    public void setDbRecord(List<Player> dbRecord) {
        this.dbRecord = dbRecord;
    }
    public List<Player> getDiskRecord() {
        return diskRecord;
    }
    public void setDiskRecord(List<Player> diskRecord) {
        this.diskRecord = diskRecord;
    }
    public boolean[][] getGameMap() {
        return gameMap;
    }
    public void setGameMap(boolean[][] gameMap) {
        this.gameMap = gameMap;
    }
    public GameAct getGameact() {
        return gameact;
    }
    public void setGameact(GameAct gameact) {
        this.gameact = gameact;
    }

    public int getNowPoint() {
        return nowPoint;
    }
    public void setNowPoint(int nowPoint) {
        this.nowPoint = nowPoint;
    }
    public int getNowRemoveline() {
        return nowRemoveline;
    }
    public void setNowRemoveline(int nowRemoveline) {
        this.nowRemoveline = nowRemoveline;
    }
    /**
     * When the game runs, processLock on
     * to prevent player press other buttons
     * like space during the game
     */
    private boolean processLock = false;
    
    public boolean isProcessLock() {
        return processLock;
    }
    public void setProcessLock(boolean processLock) {
        this.processLock = processLock;
    }
    
    public boolean isStart() {
        return start;
    }
    public void setStart(boolean start) {
        this.start = start;
    }

    public Layer getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(LayerPoint scorePoint) {
        this.scorePoint = scorePoint;
    }
    public boolean isGameLoss() {
        return GameLoss;
    }
    public void setGameLoss(boolean gameLoss) {
        GameLoss = gameLoss;
    }
    
}
