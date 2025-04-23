public class WordPair{
    private String wordOne;
    private String wordTwo;

    public WordPair(String first, String second){
        wordOne = first;
        wordTwo = second;
    }

    public String getFirst(){
        return wordOne;
    }

    public String getSecond(){
        return wordTwo;
    }

    public String toString(){
        return "(" + wordOne + ", " + wordTwo + ")";
    }
}