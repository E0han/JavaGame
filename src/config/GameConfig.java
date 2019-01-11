/*
 * 文件名：GameConfig.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class GameConfig {
    private int width;
    private int height;
    private int windowSize;
    private int padding;
    private List<LayerConfig> layersConfig;
    public GameConfig() throws Exception{
        SAXReader reader = new SAXReader();
        Document doc = reader.read("config/cfg.xml");
        Element game = doc.getRootElement();
        Element frame = game.element("frame");//return an element
        this.setUiConfig(game.element("frame"));
        this.setSystemConfig(game.element("system"));
        this.setDataConfig(game.element("frame"));
    }
/**
 * 
 * Description: <br>
 * 1、…<br>
 * 2、…<br>
 * Implement: <br>
 * 1、…<br>
 * 2、…<br>
 * 
 * @param frame window configs elements
 * @see
 */
    
    private void setUiConfig(Element frame) {
        this.width = Integer.parseInt(frame.attributeValue("width"));
        this.height = Integer.parseInt(frame.attributeValue("height"));
        this.windowSize = Integer.parseInt(frame.attributeValue("windowSize"));
        this.padding = Integer.parseInt(frame.attributeValue("padding"));
        List<Element> layers = frame.elements("layer");
        layersConfig = new ArrayList<LayerConfig>();
        for(Element layer : layers) {
            LayerConfig lc = new LayerConfig(
                layer.attributeValue("className"),
                Integer.parseInt(layer.attributeValue("x")),
                Integer.parseInt(layer.attributeValue("y")),
                Integer.parseInt(layer.attributeValue("w")),
                Integer.parseInt(layer.attributeValue("h"))
            );
            layersConfig.add(lc);
            }
    }
    
    private void setSystemConfig(Element frame) {
        //TODO 配置系统参数
    }
    
    private void setDataConfig(Element data) {
        //TODO 配置系统
        
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getWindowSize() {
        return windowSize;
    }
    public int getPadding() {
        return padding;
    }
    public List<LayerConfig> getLayersConfig() {
        return layersConfig;
    }
}
