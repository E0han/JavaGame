/*
 * 文件名：GameService.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Administrator
 * 修改时间：2019年1月16日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package service;

public interface GameService {
    public boolean keyup();
    public boolean keydown();
    public boolean keyleft();
    public boolean keyright();
    public void gameStart();
    public void mainAction();
}
