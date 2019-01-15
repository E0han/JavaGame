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
import java.util.Random;

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
        this.dto.getGameact().round(this.dto.getGameMap());
    }
    public void keydown() {
        // TODO Auto-generated method stub
        if(this.dto.getGameact().move(0,1,this.dto.getGameMap())) {
            return;
        }
        boolean[][] map = this.dto.getGameMap();
        Point[] act = this.dto.getGameact().getActPoint();
        for (int i = 0; i < act.length; i++ ) {
            map[act[i].x][act[i].y] = true;
        }
        //TODO 消行操作
        map = this.dto.getGameMap();
        boolean allLineSameFlag=false;
        for (int y = 0; y < map.length; y++ ) {
            for (int x = 0; x < map[y].length; x++ ) {
                if(map[y][x]){
                    allLineSameFlag=true;
                }else {
                    allLineSameFlag=false;
                }
            }
        }
        System.out.println(allLineSameFlag);
        this.dto.getGameact().init(new Random().nextInt(6));    
    }
      //TODO 判断消行
        //  消行操作
        //  算分操作
        //  判断记录
        //刷新新的随机方块
        
    public void keyleft() {
        // TODO Auto-generated method stub

            this.dto.getGameact().move(-1,0,this.dto.getGameMap());
        
    }
    public void keyright() {
        // TODO Auto-generated method stub
       this.dto.getGameact().move(1,0,this.dto.getGameMap());
        
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
