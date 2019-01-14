/*
 * 文件名：GameService.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package control;

import java.awt.Point;

import dto.GameDto;
import entity.GameAct;

public class GameService {
    private GameDto dto;
    public GameService(GameDto dto) {
        this.dto = dto;
        GameAct act = new GameAct();
        dto.setGameact(act);
    }
    public void keyup() {
        // TODO Auto-generated method stub
        if(this.canMove(0,-1)) {
            this.dto.getGameact().move(0,-1);
        }
    }
    public void keydown() {
        // TODO Auto-generated method stub
        if (this.canMove(0,1)) {
            this.dto.getGameact().move(0,1);
        }
    }
    public void keyleft() {
        // TODO Auto-generated method stub
        if(this.canMove(-1,0)) {
            this.dto.getGameact().move(-1,0);
        }
    }
    public void keyright() {
        // TODO Auto-generated method stub
        if(this.canMove(1,0)) {
            this.dto.getGameact().move(1,0);
        }
    }
    /**
     * 
     * Description: 
     *  Check boundary
     * @param moveX
     * @param moveY
     * @return 
     * @see
     */
    private boolean canMove(int moveX, int moveY) {
        Point[] nowPoints = this.dto.getGameact().getActPoint();
        for (int i = 0; i < nowPoints.length; i++ ) {
            int newX = nowPoints[i].x + moveX;
            int newY = nowPoints[i].y + moveY;
            //TODO 硬编码
            if(newX < 0 || newX > 13 || newY < 0 ||newY>28) {
                return false;
            }
        }
        return true;
    }
}
