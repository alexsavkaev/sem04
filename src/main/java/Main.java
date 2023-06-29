
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String data = "";
        while (!Objects.equals(data, "q")) {
            System.out.println("Введите ФИО, Возраст, Пол: ");
            System.out.println("q для выхода, s для сортировки");
            data = in.nextLine();
            if (!Objects.equals(data, "q") && (!Objects.equals(data, "s"))) {
                String[] tmp = data.split(",");
                String[] fio = tmp[0].split(" ");
                String result = fio[2] + " " + fio[0].toUpperCase().charAt(0)
                        + "." + fio[1].toUpperCase().charAt(0)+"." + tmp[1] + " " + tmp[2];
                people.add(result);
            }
            if(Objects.equals(data, "s")) {
                System.out.println("Сортировка...");
                people.sort(Comparator.comparingInt(o -> Integer.parseInt(o.split(" ")[2])));
            }
            }

        for (String person : people) {
            System.out.println(person);
            }
        }
    }



