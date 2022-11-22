package HW8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class homework8 {

    public static void main(String[] args) {
        User user1 = new User("Иванов", 28);
        User user2 = new User("Медведев", 40);
        User user3 = new User("Кукушкин", 14);
        ArrayList<User> ListUser = new ArrayList<>();
        ListUser.add(user1);
        ListUser.add(user2);
        ListUser.add(user3);
        int index = 2;
        int checkAge = ListUser.get(index).getAge();
        try {
            if (checkAge < 18) {
                throw new RuntimeException();
            } else
                System.out.println("Уважаемый пользователь " + ListUser.get(index).getLastName() + " для Вас создан статус VIP");
        } catch (RuntimeException e) {
            System.out.println("Уважаемый пользователь " + ListUser.get(index).getLastName() + " Статус VIP доступен для пользователей старше 18 лет");
        } finally {
            System.out.println("Благодарим за использование нашей платфомы");
        }

        String src = "src/HW8/File/log.txt";
        String dest = "src/HW8/File/copy.txt";

        try (FileInputStream input = new FileInputStream(src);

             FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------" + "\n" + "try-with-resources GONE");
    }
}