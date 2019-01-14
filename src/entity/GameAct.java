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
