/*
 * 文件名：PControl.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import dto.GameDto;

public class PControl extends KeyAdapter{
    
    private GameControl gameControl;
    private GameDto dto;
    public PControl(GameControl gameControl, GameDto dto) {
        this.gameControl = gameControl;
        this.dto = dto;
    }
    
    /**
     * keyboard pressed event
     */
    @Override
    public void keyPressed(KeyEvent e) {
        //TODO 枚举写法不好
        switch (e.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                if(!this.dto.isProcessLock()) {
                    this.gameControl.gameStart(); 
                }
                break;
            case KeyEvent.VK_UP:
                this.gameControl.keyup();
                break;
                
            case KeyEvent.VK_DOWN:
                if(this.dto.isProcessLock()) {
                    this.gameControl.keydown();
                }
                break;
                    
            case KeyEvent.VK_LEFT:
                this.gameControl.keyleft();
                break;
                
            case KeyEvent.VK_RIGHT:
                this.gameControl.keyright();
                break;
            default:
                break;
        }
    }

}
