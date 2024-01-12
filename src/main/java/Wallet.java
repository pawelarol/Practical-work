import java.sql.Timestamp;

public class Wallet {
    private long transferId = 0;
    private Timestamp transferDate;
    private int allMoney;
    private int comeMoney;
    private int outMoney;
    private int netProfit;

    public void calculateMoney(Wallet wallet){

        int taxPercent = 19;
        int bossPercent = 30;

        int tax = wallet.getComeMoney() * taxPercent / 100;
        int boss = (wallet.getComeMoney() - tax) * bossPercent / 100;
        int netProfit = wallet.getComeMoney() - tax - boss - wallet.getOutMoney();
        wallet.setAllMoney(wallet.getAllMoney() + netProfit);
        wallet.setNetProfit(netProfit);
        System.out.println(netProfit);
        transferId++;
    }


    public Wallet() {
    }

    public long getTransferId() {
        return transferId;
    }

    public void setTransferId(long transferId) {
        this.transferId = transferId;
    }

    public Timestamp getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Timestamp transferDate) {
        this.transferDate = transferDate;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getComeMoney() {
        return comeMoney;
    }

    public void setComeMoney(int comeMoney) {
        this.comeMoney = comeMoney;
    }

    public int getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(int outMoney) {
        this.outMoney = outMoney;
    }

    public int getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(int netProfit) {
        this.netProfit = netProfit;
    }
}
