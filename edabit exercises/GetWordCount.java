public class GetWordCount {
    public static void main (String[] args) {
        String sentence1 = "Just an example here move along";
        System.out.println(countWords(sentence1));
    }

    public static int countWords(String s) {
        String [] words = s.split(" ");
        int count = words.length;
        return count;
    }
    
}
