import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestSalaryManager {
    @Test
    public void workFor5DaysTotalIncomeIs1095(){
        SalaryManager salaryManager = new SalaryManager();
        BasicSalary basicSalary = new BasicSalary(5, 200);
        BasicSalaryTax basicSalaryTax = new BasicSalaryTax(basicSalary, 0.1f, 3500);
        Award award = new Award(basicSalary, 0.1f);
        AwardTax awardTax = new AwardTax(award, 0.05f);
        salaryManager.addIncome(award);
        salaryManager.addIncome(basicSalary);
        salaryManager.addTax(basicSalaryTax);
        salaryManager.addTax(awardTax);
        int income = salaryManager.getTotalIncome();
        assertThat(income, is(1095));
    }
}
