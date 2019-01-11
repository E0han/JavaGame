/*
 * 文件名：ConfigFactory.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package config;

public class ConfigFactory {
    private static GameConfig GAME_CONFIG = null;
    static {
        try {
            GAME_CONFIG = new GameConfig();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static GameConfig getGameConfig() {
        return GAME_CONFIG;
    }
}
