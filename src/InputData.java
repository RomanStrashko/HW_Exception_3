import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите Фамилию, Имя, Отчество, номер телефона в строку через пробел, где ФИО - строки, " +
                    "а номер телефона целое число: ");
            String string = scanner.nextLine();
            String[] arrayData = string.split(" ");
            if (arrayData.length == 4) {
                return arrayData;
            } else if (arrayData.length < 4){
                System.out.println("Вы ввели неполные данные, попробуйте снова!");
            } else System.out.println("Ввели не коректные данные, попробуйте снова!");
        }

    }
}
