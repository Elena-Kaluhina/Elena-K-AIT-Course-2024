package crosscurs;

public class DollarEuro {
    //перевод долларов в евро
    //количество съеденных калорий
    //расход топлива и стоимости на поездку

    public static void main(String[] args) {
        //перевод долларов в евро
        double money = 500; //dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro: " + euro);

        //количество съеденных калорий
        double weight = 200;//gramm
        double colorage = 50;//callorie on 100 gramm
        double energy = calculateCalorie(weight, colorage);
        System.out.println("Energy = " + energy);


    }//end of main

    //beginn of method
    private static double exchangeDollarsToEuro(double money) {
        double rate = 0.9;
        return money * rate;
    }//end of method

    //beginn of method
    private static double calculateCalorie(double weight, double colorage) {
        return weight * colorage / 100;

    }//end of method

}//end of class
