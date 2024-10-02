package homework09;

import java.util.Scanner;

/*
Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
упаковки в желтый бак
пищевые отходы в коричневый бак
бумага в зеленый бак
прочие отходы в черный бак.
Используйте цифры для кодирования вариантов действий.
 */
public class TrashBot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what you want to throw away.");
        System.out.println("1 - packages.");
        System.out.println("2 - food waste.");
        System.out.println("3 - paper.");
        System.out.println("4 - other waste.");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Dispose of packages in the yellow bin.");
                break;

            case 2:
                System.out.println("Dispose of food waste in the brown bin.");
                break;

            case  3:
                System.out.println("Dispose of paper in the green bin.");
                break;

            case 4:
                System.out.println("Other waste is disposed of in the black bin.");
                break;

            default:
                System.out.println("Wrong input! Try again.");
                break;
        }
    }
}
