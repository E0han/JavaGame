/*
 * �ļ�����Main.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��10��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
