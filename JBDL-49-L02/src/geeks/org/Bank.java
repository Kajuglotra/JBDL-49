package geeks.org;

public interface Bank {

    //static and public
     public  abstract String getBankName();
//    public static String getBankName();
    int a =10;
     static String getFuncBody(){
        return "Inside interface method body";
    }
    default String getFuncDefaultBody(){
        return "Inside Default interface method in BankDetails body";
    }
    //upi, netbanking
    interface UPIBankDetails{
        String getUpiBankName();
    }
    interface  NetbankingDetails{
        String getNetbankingBankName();
    }




}
//java 8
//static and default

//interface - extends  -> other interface
//interface - implements -> other class -> not possible


//interface class

