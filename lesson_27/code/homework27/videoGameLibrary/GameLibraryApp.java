package homework27.videoGameLibrary;

import homework27.videoGameLibrary.dao.GameLibrary;
import homework27.videoGameLibrary.dao.GameLibraryImpl;
import homework27.videoGameLibrary.model.Game;

public class GameLibraryApp {

    public static void main(String[] args) {

        //создаем экземпляр библиотеки игр
        GameLibrary gameLibrary = new GameLibraryImpl();

        //добавление игр в библиотеку (Create)
        Game game1 = new Game("001", "Cyberpunk 2077", "RPG", 59.99, "publisher001");
        Game game2 = new Game("002", "FIFA 21", "Sports", 49.99, "publisher002");
        gameLibrary.addGame(game1);
        gameLibrary.addGame(game2);

        //печать всех игр в библиотеке (Read)
        System.out.println("All games in the library:");
        gameLibrary.printAllGames();

        //поиск игр по жанру (Read)
        System.out.println("\nGames in genre RPG:");
        gameLibrary.findGamesByGenre("RPG").forEach(System.out::println);

        //поиск игр дешевле заданной цены (Read)
        System.out.println("\nGames below $50:");
        gameLibrary.findGamesBelowPrice(50).forEach(System.out::println);

        //сортировка игр по цене (Read)
        System.out.println("\nGames sorted by price:");
        gameLibrary.sortGamesByPrice().forEach(System.out::println);

        //подсчёт общей стоимости игр (Read)
        System.out.println("\nTotal value of all games:");
        gameLibrary.calculateTotalValue();

        //обновление игры (Update)
        System.out.println("\nUpdating the price of Cyberpunk 2077...");
        Game updatedGame = new Game("001", "Cyberpunk 2077", "RPG", 29.99, "publisher001");
        gameLibrary.updateGame(updatedGame);
        gameLibrary.printAllGames();

        //удаление игры (Delete)
        System.out.println("\nRemoving FIFA 21...");
        gameLibrary.removeGame("002");
        gameLibrary.printAllGames();
    }
}

