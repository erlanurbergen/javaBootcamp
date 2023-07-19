package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        List<User> users = new ArrayList<>();
        while(true) {
            System.out.println("[1] to add users");
            System.out.println("[2] to list users");
            System.out.println("[3] to delete users");
            System.out.println("[4] to exit");
            int choice = Integer.parseInt(reader.readLine());
            if (choice == 1) {
                System.out.println("Insert login");
                String login = reader.readLine();
                System.out.println("Insert password");
                String pass = reader.readLine();
                users.add(new User(login, pass));
                saveUserList(users);
            } else if (choice == 2) {
                List<User> userList = getUserList();
                userList.forEach(System.out::println);
            } else if (choice == 3) {
                int index = Integer.parseInt(reader.readLine());
                if (index < users.size()) {
                    users.remove(index);
                    saveUserList(users);
                } else {
                    System.out.println("incorrect index");
                }
            } else if (choice == 4){
                break;
            }
        }
    }

    private static List<User> getUserList() {
        List<User> users = null;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String text;
            users = new ArrayList<>();

            while ((text = reader.readLine())!= null) {
                String[] s = text.split(" ");
                users.add(new User(Integer.parseInt(s[0]), s[1], s[2]));
            }

            reader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    private static void saveUserList(List<User> users) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("data.txt"));
            for (User user : users) {
                writer.write(user.toString() + "\n");
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User {
    private int id;
    private String login;
    private String password;
    private int userId = 1;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User(String login, String password) {
        this.id = userId;
        this.login = login;
        this.password = password;
        userId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return id + " " + login + " " + password;
    }
}
