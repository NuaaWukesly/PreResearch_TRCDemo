/**
 * 
 */
package wukeslyOS.trcdemo.model;

import java.io.Serializable;

/**
 * ������е�һ����
 * @author wuxiangli
 */
public class VTrcWord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2905587663150197005L;
	/**
	 * �ôʶ�Ӧ���ı�
	 */
	private String mWord;
	/**
	 * �ôʳ�����ʱ��
	 */
	private int mDuration;
	
	public VTrcWord(String mWord, int mDuration) {
		super();
		this.mWord = mWord;
		this.mDuration = mDuration;
	}

	public String getmWord() {
		return mWord;
	}

	public void setmWord(String mWord) {
		this.mWord = mWord;
	}

	public int getmDuration() {
		return mDuration;
	}

	public void setmDuration(int mDuration) {
		this.mDuration = mDuration;
	}
	
	

}
