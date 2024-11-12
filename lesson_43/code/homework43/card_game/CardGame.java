package homework43.card_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {

    public static void main(String[] args) {

        List<String> deck = initializeDeck(); // Создаем и инициализируем колоду
        Collections.shuffle(deck); // Перемешиваем колоду

        // Раздаем карты игрокам
        List<String> player1 = deck.subList(0, 10); // Первые 10 карт - игроку 1
        List<String> player2 = deck.subList(10, 20); // Следующие 10 карт - игроку 2
        List<String> player3 = deck.subList(20, 30); // Следующие 10 карт - игроку 3
        List<String> prikup = deck.subList(30, 32); // Оставшиеся 2 карты для прикупа

        // Вывод карт для каждого игрока и прикупа
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);
        System.out.println("Player 3: " + player3);
        System.out.println("Prikup: " + prikup);
    }

    // Метод для инициализации колоды из 32 карт (без шестерок)
    private static List<String> initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Масти
        String[] ranks = {"7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; // Достоинства без 6-ок
        List<String> deck = new ArrayList<>();

        for (String suit : suits) { // Для каждой масти
            for (String rank : ranks) { // Для каждого достоинства
                deck.add(rank + " of " + suit); // Добавляем карту в колоду
            }
        }
        return deck;
    }
}
