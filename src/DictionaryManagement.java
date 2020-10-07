import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement {

    Dictionary dictionary = new Dictionary();
    int numberOfWords;

    /**
     * thêm từ mới vào mảng words bằng câu lệnh, nhập liệu từ bàn phím
     **/
    public void insertFromCommandLine() {
        //TODO:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of word: ");
        numberOfWords = sc.nextInt();

        System.out.println("Enter Word: ");
        sc.nextLine();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.printf("Word %d: \n", i + 1);
            System.out.print("word target: ");
            String wordTarget = sc.nextLine();
            System.out.print("word explain: ");
            String wordExplain = sc.nextLine();
            dictionary.addWord(wordTarget, wordExplain);
        }
    }

    /**
     * thêm từ mới vào mảng words từ file
     **/
    public void insertFromFile() {
        //TODO:

        File f = new File("dictionaries.txt");
        Scanner sc = null;

        try {
            //quét toàn bộ file
            sc = new Scanner(f);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (true) {
            assert sc != null;
            if (!sc.hasNext()) break;
            String word_target = sc.next();
            String word_explain = sc.nextLine();
            dictionary.addWord(word_target, word_explain);
        }

    }

    /**
     * tìm kiếm từ
     **/
    public void dictionaryLookup() {
        //TODO:
        System.out.print("Enter the word you want to explain: ");
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        boolean check = false;
        int word_id;
        word_id = searchApp(words);
        if (word_id != -1){
            check = true;
        }
        if (check) {
            System.out.printf("|%-20s |%-20s \n", "English", "Vietnamese");
            System.out.printf("|%-20s |%-20s \n", dictionary.words[word_id].getWord_target(),
                    dictionary.words[word_id].getWord_explain());
        } else {
            System.out.println("Words have not been updated!");
        }
    }

    /**
     * cập nhật thêm từ
     **/
    public void updateWords(String wordTarget, String wordExplain) {
        dictionary.addWord(wordTarget, wordExplain);
    }

    /**
     * xóa từ
     **/
    public void delWords() {
        Scanner sc = new Scanner(System.in);
        String ch;
        int id = 0;
        System.out.print("Enter the word you want to delete: ");
        ch = sc.nextLine();

        id = searchApp(ch);

        if (dictionary.getSizeOfWords() - 1 - id >= 0) {
            System.arraycopy(dictionary.words, id + 1, dictionary.words, id, dictionary.getSizeOfWords() - 1 - id);
        }

        dictionary.words[dictionary.getSizeOfWords() - 1] = null;
        dictionary.setSizeOfWords(dictionary.getSizeOfWords() - 1);
    }

    /**
     * sửa từ
     **/
    public void fixWords() {
        Scanner sc = new Scanner(System.in);
        String ch;
        String answer;
        System.out.print("Enter the word you want to fix: ");
        ch = sc.nextLine();
        System.out.println("Enter 'FWT' to fix words target");
        System.out.println("Enter 'FWE' to fix words explain");
        System.out.println("Enter 'FA' to fix all");
        answer = sc.nextLine();
        switch (answer) {
            case "FWT":
                String fixWordsTarget;
                System.out.print("enter word to replace the word to be fixed: ");
                fixWordsTarget = sc.nextLine();

                int id = searchApp(ch);
                dictionary.words[id].setWord_target(fixWordsTarget);

                break;
            case "FWE":
                String fixWordsExplain;
                System.out.print("enter word to replace the word to be fixed: ");
                fixWordsExplain = sc.nextLine();

                int id_ = searchApp(ch);
                dictionary.words[id_].setWord_explain(" " + fixWordsExplain);

                break;
            case "FA":
                String fixWords_Target;
                String fixWords_Explain;
                System.out.print("Enter the word target: ");
                fixWords_Target = sc.nextLine();
                System.out.print("Enter the word explain: ");
                fixWords_Explain = sc.nextLine();

                int _id = searchApp(ch);
                dictionary.words[_id].setWord(fixWords_Target, fixWords_Explain);

                break;
            default:
        }
    }

    public void dictionarySearcher() {
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.print("Search for words: ");
        ch = sc.nextLine();
        boolean check = false;
        int id = 0;

        id = searchApp(ch);

        if (id != -1){
            check = true;
        }

        if (check) {
            System.out.printf("|%-20s |%-20s \n", "English", "Vietnamese");
            System.out.printf("|%-20s |%-20s \n", dictionary.words[id].getWord_target(),
                    dictionary.words[id].getWord_explain());
        } else {
            System.out.println("Your words: ");
            for (int i = 0; i < dictionary.getSizeOfWords(); i++) {
                if (dictionary.words[i].getWord_target().charAt(0) == ch.charAt(0)){
                    if (dictionary.words[i].getWord_target().contains(ch)) {
                        System.out.println("\t\t" + dictionary.words[i].getWord_target());
                    }
                }
            }
            dictionaryLookup();
        }
    }

    public void dictionaryExportToFile() {
        try {
            FileWriter fw = new FileWriter("inputDictionaries.txt");
            for (int i = 0; i < dictionary.getSizeOfWords(); i++) {
                fw.write(dictionary.words[i].getWord_target() + " " + dictionary.words[i].getWord_explain() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int searchApp(String ch) {
        int l = 0;
        int r = dictionary.listWord.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = ch.compareTo(dictionary.listWord.get(m).getWord_target());

            if (res == 0) {
                return m;
            }else if (res > 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }
        return -1;
    }

}
