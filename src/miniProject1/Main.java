package miniProject1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Quiz project
        Scanner scanner = new Scanner(System.in);
        String[] geography = {
                "Самая большая страна?",
                "На каком месте Казахстан по площади?",
                "Сколько у нас океанов?",
                "На каком месте Канада по производству муки?"
        };

        String[] history = {
                "В каком году образовалось Казахское ханство?",
                "Когда развалился СССР?",
                "Кто первый хан казахского ханства?",
                "Первая столица Казахстана?"
        };

        String[] geographyAnswers = {
                "Россия",
                "9",
                "5",
                "2"
        };

        String[] historyAnswers = {
                "1465",
                "1991",
                "Керей",
                "Астана"
        };
        System.out.println("Привет! Добро пожаловать в игру");
        System.out.println("Выбери направление");
        int point = 0;
        int index = 0;
        while (true) {
            System.out.println("География. Для выбора нажми 1");
            System.out.println("История. Для выбора нажми 2");
            int choice = scanner.nextInt();
            if (choice == 1){
                for (String s : geography) {
                    System.out.println(s);
                    System.out.println("У вас всего 5 секунд на ответ");
                     int i = 0;
                     while (i < 5) {
                         System.out.print(i + " ");
                         Thread.sleep(1000);
                         i++;
                     }
                    System.out.println("Ваш ответ: ");
                    String answers1 = scanner.next();
                     if (answers1.equals(geographyAnswers[index])) {
                         System.out.println("Ваш ответ правильный");
                         point++;
                         index++;
                     } else {
                         System.out.println("Ваш ответ не правильный");
                     }

                }
            } else if (choice == 2) {
                // для второй науки
            }

            if (point == 4) {
                System.out.println("Вы победили, набрали " + point + " балла");
                break;
            } else {
                System.out.println("Вы проиграли, набрали " + point + " балла");
                break;
            }

        }

    }
}
