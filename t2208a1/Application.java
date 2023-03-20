package bank.t2208a1;

import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateAccount validateAccount = new ValidateAccount();
        Controller controller = new Controller();

        boolean isCheck = false;
        while (!isCheck){
            System.out.printf("nhập số điện thoại: ");
            String mobile =sc.nextLine();

            System.out.printf("Nhập mật khẩu : ");
            String pass = sc.nextLine();
            isCheck = validateAccount.checkAccount(mobile,pass);
        }
        while (true){
            menu();
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.printf("số dư: \n");
                    long balance = controller.getBalanceNuber();
                    System.out.printf(Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.printf("lịch sử giao dịch: ");
                    controller.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.printf("không có lựa chọn này");
                    break;
            }
        }
    }
    public static void menu(){
        System.out.printf("Lựa chọn của bạn là: ");
        System.out.printf("\n1 : Xem số dư tài khoản\n");
        System.out.printf("2 : chuyển khoản\n");
        System.out.printf("3 : Xem lịch sử giao dịch\n");
        System.out.printf("0 : thoát\n");

    }
}
