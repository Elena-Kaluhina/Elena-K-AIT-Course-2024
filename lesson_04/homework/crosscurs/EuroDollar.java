package crosscurs;
//Напишите методы для конвертации валюты:
//евро в доллары США
//евро в британские фунты
//евро в китайские юани и проверьте их работу, вызвав их в main.

public class EuroDollar {
    public static void main(String[] args) {
        //перевод евро в доллары
        double euro = 375;
        double dollars = exchangeEuroInDollars(euro);
        System.out.println("Dollars: " + dollars);

        //перевод евро в британские фунты
        double euro1 = 520;
        double funtsterlings = exchangeEuroToFuntsterlings(euro1);
        System.out.println("Funtsterlings: " + funtsterlings);

        //перевод евро в китайские юани
        double euro2 = 700;
        double yuani = exchangeEuroToYuani(euro2);
        System.out.println("Yuani: " + yuani);

    }//end of main

    //begin of the method
    private static double exchangeEuroInDollars(double euro){
        double rate = 1.1;
        return euro * rate;
    }//end of the method

    //begin of the method
    private static double exchangeEuroToFuntsterlings(double euro1){
        double rate = 0.84;
        return euro1 * rate;
    }//end of the method

    //begin of the method
    private static double exchangeEuroToYuani(double euro2){
        double rate = 7.86;
        return euro2 * rate;
    }//end of the method

}//end of class
