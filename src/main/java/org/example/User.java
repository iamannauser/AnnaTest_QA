package org.example;

public class User implements Comparable<User> {
    private String birthPlace;
    private String zodiac;

    public User(String birthPlace, String zodiac) {
        this.birthPlace = birthPlace;
        this.zodiac = zodiac;
    }
    @Override
    public int compareTo(User other) {
        return this.zodiac.equals(other.zodiac) ? 0 : 1;
    }
}

class Main2 {
    public static void main(String[] args) {
        User user1 = new User("Kyiv", "gemini");
        User user2 = new User("Kyiv", "scorpio");

        if (user1.compareTo(user2) != 0) {
            System.out.println("User1 and User2 have different zodiac signs");
        } else {
            System.out.println("User1 and User2 have the same zodiac sign");
        }
    }
}



