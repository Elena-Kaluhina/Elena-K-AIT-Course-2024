 О чем говорит O(log(n))?
 Запись O(log(n)) используется в анализе сложности алгоритмов и означает, 
 что время выполнения алгоритма увеличивается логарифмически в зависимости 
 от количества элементов n.

 Логарифм здесь обычно по основанию 2, то есть log₂(n), хотя иногда можно 
 встретить и другие основания. В случае алгоритмов сложности O(log(n)), 
 это означает, что с каждым шагом мы уменьшаем количество элементов для поиска 
 в 2 раза.

 Разбор бинарного поиска
 Для примера рассмотрим бинарный поиск — классический алгоритм, работающий за O(log(n)).

 Как работает бинарный поиск?

 Предположим, у нас есть отсортированный список:

 [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

 И мы ищем число 13. Вот как выполняется алгоритм:

 Шаг 1:
 
 Проверяем средний элемент. Середина списка — это индекс n/2.
 Список [2, 3, 5, 7, 11, 13, 17, 19, 23, 29], средний элемент — 11.
 Поскольку 13 > 11, убираем все элементы слева от 11 и продолжаем поиск 
 в правой половине: [13, 17, 19, 23, 29].
 
 Шаг 2:

 Берем новый средний элемент оставшегося списка.
 В подсписке [13, 17, 19, 23, 29] средний элемент — 19.
 Так как 13 < 19, убираем все элементы справа от 19 и продолжаем поиск 
 в левой половине: [13].

 Шаг 3:

 Остался один элемент — 13, который и является искомым.
 Таким образом, мы нашли элемент 13 всего за 3 шага, несмотря на то, 
 что в списке было 10 элементов.

 Формула для логарифмической сложности

 Теперь рассмотрим, как это связано с log₂(n). При каждом шаге алгоритм 
 разделяет количество оставшихся элементов пополам. Это значит, что, чтобы 
 найти нужный элемент, нам нужно сделать не более чем log₂(n) шагов.

 В общем случае для списка длиной n потребуется примерно log₂(n) шагов для 
 нахождения элемента (или убеждения, что его нет в списке).
 Расчет количества шагов с O(log₂(n))
 Что значит log₂(n)?
 Логарифм log₂(n) — это количество раз, которое нужно поделить n пополам, чтобы получить 1.
 Например, для списка длиной n = 8:
 После первого деления останется n = 4,
 После второго деления останется n = 2,
 После третьего деления останется n = 1.
 Всего потребовалось 3 деления, значит, log₂(8) = 3.
 Пример для разных n:
 Если в списке 16 элементов, log₂(16) = 4. Это значит, что алгоритм выполнит 4 шага.
 Если в списке 32 элемента, log₂(32) = 5, и алгоритм выполнит 5 шагов.
 Почему O(log(n)) быстрее, чем O(n)
 В алгоритмах с линейной сложностью O(n) таких, как простой перебор, для поиска 
 элемента в списке длиной n может потребоваться до n шагов в худшем случае.
 Алгоритм с O(log(n)) же значительно быстрее, потому что он сокращает количество 
 шагов на каждом этапе. 
 Например, если:
 
 n = 1 000 000, то линейный алгоритм (O(n)) может потребовать до миллиона шагов.
 
 Но алгоритму с O(log(n)) понадобится всего log₂(1 000 000) ≈ 20 шагов — что значительно меньше.
 
 Реальные примеры
 Поиск в словаре: Чтобы найти слово в бумажном словаре, мы тоже делим словарь, 
 открывая сначала середину, затем отсекаем половину и продолжаем, пока не найдем 
 нужное слово. Это тоже O(log(n)) — количество страниц, которые нужно открыть, 
 уменьшается с каждым шагом.

 Подведем итог

 O(log(n)) означает, что с увеличением объема данных количество шагов увеличивается медленно.
 В реальности для очень больших наборов данных O(log(n)) алгоритмы невероятно эффективны.





