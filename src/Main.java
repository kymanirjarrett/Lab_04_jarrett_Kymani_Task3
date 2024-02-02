public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000;
        final double INTEREST_RATE = 0.17;
        double interestDue = 0;

        interestDue = cardBalance * INTEREST_RATE;
        cardBalance = cardBalance + interestDue;
        System.out.println("The Interest Due after one month is " + interestDue);
        System.out.println("The Card Balance after one month is " + cardBalance);

        interestDue = cardBalance * INTEREST_RATE;
        cardBalance = cardBalance + interestDue;
        System.out.println("The Interest Due after two months is " + interestDue);
        System.out.println("The Card Balance after two months is " + cardBalance);
    }
}