План занятия №21 09.10.2024:
1. Что мы сделали на прошлом занятии:
   изучали классы-обертки (wrapper classes)
   реализовали приложение с аргументами командной строки
2. Обсуждаем ДЗ:
   сумма чисел из введенной строки;
   "обработка" введенного предложения;
   минимальные/максимальные числовые значения примитивных типов, приложение с аргументами командной строки.
   Есть ли вопросы?
3. План на сегодняшнее занятие:
   класс User
   методы валидации e-mail и password
   Unit - тестирование на базе библиотеки JUnit
4. Практика:
   Задача о сумме чисел из строки с применением TDD.

Валидация email и password

Создать класс User, поля:

email
password разработать методы класса, которые валидируют правильность
email
password в конструкторе создаваемого объекта класса User.
требования к email:

@ exists and only one
dot after @ User
after last dot 2 or more symbols
alphabetic, digits, '_', '-', '.', '@'
требования к password:

length >= 8
min one digit
min one symbol in upperCase
min one symbol in lowerCase
min one special symbol (!%@$&)
Практика:
реализация класса User, методы валидации email и password
проверка работы методов с помощью тестов