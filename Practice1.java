import java.text.DecimalFormat;
import java.util.Scanner;
public class Practice1 {
    final static String[] TYPES = {"Diamond", "Club", "Heart", "Spade"};

    final static String[] CARDS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            int card = generateValue(0,51);
            int type = card / 13;
            int val = card % 13;
            System.out.println(card + "of" + TYPES[type]);
        }

    }

    static int generateValue(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    static String generateCode(int min, int max, int number) {
        String result = "";
        for (int index = 0; index < number; index++) {
            char val = (char)(Math.random() * (max - min + 1) + min);

            result += val;

        }
            return result;
    }
}
