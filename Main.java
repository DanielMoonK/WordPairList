public class Main{
    public static void main(String[] args){
        String[] wordNums = {"one", "two", "three"};
        WordPairList ex1 = new WordPairList(wordNums);
        System.out.println(ex1);

        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList ex2 = new WordPairList(phrase);
        System.out.println(ex2);
        System.out.println(ex2.numMatches());

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList ex3 = new WordPairList(moreWords);
        System.out.println(ex3);
        System.out.println(ex3.numMatches());
    }
}