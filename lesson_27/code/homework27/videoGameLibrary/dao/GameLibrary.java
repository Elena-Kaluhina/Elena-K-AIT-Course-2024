package homework27.videoGameLibrary.dao;

import homework27.videoGameLibrary.model.Game;

import java.util.List;

public interface GameLibrary {

    void addGame(Game game);  //добавить новую игру

    Game findGameById(String id);  //найти игру по идентификатору

    List<Game> findGamesByGenre(String genre);  //найти игры по жанру

    List<Game> findGamesBelowPrice(double price);  //найти игры дешевле указанной цены

    List<Game> sortGamesByPrice();  //сортировать игры по цене

    List<Game> findGamesByPublisher(String publisherId);  //найти игры по издателю

    void updateGame(Game game);  //обновить информацию об игре

    void removeGame(String id);  //удалить игру

    double calculateTotalValue();  //рассчитать общую стоимость игр

    void printAllGames();  //печать всех игр
}

