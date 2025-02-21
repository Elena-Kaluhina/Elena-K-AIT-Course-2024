String, immutable
В Java класс String является неизменяемым (immutable), что означает, что после создания объекта типа String его состояние (то есть значение) не может быть изменено. Любые операции, которые кажутся изменяющими строку, на самом деле создают новую строку, не изменяя оригинальную.

В Java строки хранятся в пуле строк (String pool), что позволяет экономить память, повторно используя уже созданные строки. Именно неизменяемость строк (immutable) делает возможным такой подход.
Неизменяемость объектов класса String, может повлиять на производительность нашей аппликации, если в ней требуется произвести большое количество изменений строковой переменной. Для таких случаев в Java создан класс StringBuilder. Объекты этого класса обладают такой же функциональность, как и у объектов класса String, но только объекты класса StringBuilder являются изменяемыми (mutable).
Regular Expression
Язык регулярных выражений относится к категории предметно-ориентированных языков. Такие языки предназначены для решения задач из какой-то определенной предметной области. Язык регулярных выражений предназначен для обработки текстовых данных.

Регулярные выражения поддерживаются большинством языков программирования, в том числе и Java. Подробно о языке регулярных выражений в Java, смотрите в презентации и в Java Tutorials.

Java Tutorials. Regular Expressions

Применяется для следующих классов Java:
String
Pattern
Matcher
Используется для:
поиска
валидации(проверки)
извлечения
модификации
Синтаксис:
. - (Dot) Any single character
Set of individual characters [abc] or range [a-c]
[^] - Negation of set or range [^abc] or [^a-c]
\d - any decimal digit [0-9]
\D - any symbol except digit [^0-9]
\s - any whitespace symbol
\S - any non-whitespace symbol
\w - any alphanumeric symbol [a-zA-Z0-9_]
\W - any non-alphanumeric symbol [^a-zA-Z0-9_]
Количество повторений
How many times the last specified character can be repeated

+ - one or more
    Copy
* - 0 or more
    Copy
    ? - 0 or 1
    Copy
    {m} - exactly m times
    Copy
    {n,m} - no less than n but no more than m
    Copy
    {n,} - no less than n
    Copy
    Дополнительные символы
    | - X|Y either X or Y
    Copy
    () -grouping matching subsequences are
    Copy
    remembered and numbered from left to right
    Copy
    beginning from 1. Example, “(KU)\1” matches KUKU
    Copy
    ^ - beginning of text
    Copy
    $ - end of text
    Copy
    RegEx и класс String
    .matches (regex) - returns true if a string matches a given regex
    .split(regex) - returns array of tokens separated by delimiters matching regex
    .replaceAll(regex, substring) replace all the string’s parts matching regex with the given substring
    .replaceFirst(regex, substring) replace first encountered the string’s part matching regex with the given substring