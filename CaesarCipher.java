public class CaesarCipher {

    public static final int ALPHABET_SIZE = 26;

    public static String cipher(String plainText, int shiftValue) {
        StringBuilder cipherText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = shift(c, shiftValue);
                cipherText.append(shifted);
            } else {
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }

    public static String decipher(String encryptedText, int shiftValue) {
        StringBuilder plainText = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = shift(c, -shiftValue);
                plainText.append(shifted);
            } else {
                plainText.append(c);
            }
        }
        return plainText.toString();
    }

    private static char shift(char c, int shiftValue) {
        int base = Character.isUpperCase(c) ? 'A' : 'a';
        int shifted = (c - base + shiftValue + ALPHABET_SIZE) % ALPHABET_SIZE + base;
        return (char) shifted;
    }

}

