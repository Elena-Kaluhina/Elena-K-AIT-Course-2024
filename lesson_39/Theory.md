JCF
Set, HashSet
Из интерфейсов расширяющих интерфейс Collection, мы рассмотрели интерфейс List, на котором реализованы ArrayList и LinkedList.

Теперь мы рассмотрим интерфейс Set и его реализации HashSet и TreeSet. Set в переводе с английского - это "множество", множество каких-то объектов в контексте Java. Особенность этого множества в том, что оно может хранить только уникальные значения, элементы этого множества.

Set - это интерфейс с методами для работы со множеством:

добавить элемент во множество,
удалить элемент из множества,
проверить наличие элемента во множестве.
Интерфейс Set расширяет интерфейс Collection, и определяет коллекции, которые не содержат двух одинаковых элементов.

Примеры полезных и нужных HashSet:

коллекции e-mail в рамках домена и далее (выше по иерархии)
номера телефонов
аккаунты в банковских системах (IBAN)
идентификационные номера
налоговые номера
номер паспорта
автомобильные номера
IP-адрес
Bar/Штрих-коды
серийный номер изделия
IMEI у SIM - карты
номера на денежных купюрах
индексы городов
номера сертификатов ISO
ISBN
IMDB
...
=============================================================

Итак, что такое HashSet? Ответ: это класс, который реализует(implements) интерфейсы Set, Collection, Iterable.
Индексов в этой структуре нет, элемент коллекции сохраняется и находится по алгоритму с участием рассчета hashCode - см. ниже.

Давайте приведем примеры полезных Set из жизни:

буквенный алфавит
словарь языка
индексы для почтовых адресов
VIN автомобилей
серийный номер изделия
штрих-код
ссылки в Интернете
из финансовой сферы: счет клиента, SWIFT-код, ...
номера купюр
Tax ID
e-mail в пределах регистратора
IP - адрес
Синтаксис для инициализации HashSet: Set<Type> myHashSet = new HashSet<>();

Как вычисляется hashCode ?
Метод hashCode() – возвращает хэш-код для данной строки (набор символов). Хэш-значение пустой строки равно нулю.

"5 789" - это число или строка? 1963 => 1 + 9 + 6 + 3 = 19 = > 1 + 9 = 10 => 1 + 0 = 1

hashCode(строка) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1], ^ - это возведение в степень s[0] - это 1-й элемент строки (символ), s[1] - 2-й элемент и т.д. Простое число 31 подобрано опытным путем.

Алгоритм помещения элемента в HashSet:
Вычисление хеш-кода: Когда вы добавляете элемент в HashSet, Java сначала вычисляет его хеш-код с помощью метода hashCode() элемента. Этот хеш-код — это числовое значение, зависящее от состояния объекта, который определяет, куда в HashSet будет помещён элемент.
Определение "индекса корзины" по хеш-коду: HashSet использует хеш-код для вычисления индекса корзины, в которой элемент будет храниться. Например, если у HashSet начальное значение inicialCapacity = 16 корзин, то индекс будет получен на основе хеш-кода с учётом имеющегося количества корзин. Это делают с помощью операции побитового сдвига ИЛИ вычисляется остаток от деления значения вычисленного хеш-код на 16. "Корзиной" на самом деле является LinkedList(), а точнее их массив LinkedList[initialCapacity] ().
Сохранение элемента в "корзине" (связном листе): После определения индекса корзины элемент пытаются сохранить. Если по такому индексу еще ничего нет, то создают новый связный список и элемент помещают в него на первое место. Если "корзина" с таким хеш-кодом уже есть, то элемент будет размещен в связном списке по индексу этой корзины. Элемент попадает в связный список только при условии, что такого элемента в списке еше нет, иначе - возвращается false и дубликат не добавляется!
Поиск элемента: Когда вы ищете элемент в HashSet, Java снова вычисляет его хеш-код и определяет индекс "корзины" - связного списка. Затем Java просматривает все элементы в этой связном списке и находит нужный элемент с использованием метода equals().
Почему для HashSet выбран связный список, а не простой список?
Для HashSet выбран именно связный список, а не простой массивный список (например, ArrayList), потому что связный список обеспечивает более эффективное управление коллизиями и обладает преимуществами при выполнении операций удаления элементов. Удаление элемента в связном списке проще и быстрее:

Если требуется удалить элемент, HashSet просто находит его в связном списке и удаляет, перенаправляя указатели на следующий элемент.
В массивном списке (например, ArrayList) удаление элемента требует сдвига всех последующих элементов, что увеличивает время операции. Связный список более гибок в плане управления памятью. При добавлении нового элемента не требуется увеличивать массив, как это происходит с ArrayList, когда он переполняется. Это упрощает управление памятью и улучшает производительность в условиях частых коллизий. Когда HashSet увеличивает свою ёмкость и перераспределяет элементы по новым корзинам (рехеширование), наличие связных списков для элементов с коллизиями делает этот процесс более гибким и простым.
При рехешировании нужно лишь перебрать связанный список и распределить элементы по новым корзинам.
Для массивного списка это потребовало бы значительных операций по копированию, перемещению и перераспределению.
HashSet (summary)
Принципиальная невозможность повторений элементов множества (коллекции);
Методы HashSet:
Добавить элемент(ы): add(), addAll()
Удалить элемент(ы): remove(), removeAll()
Очистить множество (удалить все элементы): clear()
Проверить, есть ли элемент(ы): contains(), containsAll()
Узнать размер: size()
В HashSet нет индексов, и его нельзя "отсортировать"!