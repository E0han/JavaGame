/*
 * �ļ�����GameService.java
 * ��Ȩ��Copyright by www.newlixon.com/
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2019��1��16��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
