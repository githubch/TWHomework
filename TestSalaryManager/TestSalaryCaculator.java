import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//测试用例：
//1、除去税收，工作5天的工资总额是200 * 5= 1000元
//2、工作5天的基本工资所得税为0元
//3、工作5天的奖金是${5天的工作总额} * 10% = 100元
//4、工作5天的奖金税是100 * 5% = 5元
//5、工作5天收入总额为1000 + 100 - 5 = 1095；
//6、工作30天的个人税收是（${30天的工资总额} - 3500）* 10% = 250元
//7、工作30天收入总额为6320元
public class TestSalaryCaculator {
    @Before
    public void setup(){
        salaryCaculator = new SalaryCaculator(200, 3500, 0.1f, 0.1f, 0.05f);
    }
    
    @Test
    public void workFor5DaysWageShouldBe1000(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int wage = salaryCaculator.getBasicWage(5);
        assertThat(wage, is(1000));
    }

    @Test
    public void workFor5DaysTheBasicWageTaxShoudeBe0(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int wageTax = salaryCaculator.getBasicWageTax(5);
        assertThat(wageTax, is(0));
    }

    @Test
    public void workFor5DaysShouldAward100(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int award = salaryCaculator.getAward(5);
        assertThat(award, is(100));
    }

    @Test
    public void workFor5DaysAwardTaxShouldbe5(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int tax = salaryCaculator.getAwardTax(5);
        assertThat(tax, is(5));
    }

    @Test
    public void workFOr5DaysTotalIncomeShouldBe1095(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int income = salaryCaculator.getTotalIncome(5);
        assertThat(income, is(1095));
    }

    @Test
    public void workFor30DaysTheBasicWageTaxShouldBe250(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int baseWageTax = salaryCaculator.getBasicWageTax(30);
        assertThat(baseWageTax, is(250));
    }

    @Test
    public void workFor30DaysTheTotalIncomeShoubleBe6320(){
        //SalaryCaculator salaryCaculator = new SalaryCaculator();
        int income = salaryCaculator.getTotalIncome(30);
        assertThat(income, is(6320));
    }

}
