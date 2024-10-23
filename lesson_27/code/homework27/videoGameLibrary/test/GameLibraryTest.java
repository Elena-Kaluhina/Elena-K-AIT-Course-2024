package homework27.videoGameLibrary.test;

import homework27.videoGameLibrary.dao.GameLibrary;
import homework27.videoGameLibrary.dao.GameLibraryImpl;
import homework27.videoGameLibrary.model.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameLibraryTest {

    private GameLibrary gameLibrary;

    @BeforeEach
    public void setUp() {
        gameLibrary = new GameLibraryImpl();  // инициализация библиотеки перед каждым тестом
    }

    //тест на добавление игры и ее поиск по идентификатору
    @Test
    public void testAddGame() {
        Game game = new Game("001", "Cyberpunk 2077", "RPG", 59.99, "publisher 001");
        gameLibrary.addGame(game);
        assertEquals(game, gameLibrary.findGameById("001"));
        System.out.println("Added and found game: " + game);
    }

    // тест на поиск игр по жанру
    @Test
    public void testFindGamesByGenre() {
        Game game1 = new Game("001", "The Witcher 3", "RPG", 39.99, "publisher001");
        Game game2 = new Game("002", "FIFA 21", "Sports", 49.99, "publisher002");
        gameLibrary.addGame(game1);
        gameLibrary.addGame(game2);

        List<Game> rpgGames = gameLibrary.findGamesByGenre("RPG");
        assertEquals(1, rpgGames.size());
        System.out.println("Found RPG games:");
        rpgGames.forEach(System.out::println);
    }

    // тест на поиск игр дешевле определённой цены
    @Test
    public void testFindGamesBelowPrice() {
        Game game1 = new Game("001", "The Witcher 3", "RPG", 39.99, "publisher001");
        Game game2 = new Game("002", "FIFA 21", "Sports", 49.99, "publisher002");
        gameLibrary.addGame(game1);
        gameLibrary.addGame(game2);

        List<Game> cheapGames = gameLibrary.findGamesBelowPrice(45.00);
        assertEquals(1, cheapGames.size());
        System.out.println("Games below $45:");
        cheapGames.forEach(System.out::println);
    }

    // тест на сортировку игр по цене
    @Test
    public void testSortGamesByPrice() {
        Game game1 = new Game("001", "The Witcher 3", "RPG", 39.99, "publisher001");
        Game game2 = new Game("002", "FIFA 21", "Sports", 49.99, "publisher002");
        gameLibrary.addGame(game1);
        gameLibrary.addGame(game2);

        List<Game> sortedGames = gameLibrary.sortGamesByPrice();
        assertEquals(2, sortedGames.size());
        System.out.println("Games sorted by price:");
        sortedGames.forEach(System.out::println);
    }

    // тест на поиск игр по издателю
    @Test
    public void testFindGamesByPublisher() {
        Game game1 = new Game("001", "The Witcher 3", "RPG", 39.99, "publisher001");
        Game game2 = new Game("002", "FIFA 21", "Sports", 49.99, "publisher002");
        gameLibrary.addGame(game1);
        gameLibrary.addGame(game2);

        List<Game> gamesByPublisher = gameLibrary.findGamesByPublisher("publisher001");
        assertEquals(1, gamesByPublisher.size());
        System.out.println("Games by publisher 'publisher001':");
        gamesByPublisher.forEach(System.out::println);
        //используя System.out::println, мы говорим, что каждый элемент из списка gamesByPublisher
        // будет передан в метод println(), который выведет информацию об этом элементе на консоль.
    }

    // тест на подсчёт общей стоимости игр
    @Test
    public void testCalculateTotalValue() {
        Game game1 = new Game("001", "The Witcher 3", "RPG", 39.99, "publisher001");
        Game game2 = new Game("002", "FIFA 21", "Sports", 49.99, "publisher002");
        gameLibrary.addGame(game1);
        gameLibrary.addGame(game2);

        double totalValue = gameLibrary.calculateTotalValue();
        assertEquals(89.98, totalValue);
        System.out.println("Total value of games: $" + totalValue);
    }
}

