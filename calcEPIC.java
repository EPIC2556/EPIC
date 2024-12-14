import java.util.Scanner;
class calcEPIC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите выражение через пробел:");
            String input = scanner.nextLine().trim();
            try {System.out.println("ответ "+calc(input));} //try делай если нет иключений через  метод calc
            catch (IllegalArgumentException e) {            //оператор исключ
                System.out.println("Ошибка: " + e.getMessage());
                System.exit(0);
            }
        }
    }
    private static String calc(String input) {
        try {
            String[] parts = input.split("\\s+"); // в массив пробелы как раздел
            if (parts.length!= 3) {                     //длинна массива
                throw new IllegalArgumentException("Незабывай пробелы!");
            }

            int num1 = Integer.parseInt(parts[0]);
            char operation = parts[1].charAt(0);
            int num2 = Integer.parseInt(parts[2]);

            if (!isValidNumber(num1) || !isValidNumber(num2)) {
                throw new IllegalArgumentException("Числа должны быть от 1 до 10");
            }

            switch (operation) {                    //оператор как if-else
                case '+':
                    return String.valueOf(num1+num2);
                case '-':
                    return String.valueOf(num1-num2);
                case '*':
                    return String.valueOf(num1*num2);
                case '/':
                    return String.valueOf(num1/num2);
                default:
                    throw new IllegalArgumentException("Только /,*,-,+");
            }
        } catch (NumberFormatException e) {               //исключ
            throw new IllegalArgumentException("Неверный формат чисел");
        }
    }
    private static boolean isValidNumber(int number) {
        return number >= 1 && number <= 10;
    }
}