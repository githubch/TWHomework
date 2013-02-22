public class SalaryCaculator {
    private int salaryPerDay = 200;
    private int salaryOfNoTax = 3500;
    private double salaryTaxPart = 0.1;
    private double awardPart = 0.1;
    private double awardTaxPart = 0.05;
                        
    public SalaryCaculator(int daySalary, int salaryOfNoTax , double salaryTaxPart, double awardPart, double awardTaxPart){
        this.salaryPerDay = daySalary;
        this.salaryOfNoTax = salaryOfNoTax;
        this.salaryTaxPart = salaryTaxPart;
        this.awardPart = awardPart;
        this.awardTaxPart = awardTaxPart;
    }
                            
    int getBasicWage(int days){
        //return days * 200;
        return days * salaryPerDay;
    }
                                
    int getAward(int days){
        //return (int)(getBasicWage(days) * 0.1);
        return (int)(getBasicWage(days) * awardPart);
    }
                                    
    public int getAwardTax(int days){
        //return (int)(getAward(days) * 0.05);
        return (int)(getAward(days) * awardTaxPart);
    }
                                        
    public int getTotalIncome(int days) {
        //return 0;
        return getBasicWage(days) + getAward(days) - getAwardTax(days) - getBasicWageTax(days);
    }
                                            
    public int getBasicWageTax(int days) {
        //return 0;
        //return (int)((getBasicWage(days) - 3500) * 0.1);
                                                                    
        //if(getBasicWage(days) < 3500)
        //    return 0;
        //else
        //    return (int)((getBasicWage(days) - 3500) * 0.1);
                                                                                                    
        int basicWage = getBasicWage(days);
        if(basicWage < salaryOfNoTax)
            return 0;
        else
            return (int)((basicWage - salaryOfNoTax) * salaryTaxPart);
    }
}
