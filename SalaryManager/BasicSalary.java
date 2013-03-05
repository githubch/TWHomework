public class BasicSalary implements Income{
    private int daysOfWork = 0;
    private int salaryPerDay = 0;
    public BasicSalary(int daysOfWork, int salaryPerDay) {
        //To change body of created methods use File | Settings | File Templates.
        this.daysOfWork = daysOfWork;
        this.salaryPerDay = salaryPerDay;
    }

    public int getValue() {
        return daysOfWork * salaryPerDay;
    }
}
