package tij04;

import java.util.Random;

/**
 * Created by User on 13.05.2017.
 */
public class tij0408 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <= 4; i++) {
            int c = r.nextInt(4);
            switch (c) {
                case (0):
                    System.out.println(c);   
                case (1):
                    System.out.println(c);
                case (2):
                    System.out.println(c);
                case (3):
                    System.out.println(c);
                case (4):
                    System.out.println(c);
            }
        }
    }
}