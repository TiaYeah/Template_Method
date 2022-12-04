import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor_num = 1;
        house_material houseMaterial = house_material.Дерево;
        String roof_type = "Двускатная";
        boolean basement = false;

        System.out.println("Введите количество этажей");
        floor_num = scanner.nextInt();
        System.out.println("Выберите материал дома: \n1. Камень\n2. Дерево");
        int i = scanner.nextInt();
        if(i == 1){
            houseMaterial = house_material.Камень;
        } else if(i == 2){
            houseMaterial = house_material.Дерево;
        }
        System.out.println("Введите тип крыши \n1. Односкатная\n2. Двускатная\n3. Четырехскатая\n4. Пятискатная ");
        i = scanner.nextInt();
        if(i == 1){
            roof_type = "Односкатная";
        } else if(i == 2){
            roof_type = "Двускатная";
        } else if(i == 3){
            roof_type = "Четырехскатная";
        } else if(i == 4) {
            roof_type = "Пятискатная";
        }
        System.out.println("Выберите наличие подвала: \n1. Есть\n2. Нет");
        i = scanner.nextInt();
        if (i == 1) {
            basement = true;
        } else if (i == 2) {
            basement = false;
        }


        House house = null;

        if(floor_num == 2 && houseMaterial == house_material.Дерево && roof_type == "Односкатная" && !basement) {
            System.out.println("Тип дома - 1");
            house = new HouseType1();
        } else if (floor_num == 3 && houseMaterial == house_material.Камень && roof_type == "Четырехскатная" && basement) {
            System.out.println("Тип дома - 2");
            house = new HouseType2();
        } else if (floor_num == 2 && houseMaterial == house_material.Дерево && roof_type == "Двускатная" && basement) {
            System.out.println("Тип дома - 3");
            house = new HouseType3();
        } else {
            System.out.println("Тип дома - Стандартный");
            house = new Default();
        }


        house.proectHouse();
    }
}