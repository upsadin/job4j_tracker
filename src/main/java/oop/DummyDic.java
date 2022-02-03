package oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic sayEng = new DummyDic();
        System.out.println(sayEng.engToRus("hello"));
    }
}
