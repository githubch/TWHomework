
public class SalaryCaculator {
    private int m_days = 0;
    int getBasicWage(int days){
        return days * 200;
    }

    int getAward(int days){
        return (int)(getBasicWage(days) * 0.1);
    }

    public int getAwardTax(int days){
        return (int)(getAward(days) * 0.05);
    }

    public int getTotalIncome(int days) {
        //return 0;
        return getBasicWage(days) + getAward(days) - getAwardTax(days) - getBasicWageTax(days);
    }

    public int getBasicWageTax(int days) {
        //return 0;
        //return (int)((getBasicWage(days) - 3500) * 0.1);
        if(getBasicWage(days) < 3500)
            return 0;
        else
            return (int)((getBasicWage(days) - 3500) * 0.1);
    }
}
