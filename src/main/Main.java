/*
 * 文件名：Main.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月10日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package main;
import control.GameControl;
import control.GameService;
import control.PControl;
import dto.GameDto;
import ui.FrameGame;
import ui.PanelGame;

public class Main {
    public static void main(String args[]) {
        //Game data source
        GameDto dto = new GameDto();
        //create game panel
        PanelGame panel = new PanelGame(dto);
        //create game logic blocks and install data source
        GameService service = new GameService(dto);
        //create game control (connect the panel and logic blocks)
        GameControl game = new GameControl(panel,service);
        //create player's control (connect the game control)
        PControl control = new PControl(game);
        panel.setGameControl(control);
        //create the game window, install the game's panel
        FrameGame frame = new FrameGame(panel);
    }
}
