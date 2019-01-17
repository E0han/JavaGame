/*
 * 文件名：GameTeris.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月16日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package service;

import java.awt.Point;
import java.util.Random;

import dto.GameDto;
import entity.GameAct;

public class GameTeris implements GameService {
    private GameDto dto;
    public GameTeris(GameDto dto){
        this.dto = dto;
        GameAct act = new GameAct();
        dto.setGameact(act);
    }
    @Override
    public boolean keyup() {
        //TODO research synchronized
        synchronized (this.dto) {
            this.dto.getGameact().round(this.dto.getGameMap());
        }
        return true;
    }
    @Override
    public boolean keydown() {
        synchronized (this.dto) {
            if(this.dto.getGameact().move(0,1,this.dto.getGameMap())) {
                if(this.isLose()) {
                    
                    this.afterLose();
                }
                return false;
            }
            // get Game map object
            boolean[][] map = this.dto.getGameMap();
            // Cube object
            Point[] act = this.dto.getGameact().getActPoint();
            //cube in to map array
            for (int i = 0; i < act.length; i++ ) {
                map[act[i].x][act[i].y] = true;
            }
            //check 消行，计算分数
            int plusExp=this.plusPoint();
            //如果消行
            if(plusExp>0) {
                //增加经验
                this.plusPoint();
            }
            //new cube
            this.dto.getGameact().init(new Random().nextInt(6));
            //check whether fail
            if(this.isLose()) {
                this.afterLose();
                return false;
            }
            return true;
        }
    }
    

    private void afterLose() {
        // TODO Auto-generated method stub
        System.out.println("Loss");
        this.dto.setStart(false);
        this.dto.setProcessLock(true);
    }

    private boolean isLose() {
        if(checkLose()) {
            this.dto.setProcessLock(true);
            return true;
        }
        return false;
    }
    @Override
    public boolean keyleft() {
        synchronized (this.dto) {
            return this.dto.getGameact().move(-1,0,this.dto.getGameMap());
        }
    }
    @Override
    public boolean keyright() {
        synchronized (this.dto) {
            return this.dto.getGameact().move(1,0,this.dto.getGameMap());
        }
    }
    

    /** 
     * 消行
     * @return 
     */
    private int plusPoint() {
        //TODO return exp
        boolean[][] map=this.dto.getGameMap();
        int exp=0;
        for (int y = 0; y < 29; y++ ) {
            if(isCanRemoveLine(y,map)) {
                this.removeLine(y,map);
                //TODO plus exp and repaint
                exp+=100;
            }
        }
        return exp;
   }
    
    private boolean isCanRemoveLine(int y, boolean[][] map) {
        for (int x = 0; x < 14; x++ ) {
            if(!map[x][y]) {
                //if there's a cube is flase, jump to y
                return false;
            }
        }
        return true;
    }
    
    private void removeLine(int row, boolean[][] map) {
        for (int x = 0; x < 14; x++ ) {
            for (int y = row; y >0; y-- ) {
                map[x][y] = map[x][y-1];
            }
            map[x][0]=false;
        }
    }

    private boolean checkLose() {
        Point[] actPoints = this.dto.getGameact().getActPoint();
        boolean[][] map = this.dto.getGameMap();
        for (int i = 0; i < actPoints.length; i++ ) {
            if(map[actPoints[i].x][actPoints[i].y]) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void gameStart() {
        this.dto.setStart(true);
    }

    @Override
    public void mainAction() {
        // TODO Auto-generated method stub
        this.keydown();
    }
}
