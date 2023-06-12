package lesson8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // инкапсуляция
//        Student s = new Student();
//        s.setName("Arman"); // задает значение
//        System.out.println(s.getName()); // берет значение
        Scanner scanner = new Scanner(System.in);
        User u1 = new User("admin", "1234", "admin");
        User u2 = new User("manager", "4444", "manager");
        User u3 = new User("proger", "2222", "proger");

        User users[] = {u1, u2, u3};
        System.out.println("Insert login: ");
        String login = scanner.next();
        System.out.println("Insert password: ");
        String password = scanner.next();
        boolean check = true;
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("Welcome, " + user.getLogin());
                while (check) {
                    System.out.println("[1] edit login");
                    System.out.println("[2] edit password");
                    System.out.println("[3] delete account");
                    System.out.println("[0] exit");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Login editing");
                            System.out.println("Insert new login");
                            String newLogin = scanner.next();
                            user.setLogin(newLogin);
                            System.out.println(newLogin + " is your new Login");
                            break;
                        case 2:
                            System.out.println("Password editing");
                            System.out.println("Insert new password");
                            String newPassword = scanner.next();
                            user.setPassword(newPassword);
                            System.out.println(user.getPassword2() + " is your new password");
                            break;
                        case 3:
                            user = null;
                            System.out.println("account deleting");
                            break;
                        case 0:
                            System.out.println("bye");
                            check = false;
                            break;
                    }
                }
            }
        }


        // Задача
        // Создайте класс User с параметрами:
        //- int id;
        //- String login;
        //- String password; - String role;
        //+ User()
        //+ User(int id, String login, String password, String role)
        //+ String toString() // Данный метод возвращает все данные пользователя. Но, для возврата, используйте геттеры и сеттеры а не поля.
        //Геттеры и сеттеры для каждого параметра.
        //В основном классе создайте несколько объектов класса Users и добавьте их в массив.
        // Далее, используя цикл, выведите логин каждого пользователя.

        //Задание 2
        //Во втором задании, вы должны заранее в массив добавить 10 объектов класса Users.
        // Используйте данный массив как базу данных пользователей.
        //При запуске программы, у вас должны запрашивать логин и пароль:
        //INSERT LOGIN:
        //Вводите логин
        //INSERT PASSWORD:
        //Вводите пароль
        //При верном раскладе, программа должна вас запустить
        //Welcome Erlan
        //PRESS [1] TO EDIT LOGIN
        //Insert login
        //PRESS [2] TO CHANGE PASSWORD
        //Insert old password Insert new password
        // Re-Insert new password
        //PRESS [3] TO DELETE OWN ACCOUNT
        // PRESS [0] TO EXIT
    }
}

class User {
    private int id;
    private String login;
    private String password;
    private String role;
    private static int userId = 0;

    public User(String login, String password, String role) {
        this.id = ++userId;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    String encoding(String pass) {
        return pass.charAt(0) + "%343449089dnms"
                + new StringBuilder(pass).reverse().toString();
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getPassword2() {
        return encoding(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
