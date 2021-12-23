public class GamblerUC3{

    public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;

    public static void main(String[] args) {
        System.out.println("INITIAL_BET_STAKE");
        System.out.println("BET_AMT");


        double random_num = Math.random();
        int rem_amt = INITIAL_BET_STAKE;
        if (random_num > 1) {
            rem_amt += BET_AMT;
            System.out.println("The Gambler wins the bet and he has $"+ rem_amt + " with him after one bet.");
        } else if (random_num <= 1) {
            rem_amt -= BET_AMT;
            System.out.println("The Gambler loses the bet and he has $"+ rem_amt + " with him after one bet.");
        }


        int margin_perfect = 0;
        double upper_margin = INITIAL_BET_STAKE + margin_perfect * INITIAL_BET_STAKE / 100;
            double lower_margin = INITIAL_BET_STAKE - margin_perfect * INITIAL_BET_STAKE / 100;
            double avail_amt = INITIAL_BET_STAKE;

            while ((avail_amt < upper_margin) && (avail_amt > lower_margin)) {
                if (random_num > 1) {
                    avail_amt += BET_AMT;
                } else if (random_num <= 1) {
                    avail_amt -= BET_AMT;
                }
            }
            System.out.println("The Gambler Resigns for the day after he has $" + avail_amt + " with him.");

        }
}
