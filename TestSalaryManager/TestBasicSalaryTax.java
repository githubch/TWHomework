import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestBasicSalaryTax {
    @Test
    public void workFor5DaysTaxIs0(){
        BasicSalary basicSalary = new BasicSalary(5, 200);
        BasicSalaryTax basicSalaryTax = new BasicSalaryTax(basicSalary, 0.1f, 3500);
        int tax = basicSalaryTax.getTax();
        assertThat(tax,is(0));
    }

    @Test
    public void workFor30DaysTaxIs250(){
        BasicSalary basicSalary = new BasicSalary(30, 200);
        BasicSalaryTax basicSalaryTax = new BasicSalaryTax(basicSalary, 0.1f, 3500);
        int tax = basicSalaryTax.getTax();
        assertThat(tax, is(250));
    }
}
