package bank.t2208a1;

public class ValidateAccount {
    public final String MOBILE = "4444";
    public final String PASS = "4444";

    public boolean checkAccount(String mobile, String pass) {
        if (mobile.equals(MOBILE)) {
            if (pass.equals(PASS)) {
                System.out.println("Đăng nhập thành công !");
                return true;
            } else {
                System.out.println("Mật khẩu sai vui lòng nhập lại");
                return false;}
            } else{
                System.out.println("Kiểm tra lại số điện thoại hoặc pass");
                return false;
            }
        }
    }

