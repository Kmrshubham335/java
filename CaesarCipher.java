public class CaesarCipher {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            
            if (Character.isLetter(ch)) {
                char shifted = (char) (ch + shift);
                
                if ((Character.isLowerCase(ch) && shifted > 'z') || (Character.isUpperCase(ch) && shifted > 'Z')) {
                    shifted = (char) (ch - (26 - shift));
                }
                
                encryptedText.append(shifted);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }
    public static void main(String[] args) {
        String plaintext = "Shubham";
        int shift = 3;

        String encryptedText = encrypt(plaintext, shift);
        System.out.println("Encrypted: " + encryptedText);
    }
}
