package homework25.regex_validator;

public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str){
        // Проверяем день от 01 до 31, месяц от 01 до 12, и год из 4 цифр
        return str.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}");
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str){
        //Проверяем год из 4 цифр, месяц от 01 до 12, и день от 01 до 31
       return str.matches("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str){
        // Проверяем номер телефона в формате +XX(XX)XXXX-XXXX
        return str.matches("\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}");
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        // Проверяем, что строка представляет число от 0 до 255
        return str.matches("(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)");
    }

}
//Объяснение каждого метода:
//checkCreditCardNumber:
//Регулярное выражение \\d{8,16} проверяет, состоит ли строка только из цифр длиной от 8 до 16 символов.
//checkDateFormatEU:
//Регулярное выражение (0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}
//проверяет формат даты в виде dd.MM.yyyy, где день может быть от 01 до 31, месяц от 01 до 12, а год — 4 цифры.
//checkDateFormatUS:
//Регулярное выражение \\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])
//проверяет формат даты в виде yyyy-MM-dd, где год состоит из 4 цифр, месяц от 01 до 12, день от 01 до 31.
//checkPhoneNumber:
//Регулярное выражение \\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}
//проверяет формат телефона: +XX(XX)XXXX-XXXX, где X — цифры.
//checkLessEquals255:
//Регулярное выражение (25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)
//проверяет, что число в строке находится в диапазоне от 0 до 255.