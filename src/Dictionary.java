import java.util.*;

public class Dictionary {

    private int sizeOfWords = 0;
    Word[] words = new Word[600];
    List<Word> listWord = new ArrayList<Word>();

    /**
     * thêm từ mới vào mảng
     **/
    public void addWord(String word_target, String word_explain) {
        Word newWords = new Word(word_target, word_explain);
        words[sizeOfWords] = newWords;
        sizeOfWords++;
        listWord.add(newWords);
        Collections.sort(listWord, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getWord_target().compareTo(o2.getWord_target());
            }
        });
    }



    public void setSizeOfWords(int a){
        this.sizeOfWords = a;
    }

    /**
     * trả về kích cỡ của mảng words
     **/
    public int getSizeOfWords() {
        return sizeOfWords;
    }

}
