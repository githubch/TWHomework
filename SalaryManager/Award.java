/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13-3-4
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
public class Award implements Income{
    private BasicSalary basicSalary = null;
    private float rate = 0.0f;
    public Award(BasicSalary basicSalary,float rate) {
        this.basicSalary = basicSalary;
        this.rate = rate;
    }

    public int getValue() {
        int salary = basicSalary.getValue();
        return (int)(salary * rate);
    }
}
