package bank.t2208a1;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller {
    private static long balanceNuber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    public long getBalanceNuber(){
        return balanceNuber;
    }
    public static long transfer(long money){
        if(money > balanceNuber){
            System.out.printf(" số tài khoản của bạn khôngg đủ để thực hiện giao dịch!\n");
        } else if (money < 50000) {
            System.out.printf("Tiền chuyển tối thiếu phải là 50.000\n");
        } else if (money > 50000) {
            balanceNuber -= money;
            System.out.printf("chuyển tiền thành công!\n");
            System.out.printf("số tiền của bạn còn : \n"+ balanceNuber);

        }
        return balanceNuber;
    }
    public void actionTransfer(){
            Scanner sc = new Scanner(System.in);
        System.out.printf("nhập nội dung chuyển tiền: ");
        String descripyion = sc.nextLine();
        System.out.printf("nhập số tài khoản nhận : \n");
        String beneficiaryAccount  = sc.nextLine();
        System.out.printf("Nhập số tiền cần chuyển : \n");
        long money = sc.nextLong();
        long newbalance = transfer(money);
        //tạo đối tượng transaction và thêm vào list//
        TransactionHistory transactionHistory = new TransactionHistory(descripyion,beneficiaryAccount,money);
        listHistory.add(transactionHistory);
    }
    public void getHistory(){
        for(TransactionHistory transactionHistory: listHistory){
            System.out.printf(transactionHistory.toString());}

    }
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }
}
