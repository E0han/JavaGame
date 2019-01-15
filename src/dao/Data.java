/*
 * 文件名：Data.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月15日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
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
