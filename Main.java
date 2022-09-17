import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> floorList = new LinkedList<>();

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String input = scanner.next();
            int floorNumber = Integer.parseInt(input);
            if (floorNumber == 0) {
                System.out.println("Лифт проследовал по следующим этажам: ");
                while (!floorList.isEmpty()) {
                    System.out.print("этаж " + floorList.poll() + " - > ");
                }
                System.out.println(" этаж 0");
                break;
            } else if (floorNumber > 0 && floorNumber <= 25) {
                floorList.offer(floorNumber);
            } else {
                System.out.println("Такого этажа нет в доме");
            }
        }
    }
}