/*
 * �ļ�����GameService.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��14��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
//        if(this.canMove(0,-1)) {
//            this.dto.getGameact().move(0,-1);
//        }
        this.dto.getGameact().round();
    }
    public void keydown() {
        // TODO Auto-generated method stub
        if(!this.dto.getGameact().move(0,1)) {
            boolean[][] map = this.dto.getGameMap();
            Point[] act = this.dto.getGameact().getActPoint();
            for (int i = 0; i < act.length; i++ ) {
                map[act[i].x][act[i].y] = true;
            }
        }
        
    }
    public void keyleft() {
        // TODO Auto-generated method stub

            this.dto.getGameact().move(-1,0);
        
    }
    public void keyright() {
        // TODO Auto-generated method stub
       this.dto.getGameact().move(1,0);
        
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
}
