package com.inhouse.user;

public class User implements Comparable<User>{
    String rank;
    double weight;
    int age;
    boolean isBoy;

    public User(String rank, double weight, int age, boolean isBoy) {
        this.rank = rank;
        this.weight = weight;
        this.age = age;
        this.isBoy = isBoy;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    @Override
    public int compareTo(User other) {
        return Integer.compare(this.age, other.age);
    }
}