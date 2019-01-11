/*
 * �ļ�����ConfigFactory.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
