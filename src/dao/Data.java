/*
 * �ļ�����Data.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��15��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package dao;

import java.util.List;

import dto.Player;

public interface Data {
    /**
     *  get data
     */
    public List<Player> loadData();
    /**
     * Save data
     */
    
    public void saveData(List<Player> players);
}
