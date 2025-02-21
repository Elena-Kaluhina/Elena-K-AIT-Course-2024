План занятия №22 11.10.2024:
1. Что мы сделали на прошлом занятии:
   изучали TDD
   реализовали класс User, валидаторы
   email
2. Обсуждаем ДЗ:
   сколько "дырок" в валидаторе нашлось?
   тесты для методов поиска мин/макс в массивах
   Есть ли вопросы?
3. План на сегодняшнее занятие:
   класс User
   методы валидации e-mail и password
   Unit - тестирование на базе библиотеки JUnit
4. Практика:
   Задание 1: Создать класс User, поля:

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
length < 20
необходимо реализовать класса User, методы валидации email и password
проверить работу методов с помощью тестов
Задание 2.:

Создать класс Address, проверить:

город с большой буквы
индекс содержит 5 цифр
Задание 3.: Тесты для ArrayMethods

сортировка
поиск
и т.д.