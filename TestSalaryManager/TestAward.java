import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestAward {
    @Test
    public void workFor5DaysAwardIs100(){
        BasicSalary basicSalary = new BasicSalary(5, 200);
        Award award = new Award(basicSalary, 0.1f);
        int awardMoney = award.getValue();
        assertThat(awardMoney, is(100));
    }
}
