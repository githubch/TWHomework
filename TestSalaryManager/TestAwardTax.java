import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestAwardTax {
    @Test
    public void workFor5DaysAwardTaxIs5(){
        BasicSalary basicSalary = new BasicSalary(5, 200);
        Award award = new Award(basicSalary, 0.1f);
        AwardTax awardTax = new AwardTax(award, 0.05f);
        int tax = awardTax.getTax();
        assertThat(tax, is(5)) ;
    }
}
