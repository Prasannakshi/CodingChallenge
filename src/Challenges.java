/**
 * Created by Prasannakshi on 8/2/2018.
 */
public class Challenges {
    public static void main(String args[]){
        String input = "Hello how are y0u";
        printStringPretty(input, 6);
    }

    private static void printStringPrettyPerfect(String input, int k) {
        String[] inputString = input.split(" ");
        int n = inputString.length;
        StringBuilder sb = new StringBuilder("");
        int noOfWords = 0;
        for(int i=0; i<n; i++){
            String word = inputString[i];
            String newString = sb.toString().trim();
            if(newString.length() >= k) {
                if(noOfWords == 1 && newString.length() > k){
                    System.out.println(newString.substring(0, k - 1) + "-");
                    System.out.println(newString.substring(k-1));
                } else {
                    System.out.println(newString + " ");
                }
                sb = new StringBuilder();
                noOfWords = 0;
            }
            sb.append(" ").append(word);
            noOfWords++;
        }

        String remainingString = sb.toString().trim();
        if(remainingString.length()>k) {
            System.out.println(remainingString.substring(0, k - 1) + "-" );
            System.out.println(remainingString.substring(k-1));
        } else {System.out.println(remainingString);}
    }

    private static void printStringPretty(String input, int k) {
        int head = 0, spaceIndex = -1;
        int n = input.length();
        for(int i=0; i<n; i++) {
            char c = input.charAt(i);
            if (c == ' ') {spaceIndex = i;}
            if (i - head + 1 == k) {
                int breakSentence = input.charAt(i+1) == ' ' ? i + 2: spaceIndex + 1;
                System.out.println(input.substring(head, breakSentence));
                head = breakSentence;
            }
        }
        if(head!=n) {System.out.println(input.substring(head));}
    }

}
