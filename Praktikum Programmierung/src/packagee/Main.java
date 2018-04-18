package packagee;

import java.math.*;

public class Main {
    public static void main(String[] args) {
        boolean[] boo = {true,false,true};

        int dec = binaryToInt(boo);

        System.out.println("Decimal: " + dec);
    }

    private static int binaryToInt(boolean[] boo){
        int sum = 0;
        for(int i = 0; i < boo.length; i++){
            if(boo[boo.length - i - 1]){
                sum+=(int)Math.pow(2, i);
            }
        }
        return sum;
    }
}