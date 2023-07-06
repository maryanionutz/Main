package org.example;
class Methods {
    int value;
    String animal;
    int days;

    void run() {
        System.out.println("My "+animal+ " is "+value+ " years old.");
    }
    void calculateMyBirthday(){
        int daysLeft = 20 + days;
        System.out.println("Days until my birthday "+daysLeft);
    }
    void talk (String text){
        System.out.println(text);
    }
}
public class Main {
    public static void main(String[] args) {
        Methods name = new Methods();
        name.value = 4;
        name.animal = "Cat";
        name.days = 8;
        name.run();
        name.calculateMyBirthday();
        name.talk("Hi, my name is John");


    }


}