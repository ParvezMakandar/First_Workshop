public class GamblerUC7 {


    public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;

    public static void main(String[] args) {
        System.out.println("INITIAL_BET_STAKE");
        System.out.println("BET_AMT");

        int n = 20, No_Of_Bets = 100, Lucky_Day = 0,Unlucky_Day = 0;
        double Lucky_Day_Amt = 0,Unlucky_Day_Amt = 0;
        int rem_amt = INITIAL_BET_STAKE;
        rem_amt -= BET_AMT;

        double Tot_Amt_Won_Lost = 0;
        System.out.println("The Gambler loses the bet and he has $"+ rem_amt + " with him after one bet.");
        double lower_margin;
        System.out.println("The Gambler Resigns for the day after he has $" + (double) INITIAL_BET_STAKE + " with him.");

        lower_margin = -1*INITIAL_BET_STAKE;
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

        for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;
            while ((daily_amt_won_lost<upper_margin) && (daily_amt_won_lost>lower_margin)
                    && (bets_played < No_Of_Bets)){
                double random_num = Math.random();
                bets_played++;
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else {
                    daily_amt_won_lost -= BET_AMT;
                }
            }
            if (Lucky_Day_Amt<daily_amt_won_lost){
                Lucky_Day_Amt = daily_amt_won_lost;
                Lucky_Day = i;
            }
            if (Unlucky_Day_Amt>daily_amt_won_lost){
                Unlucky_Day_Amt = daily_amt_won_lost;
                Unlucky_Day = i;
            }
        }
        System.out.println("The luckiest day for gambler is "+ Lucky_Day + "th day, on which he won $"+Lucky_Day_Amt);
        System.out.println("And the unluckiest day for gambler is "+ Unlucky_Day + "th day, on which he lost $"+Math.abs(Unlucky_Day_Amt));

        for (int i=1;i<31;i++){
            double Daily_Amt_Won_Lost = 0;
            int bets_played = 0;
            while ((Daily_Amt_Won_Lost < upper_margin) && (Daily_Amt_Won_Lost > lower_margin)
                    && (bets_played < No_Of_Bets)){
                double random_num = Math.random();
                bets_played++;
                if (random_num>0.5){
                    Daily_Amt_Won_Lost += BET_AMT;
                }else {
                    Daily_Amt_Won_Lost -= BET_AMT;
                }
            }
            Tot_Amt_Won_Lost += Daily_Amt_Won_Lost;
        }
        if (Tot_Amt_Won_Lost>0){
            double random_num1 = Math.random();
            if (random_num1>0.5){
                System.out.println("The gambler has won $"+ Tot_Amt_Won_Lost+ " last month and he should play in this month too");
            }
            else {
                System.out.println("The gambler has won $"+ Tot_Amt_Won_Lost+ " last month and he should stop gambling now.");
            }
        }
        else if (Tot_Amt_Won_Lost <= 0){
            System.out.println("The gambler has lost in last month $" + Math.abs(Tot_Amt_Won_Lost)+ " and to avoid further losses he should stop playing now.");
        }
    }

}

