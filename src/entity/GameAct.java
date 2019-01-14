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
    private Point[] actPoint;
    
    public GameAct() {
        //TODO 写入配置文件
        actPoint = new Point[] {
            new Point(5,2),
            new Point(6,2),
            new Point(7,2),
            new Point(7,3),
        };
    }

    public Point[] getActPoint() {
        return actPoint;
    }
    
    public void move(int moveX, int moveY) {
        //Move 
        for(int i =0 ; i<actPoint.length; i++) {
            actPoint[i].x+=moveX;
            actPoint[i].y+=moveY;
        }
    }
}
