public class Main {
    public static void main(String[] args) {
        /*Task1*/

        int age = 18;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        /*Task2*/
        {

            int temp = 3;
            if (temp < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }

        }
        /*Task3*/
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
        }
        /*Task4*/
        int age1 = 27;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + "то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age1 > 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }
        /*Task5*/
        int age2 = 14;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то он не может кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 +
                    " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 +
                    " то он может кататься без сопровождения взрослого");
        }
        /*Task6*/

        int passanger = 70;
        if (passanger <= 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (passanger > 60 && passanger <= 102) {
            System.out.println("В вагоне только стоя");
        }
        else {
            System.out.println("В вагоне мест нет");
        }
        /*Task7*/
        int one = 1;
        int two = 2;
        int three = 3;
        int max;
        if (one<two) {
            max = two;
        } else {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println("Большее число" + max );
    }

    }