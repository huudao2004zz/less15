package bank.t2208a1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
    private Long id;
    private LocalDate dayTrading;
    private String descripyion;
    private String beneficiaryAccount;
    private long money;

    public TransactionHistory(String descripyion,String  beneficiaryAccount,long money){
        this.id = IdGenerate.getNewID();
        this.dayTrading = LocalDate.now();
        this.descripyion = descripyion;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public void setDayTrading(LocalDate dayTrading) {
        this.dayTrading = dayTrading;
    }

    public String getDescripyion() {
        return descripyion;
    }

    public void setDescripyion(String descripyion) {
        this.descripyion = descripyion;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
    public String toString(){
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + "-" + dayTrading.format(myFormatter)+ " - "+ descripyion + " - " + Controller.formatMoney(money)+ " - " + beneficiaryAccount + " \n";
    }


}
