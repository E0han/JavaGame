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
import java.util.ArrayList;
import java.util.List;

public class GameAct {
    /**
     * 方块数组
     */
    private Point[] actPoint;
    private int typeCode;
    private static int MIN_X = 0;
    private static int MAX_X = 13;
    private static int MIN_Y = 0;
    private static int MAX_Y = 28;
    
    private static List<Point[]> TYPE_CONFIG;
    
    static {
        TYPE_CONFIG = new ArrayList<Point[]>(7);
        TYPE_CONFIG.add(new Point[]{new Point(6,0),new Point(5,0),new Point(7,0),new Point(8,0)});
        TYPE_CONFIG.add(new Point[]{new Point(7,0),new Point(6,0),new Point(7,1),new Point(8,0)});
        TYPE_CONFIG.add(new Point[]{new Point(6,2),new Point(5,2),new Point(7,2),new Point(6,3)});
        TYPE_CONFIG.add(new Point[]{new Point(6,2),new Point(5,3),new Point(7,2),new Point(6,3)});
        TYPE_CONFIG.add(new Point[]{new Point(6,2),new Point(5,2),new Point(6,3),new Point(5,3)});
        TYPE_CONFIG.add(new Point[]{new Point(6,2),new Point(5,2),new Point(7,2),new Point(7,3)});
        TYPE_CONFIG.add(new Point[]{new Point(6,2),new Point(5,1),new Point(7,3),new Point(6,3)});
    }
    public GameAct() {
        //TODO 写入配置文件
        this.init(0);
        //TODO config
    }
    
    public void init(int actCode) {
        this.typeCode=actCode;
        //TODO
        //数组映射
        Point[] points = TYPE_CONFIG.get(actCode);
        actPoint = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            actPoint[i] = new Point(points[i].x,points[i].y);
        }
        
    }
    
    public Point[] getActPoint() {
        return actPoint;
    }
    
    public boolean move(int moveX, int moveY, boolean[][] gameMap) {
        //Move 
        for(int i =0 ; i<actPoint.length; i++) {
            int newX= actPoint[i].x+moveX;
            int newY = actPoint[i].y+moveY;
            if (isOverBoundary(newX,newY,gameMap)) {
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
    public void round(boolean[][] gameMap) {
        if (this.typeCode==4) {
            return;
        }
        for (int i = 0; i < actPoint.length; i++ ) {
            int newX = actPoint[0].y+ actPoint[0].x - actPoint[i].y;
            int newY = actPoint[0].y- actPoint[0].x + actPoint[i].x;
            //TODO check rotatable
            if(this.isOverBoundary(newX,newY,gameMap)) {
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
    
    private boolean isOverBoundary(int x, int y, boolean[][] gameMap) {
        return x < MIN_X || x>MAX_X || y <MIN_Y || y>MAX_Y || gameMap[x][y];
    }
}
