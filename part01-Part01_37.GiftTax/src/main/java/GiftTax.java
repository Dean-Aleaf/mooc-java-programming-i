
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftTotal = Integer.valueOf(scan.nextLine());

        if (giftTotal >= 5000 && giftTotal < 25000){
            double tax = (100 + (giftTotal - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (giftTotal >= 25000 && giftTotal < 55000){
            double tax = (1700 + (giftTotal - 25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (giftTotal >= 55000 && giftTotal < 200000){
            double tax = (4700 + (giftTotal - 55000) * 0.12);
            System.out.println("Tax:" + tax);
        } else if (giftTotal >= 200000 && giftTotal < 1000000){
            double tax = (22100 + (giftTotal - 200000) *0.15);
            System.out.println("Tax:" + tax);
        }else if (giftTotal >= 1000000){
            double tax = (142100 + (giftTotal - 1000000) * 0.17);
            System.out.println("Tax:" + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
