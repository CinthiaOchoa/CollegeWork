
//import java.util.Arrays;
//public class FunctionClass {
//    public static void main(String[] args) {
//        char[] result = generateRandomCharacters(10,128);
//        System.out.println(Arrays.toString(result));
//        char[] result1 = generateRandomCharacters(5,65535);
//        System.out.println(Arrays.toString(result1));
//
//    }
//
//    public static char[] generateRandomCharacters(int size, int range) {
//        char[] result = new char[size];
//        for(int index = 0; index < size; index++) {
//            result[index] = generateRandomCharacters(range);
//        }
//        return result;
//    }
//
//    public static char generateRandomCharacter(int range) {
//        return (char)(Math.random() * (range - 1 + 1));
//    }
//}
