package geeks.org;

public class Main {
    public static void main(String[] s){
        SBIBank sbiBank = new SBIBank();
        System.out.println(sbiBank.getBankName());

        ICICIBank iciciBank = new ICICIBank();
        System.out.println(iciciBank.getBankName());


    }
}
