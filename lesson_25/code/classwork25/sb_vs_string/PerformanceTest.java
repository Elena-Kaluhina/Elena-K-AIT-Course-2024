package classwork25.sb_vs_string;

//сюжет теста: 100 тысяч раз сказать "Meow"
//String vs StringBuilder

public class PerformanceTest {

    //constants
    private static final int N_ITTERATION = 100_000;
    private static final String WORD = "Meow";

    public static void main(String[] args) {

        //String сколько за сколько миллисекунд распечатает слово мяу
        long t1 = System.currentTimeMillis(); //старт секундомера
        String str = "";
        for (int i = 0; i < N_ITTERATION; i++) {//запускаем цикл на 100 000 раз
            str = str + WORD;//создаёт новый объект со словом мяу, с новой строки
        }
        long t2 = System.currentTimeMillis(); //финиш секундомера
        System.out.println("Time = " + (t2 - t1));


        //StringBuilder смотрим за сколько миллисекунд распечатает слово мяу
        t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N_ITTERATION; i++) {//запускаем цикл на 100 000 раз
            sb = sb.append(WORD);//создаёт строку и в ней 100 000 раз слово мяу
        }
        t2 = System.currentTimeMillis();
        System.out.println("Time StringBuilder = " + (t2 - t1));

    }
}
