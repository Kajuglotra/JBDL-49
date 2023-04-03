package geeks.org;

public enum BankName  {
    ICICI("icici", 10, true), ICICI_NETBANKING("icici-netbank" ,11, false) , ICICI_UPI("icici-upi",13 , true),
    SBI("sbi", 20, true), SBI_NETBANKING("sbi-netbank" ,21, false) , SBI_UPI("sbi-upi",13 , true);

    String val;
    int bankId;
    boolean isActive;

    BankName(String val, int bankId, boolean isActive) {
        this.val = val;
        this.bankId = bankId;
        this.isActive = isActive;
    }
}
// public class BankName extends Enum

//objects are getting used a lot of times
//        inmemory , database???

