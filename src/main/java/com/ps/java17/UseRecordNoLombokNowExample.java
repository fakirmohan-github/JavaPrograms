package com.ps.java17;

public class UseRecordNoLombokNowExample {
    //with the help of record keyword no need to write gettes, seeter, constructor, toString, hascode, equals etc.
    //We can create custom implementation as well.
    record Person(String name,Integer age, Long mob){}

    //Can create our own custom Constructor

    /*record Person(String name,Integer age,Long mob){

     //static field is allowed to initialised
        static int staticfield=100;

        //Non Static Field not allowed to initialize
        //int nsfield=100;

        Person(String name,Integer age,Long mob){
            if(name==null)
                throw new IllegalArgumentException("Name is Null");
            this.name=name;
            this.age=age;
            this.mob=mob;
        }
        //we can define our own method also
        public String name(){
        System.out.println("write some logic");
        return name;
        }

    }*/

    //The above custom record can be replaced by compact constucter like below
    /*record Person(String name, Integer age, Long mob){
        Person{
            if(name==null)
                throw new IllegalArgumentException("Name is null");
        }
    }*/


    public static void main(String[] args) {
        Person person1=new Person("Fakir",31,123l);
        Person person2=new Person("Mohan",30,321l);
        Person person3=new Person("Fakir",31,123l);
        //Equals and Hashcode Method Check
        System.out.println("Person 1 and Person 2 are equal :: "+person1.equals(person2));
        System.out.println("Person 1 and Person 3 are equal :: "+person1.equals(person3));
        //GetterMethod Check
        System.out.println(person2.age);
        //Setter Method Check -- Not able to change any attribute at these are final
        //person2.age()=31;
    }
}
