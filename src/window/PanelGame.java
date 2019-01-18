/*
 * 文件名：PanelGame.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月10日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package window;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;
import control.GameControl;
import control.PControl;
import dto.GameDto;
import ui.Layer;
import ui.LayerGameOver;

public class PanelGame extends JPanel {
    
    private ArrayList<Layer> lays = null;
    private GameDto dto;
    
    public PanelGame(GameControl gameControl, GameDto dto) {
        this.initLayer(dto);
        this.initComponent();
        this.setGameControl(new PControl(gameControl, dto));
    }
    
    public void setGameControl(PControl control){
        this.addKeyListener(control); 
    }
    
    private void initComponent() {
        
    }
    
    private void initLayer(GameDto dto){
        try {
            this.dto=dto;
            GameConfig cfg = ConfigFactory.getGameConfig();
            List<LayerConfig> layerCfg=cfg.getLayersConfig();
            lays= new ArrayList<Layer>(layerCfg.size());
            for(LayerConfig c : layerCfg) {
            //反射：获得类对象
                Class<?> cls = Class.forName(c.getClassName());
            //获得构造函数 constructor
                Constructor<?> ctr = cls.getConstructor( int.class, int.class, int.class, int.class);
            //用constructor创建对象
                Layer l = (Layer)ctr.newInstance(c.getX(), c.getY(),c.getW(),c.getH());
                l.setDto(dto);
            //将创建的layer对象放入集合
                lays.add(l);
            
            }
        }catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }  
        }
     

    @Override
    public void paintComponent(Graphics g) {
        //Use the base class method
        super.paintComponent(g);
        // refresh the graphics as a fucking crazy loop
        for(int i =0;i<lays.size();lays.get(i++).paint(g));
        if (this.dto.isGameLoss()) {
            Layer gO=new LayerGameOver(55,407,392,374);
            gO.paint(g);
            repaint();
        }
        //;
        //return focus
        this.requestFocus();
    }
}
