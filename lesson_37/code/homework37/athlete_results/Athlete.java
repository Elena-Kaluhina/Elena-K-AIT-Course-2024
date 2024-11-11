package homework37.athlete_results;

public class Athlete {

    private String lastName;    // Фамилия спортсмена
    private String firstName;   // Имя спортсмена
    private int regNumber;      // Регистрационный номер
    private String club;        // Клуб, к которому принадлежит спортсмен
    private double result;      // Результат в секундах

    // Конструктор для инициализации полей класса
    public Athlete(String lastName, String firstName, int regNumber, String club, double result) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.regNumber = regNumber;
        this.club = club;
        this.result = result;
    }

    // Геттер для фамилии
    public String getLastName() {
        return lastName;
    }

    // Геттер для имени
    public String getFirstName() {
        return firstName;
    }

    // Геттер для регистрационного номера
    public int getRegNumber() {
        return regNumber;
    }

    // Геттер для клуба
    public String getClub() {
        return club;
    }

    // Геттер для результата
    public double getResult() {
        return result;
    }

    // Метод для представления объекта в виде строки
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Athlete{")
                .append("lastName='").append(lastName).append('\'')
                .append(", firstName='").append(firstName).append('\'')
                .append(", regNumber=").append(regNumber)
                .append(", club='").append(club).append('\'')
                .append(", result=").append(result)
                .append(" seconds}");
        return sb.toString();
    }
}
