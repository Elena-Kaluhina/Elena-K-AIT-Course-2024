package classwork25.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        //к стринг билдер добавляем "_" и число 21, они добавляются только в конец
        sb.append("_").append("21");
        System.out.println(sb);

        //разворачиваем строку задом на перёд
        sb.reverse();
        System.out.println(sb);

        //вставляем в любое место
        StringBuilder sbNew = new StringBuilder("Hello");
        sbNew.insert(5,"!");//если мы поставим вместо 5, 8, нам выдаст ошибку
        System.out.println(sbNew);
        //добавляем метод boolean
        sbNew.append(true);
        System.out.println(sbNew);

    }
}
