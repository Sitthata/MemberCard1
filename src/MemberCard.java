public class MemberCard {
    static final int point2Cash100 = 800;
    static final int bath2Point = 25;
    private long memberId;
    private double totalPurchasedAmount;
    private int totalPoint;
    private int usagePoints;
    private int redeemCount;

    public MemberCard(long idCard){
        memberId = idCard;
    }

    public long getMemberId() {
        return memberId;
    }

    public double getTotalPurchasedAmount() {
        return totalPurchasedAmount;
    }

    public int getRemainingPoint() {
        return totalPoint;
    }

    public int getUsagePoints() {
        return usagePoints;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MemberCard{");
        sb.append("memberId=").append(memberId);
        sb.append(", totalPurchasedAmount=").append(totalPurchasedAmount);
        sb.append(", totalPoint=").append(totalPoint);
        sb.append(", usagePoints=").append(usagePoints);
        sb.append('}');
        return sb.toString();
    }

    public void buy(double purchaseAmount){
        totalPurchasedAmount += purchaseAmount;
        addPoint(totalPurchasedAmount);
        System.out.println("Your purchased amount is: "+totalPurchasedAmount+" your point: "+totalPoint);
    }

    public void addPoint(double totalPurchasedAmount){
        totalPoint += totalPurchasedAmount / bath2Point;
    }

    public int redeem(){
        if(totalPoint >= point2Cash100){
            usagePoints += point2Cash100;
            totalPoint -= point2Cash100;
            redeemCount +=1 ;
            return 100;
        }
        return 0;
    }

    public int getNumberOfRedeem(){
        return redeemCount;
    }


}
