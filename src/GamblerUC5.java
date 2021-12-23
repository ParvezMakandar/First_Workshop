public class GamblerUC5 {

    public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;

    public static void main(String[] args) {
        System.out.println("INITIAL_BET_STAKE");
        System.out.println("BET_AMT");

        int rem_amt = INITIAL_BET_STAKE;
        rem_amt -= BET_AMT;
        System.out.println("The Gambler loses the bet and he has $"+ rem_amt + " with him after one bet.");
        double lower_margin;
        System.out.println("The Gambler Resigns for the day after he has $" + (double) INITIAL_BET_STAKE + " with him.");

        int No_Of_Bets = 100;
        int n = 20;
        lower_margin = -1*INITIAL_BET_STAKE;
        double Tot_Amt_Won_Lost = 0;
        for (int i=0;i<n;i++)
        {
            double Daily_Amt_Won_Lost = 0;
            int Bets_Played = 0;
            while ((Daily_Amt_Won_Lost < (double) INITIAL_BET_STAKE) && (Daily_Amt_Won_Lost > lower_margin) && (Bets_Played < No_Of_Bets))
            {
                Bets_Played++;
                Daily_Amt_Won_Lost -= BET_AMT;
            }
            Tot_Amt_Won_Lost += Daily_Amt_Won_Lost;
        }
        if (Tot_Amt_Won_Lost > 0)
        {
            System.out.println("The Total amount won in 20 days = "+ Tot_Amt_Won_Lost);
        }
        else if (Tot_Amt_Won_Lost == 0)
        {
            System.out.println("There is no net gain in last 20 days");
        }
        else if (Tot_Amt_Won_Lost < 0)
        {
            System.out.println("The Total amount lost in last 20 days = "+ Math.abs(Tot_Amt_Won_Lost));
        }
        double upper_margin = 0.5 *INITIAL_BET_STAKE;
        for (int i=1; i<31; i++) {
            double Daily_Amt_Won_Lost = 0;
            int Bets_Played = 0;
            while ((Daily_Amt_Won_Lost < upper_margin) && (Daily_Amt_Won_Lost > lower_margin)
                    && (Bets_Played < No_Of_Bets)){
                double random_num = Math.random();
                Bets_Played++;
                if (random_num > 0.5){
                    Daily_Amt_Won_Lost += BET_AMT;
                }else {
                    Daily_Amt_Won_Lost -= BET_AMT;
                }
            }
            if (Daily_Amt_Won_Lost > 0){
                System.out.println("The amount won on day "+ i + " = $"+Daily_Amt_Won_Lost);
            }
            else if (Daily_Amt_Won_Lost == 0){
                System.out.println("There is no net gain or loss on day "+ i);
            }
            else if (Daily_Amt_Won_Lost < 0){
                System.out.println("The amount lost on day "+ i + " = $" + Math.abs(Daily_Amt_Won_Lost));
            }
        }
    }
}
