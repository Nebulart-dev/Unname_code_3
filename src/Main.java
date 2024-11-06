/* public class Main {
    public static void main(String[] args) {
    int x, y, z;
    x = 100;
    y = 100 + 20;
    z = y - 20;
    System.out.println("X = " + x);
    System.out.println("Y = " + y);
    System.out.println("Z = " + z);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int x, age, z;
        x = 100;
        age = 22;
        z = x / 100;
        System.out.println("Число: " + x + ", возраст: " + age + ", второе число: " + z);

    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int z = 5;
        z++;
        int c = ++z;
        System.out.println(c++); //1
        int f = --z;
        System.out.println(++f); //2
        int q = --c + f--;
        System.out.println(q); //3
        System.out.println(f);
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        int age = 15;
    if (age >= 18) {
        System.out.println("OK");
    }
    else {
            System.out.println("No");
    }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        boolean money = true;
        String text = "Пришли 100 рублей";

        if (money == true) {
            System.out.println("Друг ");
        } else {
            System.out.println("Должник ");
        }
        System.out.println(text);
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
       int age = 4;
        System.out.println("Ваш возраст: " + age);
       if (age == 10) {
            System.out.print("Ваша категория: ");
            System.out.print("Ребенок");
        } else if (age >= 18) {
            System.out.print("Ваша категория: ");
            System.out.print("Взрослый");
        } else if (age >= 70) {
            System.out.print("Ваша категория: ");
            System.out.print("Пожилой");
        } else {
            System.out.print("Ни одна категория не подходит!");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        boolean isMan = true;
        int age = 18;
        if (isMan == true && age >= 18) {
            System.out.println(" Взрослый");
        } else {
            System.out.println(" Ребенок");
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        boolean isX = true;
        boolean isY = true;
        int age = 10;

        if ((age > 30 && (isY || isX))) {
            System.out.println("X");
        } else {
            System.out.println("Y");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int age = 10;
        int w = 20;
        boolean isMan = true;

        if (!isMan) {
            System.out.println(1);
            if (w > age || isMan == false) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }else{
            System.out.println(4);
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int num = 4;
        switch (num) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            default:
                System.out.println("Неизвестно");
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        char word = 'g';

        switch (word) {
            case 'r':
                System.out.printf("Красный");
                break;
            case 'b':
                System.out.printf("Синий");
                break;
            case 'y':
                System.out.printf("Желтый");
                break;
            case 'g':
                System.out.printf("Зеленный");
                break;
            default:
                System.out.println("Такого цвета нету в базе");

        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int a = 1;
        if (a > 0)
            System.out.println("Hello 1");
        System.out.println("Hello 2");
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int x = 50;
        int y = 100;

        System.out.println(
                x > y ? "X= " + x + " больше Y= " + y :
                        x < y ? "y= " + y + " больше X= " + x : "Они равны");
    }
}

 */

// --------  03.11.2024

import java.sql.SQLOutput;

/*
public class Main {
    public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
        if (i%2==0){
            System.out.println(i + " Четное");
        }else{
            System.out.println(i + " Не четное");
        }
    }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; i++) {
            if (i%2==0) {
                i--;
                continue;
            }
            System.out.println(i);
        }
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
        int count = 10;

        for (int i = 0; i < count; i++) {
            if (count < 0) {
                count = i + i;
                i = i * 10;
            } else {
                i++;
                count++;
            }
            System.out.println(i);
        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("******");
        }
    }
}

 */
public class Main {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
