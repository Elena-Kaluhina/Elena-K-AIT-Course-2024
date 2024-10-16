package homework17.bank_IBAN;

public class IbanCodeAPPL {
    public static void main(String[] args) {

        //создаём экземпляр класса
        IBANCode iban1 = new IBANCode("DE12345678909876543210");

        //вызов метода
        iban1.display();

        //проверяем IBAN-коды
        IBANCode iban2 = new IBANCode("FR123456789012345678901234567890");
        iban2.display();

    }
}
