package section21.test;

import section21.domain.Person;

public class TestMatrix {

    public static void main(String[] args) {

        int[][] ages = new int[3][2];
        System.out.println("ages = " + ages);

        ages[0][0] = 5;
        ages[0][1] = 7;
        ages[1][1] = 8;
        ages[1][1] = 4;

        System.out.println("ages[0][0] = " + ages[0][0]);
        System.out.println("ages[0][1] = " + ages[0][1]);

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.print(ages[i][j] + " ");
            }
            System.out.println();
        }

        String[][] fruits = {{"Orange", "Lemon"}, {"Strawberry", "Apple", "Coconut"}};
        print(fruits);
//        for (int i = 0; i < fruits.length; i++) {
//            for (int j = 0; j < fruits[i].length; j++) {
//                System.out.println("fruits [" + i + "][" + j +"] : " + fruits[i][j]);
//            }
//        }

        Person[][] people = new Person[2][3];
        people[0][0] = new Person("Juan");
        people[0][1] = new Person("Carlos");
        print(people);

    }

    public static void print(Object matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix [" + i + "][" + j + "] : " + matrix[i][j]);
            }
        }
    }

}
