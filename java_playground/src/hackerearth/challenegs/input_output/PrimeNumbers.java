package hackerearth.challenegs.input_output;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbers {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine());
        int number = 2;
        while(number < count){
            if(isPrimeNumber(number)) {
                System.out.print(number+" ");
            }
            number++;
        }
    }

    private static boolean isPrimeNumber(final int number) {
        int i = 0;
        int j = number/2;
        for(i=2; i<=j; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
