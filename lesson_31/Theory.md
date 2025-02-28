Класс Arrays и его методы
Статический метод Arrays.copyOf, принимает в качестве аргумента массив, новый размер и возвращает массив нового размера, в который скопированы элементы исходного массива.

Статический метод Arrays.copyOfRange принимает в качестве аргумента массив, индексы from и to и возвращает массив, в который скопированы часть элементов исходного массива начиная с индекса from и заканчивая индексом to, не включая последний(!) элемент.

Статический метод System.arraycopy принимает пять аргументов:

исходный массив,
индекс начиная с какого элемента надо копировать элементы из исходного массива,
целевой массив,
индекс начиная с какого элемента надо копировать элементы в целевой массив,
количество элементов для копирования.
Статический метод Arrays.toString, принимает в качестве аргумента массив, и возвращает его стринговое представление.

Статический метод Arrays.sort позволяет сортировать массив. Метод sort перегружен. Он позволяет сортировать массивы примитивных данных, массивы объектов, если объекты в них из Comparable класса, и массивы любых объектов, если в качестве аргумента также передан Comparator для сравнения элементов массива.

Статический метод Arrays.binarySearch позволяет искать элемент в массиве, используя алгоритм бинарного поиска. При этом массив обязательно должен быть отсортирован. Arrays.binarySearch должен использовать тот же компаратор, при помощи которого массив был отсортирован. Бинарный поиск возвращает индекс искомого элемента в массиве. Если элемент не найден, то возвращается индекс ожидаемой позиции для этого элемента со знаком минус, уменьшенный на единицу (- expectedPosition - 1).

Внимание!!! Результаты бинарного поиска в неотсортированном массиве не подлежат интерпретации.

Для выборки элементов из массива, удовлетворяющих заданному условию, надо сначала подсчитать количество элементов массива, удовлетворяющих условию. Потом создать массив под это количество, и только потом его заполнить. Для реализации такой функциональности, мы создаем методы возвращающие массив.
Тестирование методов возвращающих массив, осуществляется при помощи assertArrayEquals.
Начиная с Java 8 в интерфейсах можно использовать дефолтные методы. Такой метод помечается ключевым словом default и имеет готовую реализацию. Дефолтные методы не обязательно переопределять в дочерних классах.
Полями интерфейса по умолчанию являются константы. Т. е. помеченные как public static final.
UML (Unified Modeling Language — унифицированный язык моделирования) — язык графического описания для объектного моделирования в области разработки программного обеспечения, для моделирования бизнес-процессов, системного проектирования и отображения организационных структур. UML является языком широкого профиля, это — открытый стандарт, использующий графические обозначения для создания абстрактной модели системы, называемой UML-моделью. UML был создан для определения, визуализации, проектирования и документирования, в основном, программных систем. UML не является языком программирования, но на основании UML-моделей возможна генерация кода.
Диаграмма классов (Class diagram) — статическая структурная диаграмма, описывающая структуру системы, демонстрирующая классы системы, их атрибуты, методы и зависимости между классами.
Начиная с Java 5 в языке появились Generics - параметризованные типы и методы. Задача "дженериков", сделать возможным писать универсальный, строго типизированный код, в котором решение о конкректном типе откладывается "на потом". Например, тип на котором "специализируется" объект определяется не в момент создания класса, а в момент создания объекта. Параметр (generic) указывается в угловых скобках - <T> (diamond operator).
Начиная с Java 8, появился интерфейс Predicate<T>. В этом интерфейсе есть единственный абстрактный метод: boolean test(T t); Объекты типа Predicate используются для организации выборки по условию (фильтрации).
В Java можно создавать объекты анонимных классов. Т. е. создавать объекты интефейсов, или абстрактных классов, при этом сразу, на месте, имплементируя абстрактные методы. Начиная с Java 8, для интерфейсов и абстрактных классов имеющих только один абстрактный метод, можно использовать упрощенный синтаксис лямбда выражений: (arguments) -> method body