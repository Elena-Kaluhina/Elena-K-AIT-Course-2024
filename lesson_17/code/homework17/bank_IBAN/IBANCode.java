package homework17.bank_IBAN;
/*
Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет
строго регламентированную длину (в Германии - 22 символа). Создать класс
IbanCode, в котором определить необходимые поля и реализовать методы:

lengthCode(String code), который возвращает количество символов в счете
controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
isValid(String code), который проверяет штрих-код на правильное количество символов
 */

public class IBANCode {

    //fields
    private String iban;

    //constructor
    public IBANCode(String iban) {
        this.iban = iban;
    }

    //method length code
    public int lengthCode(){
        return iban.length();
    }

    //method ASCII
    public int controlCode(){
        if (iban.length() < 2){
            throw new IllegalArgumentException("IBAN is too short!");
        }
        char firstChar = iban.charAt(0);
        char secondChar = iban.charAt(1);
        return (int) firstChar + (int) secondChar; //sum of ASCII code
    }

    //метод для проверки валидации IBAN по длине
    public boolean isValid(){
        return iban.length() == 22;
    }

    //метод для отображения IBAN и его проверки
    public void display(){
        System.out.println("IBAN: " + iban);
        System.out.println("Length: " + lengthCode());
        System.out.println("Control code (sum of ASCII values): " + controlCode());
        System.out.println("Is valid: " + (isValid() ? "Yes" : "No"));
    }
}
