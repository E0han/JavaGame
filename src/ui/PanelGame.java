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

package ui;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;

public class PanelGame extends JPanel {
    
    private ArrayList<Layer> lays = null;
    public PanelGame() {
        try {
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
        //将创建的layer对象放入集合
            lays.add(l);
            
        }
        }
            catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
     
//        lays = new Layer[] {
//            new LayerGame(173,41,246,342),
//            new LayerDataBase(26,41,119,222),
//            new LayerButton(446, 41, 119,100),
//            new LayerDisk(26,284,119,100),
//            new LayerLevel(446,162,119,222)
//        };

    @Override
    public void paintComponent(Graphics g) {
        // refresh the graphics as a fucking crazy loop
        for(int i =0;i<lays.size();i++) {
           lays.get(i).paint(g);
       }
        //g.drawImage(img,0,0,null);    
    }
}
