import java.util.*;

public class Domashka_of_String {
    public final static List<String> MAN_NAME_LIST = List.of(new String[]{"Иван", "Евгений", "Алексей", "Игорь", "Заяка", "Бука", "Федор", "Максим", "Ануфрий", "Боб"});
    public final static List<String> MAN_FIRSTNAME_LIST = List.of(new String[]{"Иванов", "Евгеньев", "Алексеев", "Игоркун", "Заякин", "Букакин", "Федоров", "Максимов", "Сахарович", "Бобкин"});
    public final static List<String> MAN_PATRONYMIC_LIST = List.of(new String[]{"Иванович", "Евгеньевич", "Алексеевич", "Игоревич", "Заякович", "Букович", "Федорович",
            "Максимович", "Ануфриевич", "Бобович"});
    public final static List<Integer> MAN_SALERY_LIST = List.of(new Integer[]{15000, 17000, 25000, 35000, 55000, 10000, 100000, 85000, 99900, 1000000});

    // метод создания Резидента
    public static Resident generateResident() {
        Random ram = new Random();
        Resident resident = new Resident();
        resident.setName(MAN_NAME_LIST.get(ram.nextInt(MAN_NAME_LIST.size())));
        resident.setFirstName(MAN_FIRSTNAME_LIST.get(ram.nextInt(MAN_FIRSTNAME_LIST.size())));
        resident.setPatronymic(MAN_PATRONYMIC_LIST.get(ram.nextInt(MAN_PATRONYMIC_LIST.size())));
        resident.setmSalary(MAN_SALERY_LIST.get(ram.nextInt(MAN_SALERY_LIST.size())));
        return resident;
    }
    // метод поиска Salery по firstName


    public static void main(String[] args) {

        List<Resident> residents = new ArrayList<>();
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        residents.add(generateResident());
        for (Resident r : residents) {
            System.out.println(r);

        }
        List<String> firstResident = new ArrayList<>();



    }

}
