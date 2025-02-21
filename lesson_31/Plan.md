План занятия №31 24.10.2024:
1. Что мы сделали на прошлом занятии:
   использовали лямбда-выражения в компараторах
   @Test void testSortSoldiersByName(){ printArray(soldiers); Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName())); // сортировка по алфавиту от A до Z потом a до z printArray(soldiers); }

научились производить сортировку по нескольким полям @Test void testSortSoldiersByProfile(){ printArray(soldiers); Arrays.sort(soldiers, (s1, s2) -> { int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile return res !=0 ? res : - s1.getHeight() + s2.getHeight(); // sort by Height }); printArray(soldiers); }
отработали использование binarySearch для поиска элемента в массиве объектов @Test void testArraysBinarySearch(){ printArray(soldiers); System.out.println("------------------------------------"); Arrays.sort(soldiers, (s1, s2)-> (s1.getProfile() - s2.getProfile())); // sort aray before searching!!! printArray(soldiers); Soldier pattern = new Soldier(null, 0, 0, 100); // who's searching int index = Arrays.binarySearch(soldiers, pattern, (s1, s2)-> (s1.getProfile() - s2.getProfile())); // search System.out.println(index); printArray(soldiers); }
2. Обсуждаем ДЗ:
   сортировка массивов объектов своего типа
   сортировка массивов объектов типа Double
   Есть ли вопросы?

3. План на сегодняшнее занятие:
   класс Arrays и его методы:
   Arrays.copyOf
   Arrays.copyOfRange
   System.arraycopy
   Практика: Задание 1. Создать класс City - название, население. Сделать класс Citi сортируемым по полю кол-во населения. Создать массив городов: City("Denver", 600_000); City("Boston", 670_000); City("Chicago", 2_700_000); City("Atlanta", 470_000); City("New York", 8_500_000); City("Dallas", 1_300_000);
   Распечатать в отсортированном виде. Есть ли в списке городов город с населением 1.2 млн человек? Отсортируйте список по алфавиту. Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?

Скопируйте массив в другой, имеющий в 2 раза большую длину. Отсортируйте полученный массив.

Имеется ли в списке городов город Salem? "Salem", 690_000

Проверьте работу метода System.arraycopy, скопировав часть массива. Проверьте работу метода Arrays.copyOfRange

Вставьте город Salem в список, сохранив порядок сортировки по населению.

Задание 2. Выполните рефакторинг приложения Employee-Company:

метод remove - использовать System.arraycopy
метод findEmployeesHoursGreaterThan - использовать лямбда-выражение
метод findEmployeesSalaryRange - использовать лямбда-выражение