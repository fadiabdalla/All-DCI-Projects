package dictionary_using_treeset_exercise;

public class Words implements Comparable{
	
	String word;

	public Words(String word) {
		
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}

	public int compareTo(Words newWord) {
		return word.compareTo(newWord.word);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
