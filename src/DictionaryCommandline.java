import java.util.Scanner;

public class DictionaryCommandline {

    DictionaryManagement dictionary_Management = new DictionaryManagement();

    public void showAllWords() {
        //TODO:
        System.out.printf("No \t |%-20s |%-20s \n", "English", "Vietnamese");
        for (int i = 0; i < dictionary_Management.dictionary.getSizeOfWords(); i++) {
            System.out.printf("%d \t |%-20s |%-20s \n", i + 1, dictionary_Management.dictionary.words[i].getWord_target(),
                    dictionary_Management.dictionary.words[i].getWord_explain());
        }
    }

    /**
     * cập nhật thêm từ
     **/
    public void updatesWord(String wordTarget, String wordExplain) {
        //TODO:
        dictionary_Management.updateWords(wordTarget, wordExplain);
    }

    /**
     * nhập từ bằng với đầu vào từ bàn phím
     **/
    public void insertFromCommandLine() {
        //TODO:
        dictionary_Management.insertFromCommandLine();
    }

    /**
     * nhập từ với đầu vào từ file
     **/
    public void insertFromFile() {
        //TODO:
        dictionary_Management.insertFromFile();
    }

    /**
     * tra cứu từ basic
     **/
    public void dictionaryLookUp() {
        //TODO:
        dictionary_Management.dictionaryLookup();
    }

    /**
     * tra cứu từ Advanced
     **/
    public void dictionarySearcher(){
        dictionary_Management.dictionarySearcher();
    }

    /**
     * xóa từ
     **/
    public void delWords(){
        dictionary_Management.delWords();
    }

    /**
     * sửa từ
     **/
    public void fixWords(){
        dictionary_Management.fixWords();
    }

    /**
     * in dữ liệu từ điển ra file
     **/
    public void dictionaryExportToFile(){
        dictionary_Management.dictionaryExportToFile();
    }

    public void dictionaryBasic() {
        //TODO:
        dictionary_Management.insertFromCommandLine();
        showAllWords();
    }

    public void dictionaryAdvanced() {
        //TODO:
        dictionary_Management.insertFromFile();
        showAllWords();
        dictionary_Management.dictionaryLookup();
    }

    public String Search(String ch){
        return dictionary_Management.Search(ch);
    }

}
