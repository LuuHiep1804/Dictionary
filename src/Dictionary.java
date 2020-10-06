import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {

    private int sizeOfWords = 0;
    Word[] words = new Word[1000];
    HashMap<String, String> hashMap = new HashMap<>();
    Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

    /**
     * thêm từ mới vào mảng
     **/
    public void addWord(String word_target, String word_explain) {
        Word newWords = new Word(word_target, word_explain);
        words[sizeOfWords] = newWords;
        sizeOfWords++;
        hashMap.put(word_target, word_explain);
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
