/*
 * 文件名：ConfigFactory.java
 * 版权：Copyright by www.ethyang.com/
 * 描述：
 * 修改人：0han
 * 修改时间：2019年1月11日
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
