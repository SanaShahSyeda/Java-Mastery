package Generics;

public class User implements Comparable<User> {

    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User othUser) {
        // this < 0 --> -1
        // this == 0 --> 0
        // this > 0 --> 1

        // if (points < o.points)
        // return -1;
        // if (points == o.points)
        // return 0;
        // return 1;

        return points - othUser.points;
    }

    @Override
    public String toString() {
        return "Points= " + points;
    }

}
