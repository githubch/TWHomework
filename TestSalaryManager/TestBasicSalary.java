import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestBasicSalary {
    @Test
    public void workFor5DaysBasicSalaryIs1000(){
        BasicSalary basicSalary = new BasicSalary(5, 200);
        int salary = basicSalary.getValue();
        assertThat(salary, is(1000));
    }
}
