import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//测试用例：
//1、除去税收，工作5天的工资总额是200 * 5= 1000元
//2、工作5天的奖金是${5天的工作总额} * 10% = 100元
//3、工作5天的奖金税是100 * 5% = 5元
//4、工作5天收入总额为1000 + 100 - 5 = 1095；
//5、除去税收， 工作30天的工资总额是30 * 200 = 6000元
//6、工作30天的奖金是￥{30天的工资总额} * 10% = 600元
//7、工作30天的个人税收是（${30天的工资总额} - 3500）* 10% = 250元
//8、工作30天的奖金税是600 * 5% = 30元
public class TestSalaryCaculator {
    @Test
    public void workFor5DaysWageShouldBe1000(){
        SalaryCaculator salaryCaculator = new SalaryCaculator();
        int wage = salaryCaculator.getBasicWage(5);
        assertThat(wage, is(1000));
    }

    @Test
    public void workFor5DaysShouldAward100(){
        SalaryCaculator salaryCaculator = new SalaryCaculator();
        int award = salaryCaculator.getAward(5);
        assertThat(award, is(100));
    }
}
