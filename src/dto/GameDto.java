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

public class GameDto {
    
    private List<Player> dbRecord;
    private List<Player> diskRecord;
    private boolean[][] gameMap;
    private GameAct gameact;
    private int level;
    private int nowPoint;
    private int nowRemoveline;
    
    public GameDto() {
        dtoInit();
    }
    /**
     * dto initilization
     */
    public void dtoInit() {
        this.gameMap = new boolean[14][29];
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
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
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
    private boolean start =false;
    //TODO need to remove later

    public boolean isStart() {
        return start;
    }
    public void setStart(boolean start) {
        this.start = start;
    }
    
}
