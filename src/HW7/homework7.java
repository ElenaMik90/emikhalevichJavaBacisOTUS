package HW7;

import java.util.HashMap;
import java.util.HashSet;

public class homework7 {
    public static void main(String[] args) {
        Client client1 = new Client("Иванов Василий", 35);
        Client client2 = new Client("Петров Иван", 25);
        Client client3 = new Client("Смирнов Олег", 30);

        Account account1 = new Account(100100);
        Account account2 = new Account(100101);
        Account account3 = new Account(100102);
        Account account4 = new Account(100200);
        Account account5 = new Account(100201);
        Account account6 = new Account(100300);
        Account account7 = new Account(100301);


        HashMap<Client, HashSet<Account>> ListClients;
            ListClients = new HashMap<>();
            HashSet<Account> accountClient1 = new HashSet<>();
            accountClient1.add(account1);
            accountClient1.add(account2);
            accountClient1.add(account3);
            HashSet<Account> accountClient2 = new HashSet<>();
            accountClient2.add(account4);
            accountClient2.add(account5);
            HashSet<Account> accountClient3 = new HashSet<>();
            accountClient3.add(account6);
            accountClient3.add(account7);
            ListClients.put(client1, accountClient1);
            ListClients.put(client2, accountClient2);
            ListClients.put(client3, accountClient3);


        System.out.println("Получить аккаунт по ФИО: " + Bank.getAccount(ListClients));
        System.out.println("-------------------------------");
        System.out.println("Получить имя клиента по номеру счёта: " + Bank.findClient(ListClients));


    }


}
