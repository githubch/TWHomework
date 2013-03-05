import java.util.ArrayList;
import java.util.Arrays;
public class SalaryManager {
    public ArrayList<Income> income;
    private ArrayList<Tax> tax;
    public SalaryManager(){
        this.income = new ArrayList<Income>();
        this.tax = new ArrayList<Tax>();
    }

    public int getTotalIncome() {
        int salary = 0;
        for(int i = 0;i < income.size();i++)
            salary += income.get(i).getValue();
        int totalTax = 0;
        for(int i = 0;i < tax.size();i++)
            totalTax += tax.get(i).getTax();
        return salary - totalTax;
    }

    public void addIncome(Income income) {
        this.income.add(income);
    }

    public void addTax(Tax tax) {
        this.tax.add(tax);
    }
}
