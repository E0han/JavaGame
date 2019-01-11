/*
 * 文件名：LayerConfig.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package config;

public class LayerConfig {
    private String className;
    private int x;
    private int y;
    private int w;
    private int h;
    
    public LayerConfig(String className, int x, int y, int w, int h) {
        this.className = className;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public String getClassName() {
        return className;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

}
