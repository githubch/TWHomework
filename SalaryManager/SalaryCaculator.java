
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
}
