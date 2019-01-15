/*
 * 文件名：GameAct.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package entity;

import java.awt.Point;

public class GameAct {
    /**
     * 方块数组
     */
    private Point[] actPoint;
    private static int MIN_X = 0;
    private static int MAX_X = 13;
    private static int MIN_Y = 0;
    private static int MAX_Y = 28;
    
    
    
    public GameAct() {
        //TODO 写入配置文件
        actPoint = new Point[] {
            new Point(6,2),
            new Point(5,2),
            new Point(7,2),
            new Point(7,3),
        };
    }

    public Point[] getActPoint() {
        return actPoint;
    }
    
    public boolean move(int moveX, int moveY) {
        //Move 
        for(int i =0 ; i<actPoint.length; i++) {
            int newX= actPoint[i].x+moveX;
            int newY = actPoint[i].y+moveY;
            if (isOverBoundary(newX,newY)) {
                return false;
            }
        }
        for(int i =0 ; i<actPoint.length; i++) {
            actPoint[i].x+=moveX;
            actPoint[i].y+=moveY;
    }
        return true;
    }
    
    /**
     * 
     * Description: <br>
     * 1、Rotate
     * 2.Clockwise:
     *  A.x = 0.y + 0.x - B.y
     *  A.y = 0.y - 0.x + B.y
     * Implement:
     *  
     * @see
     */
    public void round() {
        for (int i = 0; i < actPoint.length; i++ ) {
            int newX = actPoint[0].y+ actPoint[0].x - actPoint[i].y;
            int newY = actPoint[0].y- actPoint[0].x + actPoint[i].x;
            //TODO check rotatable
            if(this.isOverBoundary(newX,newY)) {
                return;
            }
        }
        for (int i = 0; i < actPoint.length; i++ ) {
            int newX = actPoint[0].y+ actPoint[0].x - actPoint[i].y;
            int newY = actPoint[0].y- actPoint[0].x + actPoint[i].x;
            actPoint[i].x = newX;
            actPoint[i].y = newY;
        }
    }
    
    private boolean isOverBoundary(int x, int y) {
        return x < MIN_X || x>MAX_X || y <MIN_Y || y>MAX_Y;
    }
}
