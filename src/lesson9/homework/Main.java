package lesson9.homework;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1, "Player1", "Player1 surname", "forward");
        Player player2 = new Player(2, "Player2", "Player2 surname", "goalkeeper");
        Player players[] = {player, player2};

        Club club = new Club("Club1", "Spain", 9, players);
        club.printClubData();

    }
}

class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class Club {
    String name;
    String country;
    int ratings;
    Player players[];


    public Club(String name, String country, int ratings, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratings = ratings;
        this.players = players;
    }

    public Club() {

    }

    void printClubData() {
        System.out.println(name + " " + country + " " + ratings);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
