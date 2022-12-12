package HW7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bank {
    public static HashSet<Account> getAccount(HashMap<Client, HashSet<Account>> ListClient) {
        HashSet<Account> currentAccount = null;
        Client searchClient = new Client("Иванов Василий", 35);
        currentAccount = ListClient.get(searchClient);
        return currentAccount;
    }

    public static String findClient(HashMap<Client, HashSet<Account>> ListClient) {
        String currentFIO = null;
        Account searchAccount = new Account(100300);
        for (Map.Entry<Client, HashSet<Account>> entry : ListClient.entrySet()) {
            HashSet<Account> currentAccount = entry.getValue();
            for (Account acc : currentAccount) {

                if (acc.equals(searchAccount)) {
                    currentFIO = entry.getKey().getName();
                }
            }
        }
        return currentFIO;
    }
}
