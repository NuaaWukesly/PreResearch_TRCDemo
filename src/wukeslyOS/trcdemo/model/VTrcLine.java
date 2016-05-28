package wukeslyOS.trcdemo.model;

import java.io.Serializable;
import java.util.List;

/**
 * trc ����У�һ�и��
 * @author wuxiangli
 *
 */
public class VTrcLine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4745557357487660572L;
	/**
	 * ��ʶ�Ӧ��ʱ���
	 */
	private int mTimePoint;
	/**
	 * һ�и�ʣ���һ��һ���Ĵ�{@link VTrcWord}���
	 */
	private List<VTrcWord> mWords;
	
	private String trcStr = null;
	
	public VTrcLine(int mTimePoint, List<VTrcWord> mWords) {
		super();
		this.mTimePoint = mTimePoint;
		this.mWords = mWords;
		initTrcStr();
	}

	/**
	 * ��ȡ����У���һ��һ����{@link VTrcWord}���
	 * @return
	 */
	public List<VTrcWord> getmWords() {
		return mWords;
	}
	
	public void setmWords(List<VTrcWord> mWords) {
		this.mWords = mWords;
		initTrcStr();
	}
	
	/**
	 * ��ȡ���и�ʶ�Ӧ�ĸ���ʱ�䣨ms��
	 * @return
	 */
	public int getmTimePoint() {
		return mTimePoint;
	}
	
	public void setmTimePoint(int mTimePoint) {
		this.mTimePoint = mTimePoint;
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return trcStr;
	}
	
	private void initTrcStr(){
		StringBuilder builder = new StringBuilder();
		if(mWords != null){
			int len = mWords.size();
			for(int i = 0; i < len; i++){
				VTrcWord word = mWords.get(i);
				if(word != null){
					builder.append(word.getmWord());
				}
			}
			trcStr = builder.toString();
		}else{
			trcStr = null;
		}
	}
}
