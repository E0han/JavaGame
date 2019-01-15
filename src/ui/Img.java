/*
 * 文件名：Img.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月15日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package ui;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Img {
    private Img() {}
    /**
     * All images used in the project
     */
    public static Image IMG_SCORE=new ImageIcon("graphics/window/scoreZone.png").getImage();
    public static Image LOGO = new ImageIcon("graphics/window/logoZone.png").getImage();
    public static Image ACT = new ImageIcon("graphics/game/rect.png").getImage();
    public static Image IMG_RANKZONE=new ImageIcon("graphics/window/rankZone.png").getImage();
    public static Image IMG_LOGO=new ImageIcon("graphics/string/Title.png").getImage();
    public static Image RECT=new ImageIcon("graphics/game/rect.png").getImage();
    
}
