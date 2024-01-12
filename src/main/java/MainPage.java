import java.util.Scanner;

public class MainPage {
    public static void main(String[] args){
        Wallet wallet = new Wallet();
        enterMoney(wallet);
        wallet.calculateMoney(wallet);
   WalletImpl wp = new WalletImpl();
   wp.saveWallet(wallet);
    }

    private static void enterMoney(Wallet wallet) {
        Scanner enterData = new Scanner(System.in);
        System.out.println("Enter how much money have come : ");
        wallet.setComeMoney(enterData.nextInt());
        System.out.println("Enter how much money was spent : ");
        wallet.setOutMoney(enterData.nextInt());
    }
}
