package doubleRemover;

import java.util.Stack;

public class RemoverApp {

    public static void main(String[] args) {
        String text = "kaabeebkdc";   //kbbkdc // kkdc // dc

        String result = new DoubleRemover().removeDuplicates(text);
        System.out.println("String after remove duplicates " + result);
    }
}

