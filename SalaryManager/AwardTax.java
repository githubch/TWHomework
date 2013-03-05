/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13-3-4
 * Time: 下午1:20
 * To change this template use File | Settings | File Templates.
 */
public class AwardTax implements Tax {
    private Award award = null;
    private float rate = 0.05f;
    public AwardTax(Award award, float rate) {
        this.award = award;
        this.rate = rate;
    }

    public int getTax() {
        int awardInt = award.getValue();
        return (int)(awardInt * rate);
    }
}
