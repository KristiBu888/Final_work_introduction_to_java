
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации 
и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */
import java.util.*;

public class Main {

    public static Integer FilterChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println(
                "1-> модель\n2-> цена\n3-> цвет\n4-> год выпуска\n5-> размер экрана(дюйм)\n6-> тип жёсткого диска\n7-> размер жёсткого диска\n8-> объём оперативной памяти\n9-> тип процессора\n10-> тип видеокарты\n11-> время автономной работы\n12-> посмотреть все модели");
        System.out.print("Ваш выбор: ");
        return scanner.nextInt();
    }

    public static String FirstUpperCase(String word) {
        if (word == null || word.isEmpty())
            return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void FindByFilter(Set<LaptopCharacteristics> products, String filter, String input) {
        Integer count = 1;
        Map<String, LaptopCharacteristics> result = new LinkedHashMap<>();
        for (LaptopCharacteristics comp : products) {
            if (comp.GetInfo(filter).contains(input)) {
                result.put(String.format("\n\nНоутбук № %d", count), comp);
                count++;
            }
        }
        if (result.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            System.out.println("Вот что удалось найти:\n" + result);
        }
    }

    public static void main(String[] args) {

        LaptopCharacteristics comp1 = new LaptopCharacteristics("1", "Apple MacBook Air", "95600",
                "серебристый", "2023", "15.6", "8", "SSD", "512", "Intel Core i3-N305", "Intel UHD Graphics", "10");
        LaptopCharacteristics comp2 = new LaptopCharacteristics("2", "Acer Aspire 3", "47500",
                "золотистый", "2020", "13.3", "8", "SSD", "256", "Apple M1", "Apple M1 7-core", "18");
        LaptopCharacteristics comp3 = new LaptopCharacteristics("3", "DEXP Aquilon", "18000",
                "серый", "2023", "14.1", "8", "SSD", "256", "DDR4", "Intel UHD Graphics 600", "10");

        LaptopCharacteristics comp4 = new LaptopCharacteristics("4", "ASUS Laptop 15 D543MA-DM1368", "28000",
                "чёрный", "2021", "15.6", "4", "HDD", "1000", "Intel Celeron N4020", "Intel UHD Graphics", "6");
        LaptopCharacteristics comp5 = new LaptopCharacteristics("5", "HUAWEI MateBook D 14 NbD-WDI9", "45000",
                "белый", "2021", "14", "8", "SSD", "256", "Intel Core i3-1115G4", "Intel UHD Graphics", "10");

        HashSet<LaptopCharacteristics> products = new HashSet<LaptopCharacteristics>(
                Arrays.asList(comp1, comp2, comp3, comp4, comp5));

        System.out.println("Мы рады приветсвовать вас, наша программа поможет найти вам нужный ноутбук.");

        Map<Integer, String> filters = new HashMap<>();
        filters.put(1, "model");
        filters.put(2, "price");
        filters.put(3, "color");
        filters.put(4, "year");
        filters.put(5, "screenSize");
        filters.put(6, "hardDriveType");
        filters.put(7, "hardDriveSize");
        filters.put(8, "volumeOfOperationalMemory");
        filters.put(9, "processorType");
        filters.put(10, "videoCardType");
        filters.put(11, "operatingTime");
        filters.put(12, "all products");
        Integer choice = FilterChoice();

        Scanner scanner = new Scanner(System.in);

        if (filters.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.println("Введите наименование модели");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(1), input);
                    break;
                }
                case 2: {
                    System.out.println("Введите цену ноутбука");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(2), input);
                    break;
                }
                case 3: {
                    System.out.println("Введите цвет ноутбука");
                    System.out.print("-> ");
                    String input = scanner.next();
                    FindByFilter(products, filters.get(3), input);
                    break;
                }
                case 4: {
                    System.out.println("Введите год выпуска ноутбука");
                    System.out.print("-> ");
                    String input = scanner.next();
                    FindByFilter(products, filters.get(4), input);
                    break;
                }
                case 5: {
                    System.out.println("Введите размер экрана(в дюймах)");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(5), input);
                    break;
                }
                case 6: {
                    System.out.println("Введите тип жёсткого диска");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(6), input);
                    break;
                }
                case 7: {
                    System.out.println("Введите размер жёсткого диска");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(7), input);
                    break;
                }
                case 8: {
                    System.out.println("Введите объём оперативной памяти");
                    System.out.print("-> ");
                    String input = scanner.next();
                    FindByFilter(products, filters.get(8), input);
                    break;
                }
                case 9: {
                    System.out.println("Введите тип процессора");
                    System.out.print("-> ");
                    String input = scanner.next();
                    FindByFilter(products, filters.get(9), input);
                    break;
                }
                case 10: {
                    System.out.println("Введите тип видеокарты");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(10), input);
                    break;
                }
                case 11: {
                    System.out.println("Введите время автономной работы");
                    System.out.print("-> ");
                    String input = FirstUpperCase(scanner.next());
                    FindByFilter(products, filters.get(11), input);
                    break;
                }
                case 12: {
                    Integer count = 1;
                    System.out.println("\nНаш ассортимент:");
                    for (LaptopCharacteristics comp : products) {
                        System.out.println("\nНоутбук №" + count + "\n" + comp);
                        count++;
                    }
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();
    }
}