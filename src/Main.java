import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        //Задача 1

        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("К сожалению, возраст совершеннолетия еще не наступил и нужно немного подождать");
        }

        //Задача 2

        Scanner input = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int peopleAge = input.nextInt();
        if (peopleAge >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (peopleAge >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (peopleAge >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу");
        }

        // Задача 3

        int capacity = 102;
        int seat = 60;
        int standing = capacity - seat;
        int numberOfPassengers = 43;

        if ( numberOfPassengers < seat) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (numberOfPassengers >= seat) {
            System.out.println("В вагоне только стоячие места");
        }

        if (numberOfPassengers >= capacity) {
            System.out.println("Вагон полностью забит");
        }

        //Задача 4

        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("К сожалению, возраст совершеннолетия еще не наступил и нужно немного подождать");
        }

        //Задача 5


        System.out.println("Введите возраст: ");
        int peopleAge1 = input.nextInt();
        if (peopleAge1 >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу");
        }

        if (peopleAge1 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }

        else  {
            System.out.println("Ребенок ходит в школу");
        }

        // Задача 3

        int capacity1 = 102;
        int seat1 = 60;
        int standing1 = capacity1 - seat1;
        int numberOfPassengers1 = 73;

        if (numberOfPassengers1 >= capacity1) {
            System.out.println("Вагон полностью забит");
        }

        if ( numberOfPassengers1 < seat1) {
            System.out.println("В вагоне есть сидячие места");
        }
        else  {
            System.out.println("В вагоне только стоячие места");
        }

        // Задача 4

        int randomAge = 25;
        if (randomAge >= 2 && randomAge <= 6) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить в детский сад");
        }
        else if (randomAge > 6 && randomAge <= 18) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить в школу");
        }
        else if (randomAge > 18 && randomAge <= 24) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить на работу ");
        }

        //Задача 5

        int childAge = 15;

        if (childAge < 5) {
            System.out.println("Ребеное не может кататься на аттракционе");
        }
        else if (childAge < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослых");
        }

        // Задача 6

        int one = 54;
        int two = 54;
        int free = 154;

        if (one > two) {
            if (one >= free) {
                System.out.println("Самое большое число " + one);
            }else {
                System.out.println("Самое большое число " + free);
            }
            }else if (two > one) {
            if (two >= free) {
                System.out.println("Самое большое число " + two);
            } else {
                System.out.println("Самое большое число " + free);
            }
        }else {
            if (one > free) {
                System.out.println("Самое большое число " + one);
            }else if (free > one) {
                System.out.println("Самое большое число " + free);
            } else {
                System.out.println("Все 3 числа равны");
            }

        }




    }
}
