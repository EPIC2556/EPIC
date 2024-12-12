import java.util.Scanner;

public class calculatorEPIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение без пробелов с дейтвием /,*,-,+");
        String str = sc.next();
        int otvet=0;
        int x;
        int y;
        String [] number;

        if (str.indexOf('+')>0){
            number=str.split("[+]");
            x = Integer.parseInt(number[0]);
            y = Integer.parseInt(number[1]);
            if (x>10||y>10||x<1||y<1){System.out.println("Неверные данные! Вводите от 1 до 10");
            };
            otvet = x+y;
            System.out.println("Ответ "+otvet);}
        else if (str.indexOf('-')>0){
            number=str.split("[-]");
            x = Integer.parseInt(number[0]);
            y = Integer.parseInt(number[1]);
            if (x>10||y>10||x<1||y<1){System.out.println("Неверные данные! Вводите от 1 до 10");
            };
            otvet = x-y;
            System.out.println("Ответ "+otvet);}
        else if (str.indexOf('*')>0){
            number=str.split("[*]");
            x = Integer.parseInt(number[0]);
            y = Integer.parseInt(number[1]);
            if (x>10||y>10||x<1||y<1){System.out.println("Неверные данные! Вводите от 1 до 10");
            };
            otvet = x*y;
            System.out.println("Ответ "+otvet);}
        else if (str.indexOf('/')>0){
            number=str.split("[/]");
            x = Integer.parseInt(number[0]);
            y = Integer.parseInt(number[1]);
            if (x>10||y>10||x<1||y<1){System.out.println("Неверные данные! Вводите от 1 до 10");
            };
            otvet = x/y;
            System.out.println("Ответ "+otvet);}
        else System.out.println("Только /,*,-,+ ");



    }
}