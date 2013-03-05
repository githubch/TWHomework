/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13-3-4
 * Time: 上午11:31
 * To change this template use File | Settings | File Templates.
 */
public class BasicSalaryTax implements Tax {
    private BasicSalary basicSalary = null;
    private float rate = 0.0f;
    private int salaryThreshold = 0;
    public BasicSalaryTax(BasicSalary basicSalary, float rate, int salaryThreshold) {
        this.basicSalary = basicSalary;
        this.rate = rate;
        this.salaryThreshold = salaryThreshold;
    }

    public int getTax() {
        int salary = basicSalary.getValue();
        if(salary <= salaryThreshold)
            return 0;
        else
            return (int)((salary - salaryThreshold) * rate);
    }
}
