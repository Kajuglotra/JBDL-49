package geeks.org;

public interface BankDetails2 {

    default String getFuncDefaultBodys(){
        return "Inside Default interface method in BankDetails1 body";
    }
    static String getFuncBody(){
        return "Inside interface method body";
    }

}
