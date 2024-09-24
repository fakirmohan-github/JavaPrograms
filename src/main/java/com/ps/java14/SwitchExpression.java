package com.ps.java14;

public class SwitchExpression {
    static String dayOfweek;

    //Before Java 14
    public static String getDay(int day){
        switch (day){
            case 0:dayOfweek="Sunday";break;
            case 1:dayOfweek="Monday";break;
            case 2:dayOfweek="Tuesday";break;
            default:throw new IllegalArgumentException("Invalid option "+day);
        }
        return dayOfweek;
    }

    //After Java 14 -- Using Switch Expression
    public static String getDayUsingSwitchExp(int day){
        dayOfweek=switch (day){
            case 0->{//lambda Expression
                System.out.println("Write Some Complex Logic Here");
                yield  "Sunday";//we should write yield here instead of return
            }//No semicolon here
            case 1->"Monday";
            case 2->"Tuesday";
            default -> throw new IllegalArgumentException("Invalid Option"+day);
        };//Extra Semicolon Here
        return dayOfweek;
    }

    public static void main(String[] args) {
        System.out.println(getDay(1));
        System.out.println(getDayUsingSwitchExp(2));

    }
}
