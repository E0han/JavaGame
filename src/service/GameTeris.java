/*
 * �ļ�����GameTeris.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��16��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package service;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import dto.GameDto;
import entity.GameAct;
import ui.Layer;

public class GameTeris implements GameService {
    private GameDto dto;
    private Layer scorePoint;
    private int exp = 0;
    public GameTeris(GameDto dto){
        this.dto = dto;
        GameAct act = new GameAct();
        dto.setGameact(act);
        this.scorePoint=dto.getScorePoint();
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
            //check ���У��������
            int plusExp=this.plusPoint();
            //�������
            if(plusExp>0) {
                //���Ӿ���
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
        this.dto.setStart(false);
        this.dto.setProcessLock(false);
        this.dto.setGameLoss(true);
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

    private int plusPoint() {
        //TODO return exp
        boolean[][] map=this.dto.getGameMap();
        exp=0;
        for (int y = 0; y < 29; y++ ) {
            if(isCanRemoveLine(y,map)) {
                this.removeLine(y,map);
                //TODO plus exp and repaint
                this.exp+=17;
                pointsUp();
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
        this.dto.dtoInit();
    }

    @Override
    public void mainAction() {
        this.keydown();
    }

    public void pointsUp() {
        int nowScore = this.dto.getNowPoint();
        this.dto.setNowPoint(nowScore+=this.exp);
    }
}
