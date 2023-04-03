package geeks.org;

public class SBIBank implements Bank , Bank.UPIBankDetails{

    public String getBankName(){
        return BankName.SBI.val;
    }


    @Override
    public String getUpiBankName() {
        return BankName.SBI_UPI.name();
    }
}



//class  interface
//
//class class
//class interface
//interface class
//interface interface


