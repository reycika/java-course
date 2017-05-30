/**
 * Created by Reycika on 30.5.2017.at 18:57
 */
public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int myFirstNumber = (3 + 5) * (4 + 2);
        int mySecondNumber = 12;
        int myThirdNumber = 6 * myFirstNumber;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int difference = 1000 - myTotal;

        System.out.println(myFirstNumber);
        System.out.println("mySecondNumber");
        System.out.println(myTotal);
        System.out.println(difference);
    }
}
