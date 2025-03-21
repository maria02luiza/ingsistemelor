import java.util.Random;
/*
public class PasswordMMaker {
    // Constanta MAGIC_NUMBER cu o valoare aleatorie între 5 și 10
    public static final int MAGIC_NUMBER = new Random().nextInt(6) + 5; // Generăm un număr între 5 și 10

    // String final magicString generat aleator cu lungime minimă 20 de caractere
    private final String magicString;

    // Constructor care primește un String numit 'name'
    public PasswordMMaker(String name) {
        // Generăm magicString în constructor
        this.magicString = generateMagicString();
    }

    // Metodă pentru a genera magicString aleator de 20 de caractere
    private String generateMagicString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Set de caractere posibile

        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(characters.length()); // Alegem un caracter aleatoriu
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    // Metoda getPassword care returnează parola
    public String getPassword(String name) {
        Random random = new Random();

        // 1. Generăm un șir aleator de lungime MAGIC_NUMBER
        String randomString = generateRandomString(MAGIC_NUMBER);

        // 2. Extragem 10 caractere aleatorii din magicString
        StringBuilder magicSubstring = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());
            magicSubstring.append(magicString.charAt(index));
        }

        // 3. Convertim lungimea lui 'name' într-un string
        String nameLength = String.valueOf(name.length());

        // 4. Generăm un număr aleator între 0 și 50
        int randomNumber = random.nextInt(51); // interval [0,50]

        // Construim parola finală
        return randomString + magicSubstring.toString() + nameLength + randomNumber;
    }

    // Metodă pentru a genera un șir aleator de lungime dată
    private String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Set de caractere posibile

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

*/


