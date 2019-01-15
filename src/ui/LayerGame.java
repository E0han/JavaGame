/*
 * 文件名：LayGame.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Graphics;
import java.awt.Point;
public class LayerGame extends Layer {
    private static int ACT_SIZE = 32;
    
    
    public LayerGame(int x, int y, int w, int h) {
        super(x, y, w, h);
        // TODO Auto-generated constructor stub
    }
    public void paint(Graphics g) {
        this.createWindow(g);
        //g.drawImage(ACT, 32, 32, null, null);
        Point[] points = this.dto.getGameact().getActPoint();
        //print the blocks
        for(int i=0; i<points.length;i++) {
            g.drawImage(Img.ACT,
                this.x + points[i].x*ACT_SIZE,
                this.x + points[i].y*ACT_SIZE,
                this.x + points[i].x*ACT_SIZE+ACT_SIZE,
                this.x + points[i].y*ACT_SIZE+ACT_SIZE,
            0,0,32,32,null);
        }
        //print the map
        boolean[][] map = this.dto.getGameMap();
        for (int x = 0; x < map.length; x++ ) {
            for (int y = 0; y < map[x].length; y++ ) {
                if (map[x][y]) {
                    g.drawImage(Img.ACT,
                        this.x + x*ACT_SIZE,
                        this.x + y*ACT_SIZE,
                        this.x + x*ACT_SIZE+ACT_SIZE,
                        this.x + y*ACT_SIZE+ACT_SIZE,
                    0,0,32,32,null);
                }
            }
        }
        
    }
}
