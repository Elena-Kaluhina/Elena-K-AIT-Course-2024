package homework27.videoGameLibrary.dao;

import homework27.videoGameLibrary.model.Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GameLibraryImpl implements GameLibrary {

    private List<Game> games;


    public GameLibraryImpl() {
        this.games = new ArrayList<>();
    }

    @Override
    public void addGame(Game game) {
        games.add(game);  // Добавляем новую игру
    }

    @Override
    public Game findGameById(String id) {
        return games.stream()
                .filter(game -> game.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Game> findGamesByGenre(String genre) {
        return games.stream()
                .filter(game -> game.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    @Override
    public List<Game> findGamesBelowPrice(double price) {
        List<Game> result = games.stream()
                .filter(game -> game.getPrice() < price)
                .collect(Collectors.toList());
        result.forEach(game -> System.out.println("Found game below price: " + game));
        return result;
    }

    @Override
    public List<Game> sortGamesByPrice() {
        List<Game> sortedGames = games.stream()
                .sorted(Comparator.comparingDouble(Game::getPrice))
                .collect(Collectors.toList());
        System.out.println("Games sorted by price:");
        sortedGames.forEach(System.out::println);
        return sortedGames;
    }


    @Override
    public void updateGame(Game updatedGame) {
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getId().equals(updatedGame.getId())) {
                games.set(i, updatedGame);
                System.out.println("Game updated: " + updatedGame);
                return;
            }
        }
        System.out.println("Game not found for update: " + updatedGame.getId());
    }

    @Override
    public void removeGame(String id) {
        games.removeIf(game -> game.getId().equals(id));
        System.out.println("Game removed with ID: " + id);
    }

    @Override
    public double calculateTotalValue() {
        double totalValue = games.stream().mapToDouble(Game::getPrice).sum();
        System.out.println("Total value of games: $" + totalValue);
        return totalValue;
    }

    @Override
    public void printAllGames() {
        System.out.println("All games in the library:");
        games.forEach(System.out::println);
    }

    @Override
    public List<Game> findGamesByPublisher(String publisherId) {
        List<Game> result = games.stream()
                .filter(game -> game.getPublisherId().equals(publisherId))  // Сравнение publisherId
                .collect(Collectors.toList());
        result.forEach(game -> System.out.println("Found game by publisher: " + game));
        return result;
    }

}

