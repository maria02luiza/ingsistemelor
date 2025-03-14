package lab3;
import java.util.Random;

public class PasswordMMaker {
    public static final int MAGIC_NUMBER=7;
    private final String  magicString;

    public PasswordMMaker(String name) {
        this.magicString=generateMagicString();

    }
    private String generateMagicString() {
        Random rand=new Random();
        StringBuilder sb=new StringBuilder();
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for(int i=0;i<20;i++ ){
            int index=rand.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    private String generateRandomString(int length) {
        Random rand=new Random();
        StringBuilder sb=new StringBuilder();
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        return sb.toString();
    }


    }
    public String getPassword() {
        return magicString+MAGIC_NUMBER;
        String randomString= generateRandomString(MAGIC_NUMBER);

    }


}
