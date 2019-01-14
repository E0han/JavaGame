/*
 * �ļ�����GameAct.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��14��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package entity;

import java.awt.Point;

public class GameAct {
    private Point[] actPoint;
    
    public GameAct() {
        //TODO д�������ļ�
        actPoint = new Point[] {
            new Point(3,0),
            new Point(4,0),
            new Point(5,0),
            new Point(5,1),
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
