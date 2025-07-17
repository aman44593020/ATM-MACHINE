import java.util.HashMap;
import java.util.Map;

public class atmopertionimplementation implements ATMOpeartionInterface{
ATM atm = new ATM();
Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :"+atm.getBalance());

    }

    @Override

    public void withdrawAmount(double withdrawAmount) {
        ministmt.put(withdrawAmount," Amount withdraw");
        if (withdrawAmount<= atm.getBalance()) {
            System.out.println("collect the cash -> " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }
        else
        {
            System.out.println("NO MORE BALANCE");
        }
    }

    @Override

    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount deposit");
        System.out.println(depositAmount+" deposit succesfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m: ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
