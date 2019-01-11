/*
 * �ļ�����PanelGame.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��10��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
        //���䣺��������
            Class<?> cls = Class.forName(c.getClassName());
        //��ù��캯�� constructor
            Constructor<?> ctr = cls.getConstructor( int.class, int.class, int.class, int.class);
        //��constructor��������
            Layer l = (Layer)ctr.newInstance(c.getX(), c.getY(),c.getW(),c.getH());
        //��������layer������뼯��
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
