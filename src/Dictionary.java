public class Dictionary {

    private int sizeOfWords = 0;
    Word[] words = new Word[200];

    /**
     * thêm từ mới vào mảng
     **/
    public void addWord(String word_target, String word_explain) {
        Word newWords = new Word(word_target, word_explain);
        words[sizeOfWords] = newWords;
        sizeOfWords++;
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
