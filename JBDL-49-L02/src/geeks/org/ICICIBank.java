package geeks.org;

public class ICICIBank implements Bank , Bank.NetbankingDetails{
    @Override
    public String getBankName() {
        return BankName.ICICI.val;
    }

    @Override
    public String getNetbankingBankName() {
        return BankName.ICICI_NETBANKING.val;
    }
}

//innerclass
//innerInterface
