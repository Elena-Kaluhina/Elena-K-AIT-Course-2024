План занятия №30 23.10.2024:
1. Что мы сделали на прошлом занятии:
   закончили:

метод averageSalary для Employee-Company и тест
методы: Employee[] findEmployeeHoursGreaterThan(int hours); // без использования Predicate Employee[] findEmployeeSalaryRange(double min, double max); и тесты к ним.
реализовали методы в GarageImplementation для отбора элементов из массива, удовлетворяющих заданному условию:

выборка по модели: car -> car.getModel().equals(model) // замена if(car.getModel().compareTo(model))
выборка по компании: car -> car.getCompany().equals(company)
выборка по цвету: car -> car.getColor().equals(color)
по двигателю: car -> car.getEngine() > min && car.getEngine() < max
создали класс Wine, массив объектов типа Wine, выполнили его сортировку:

по году производства
по алфавиту
по стоимости
2. Обсуждаем ДЗ:
   сортировка объектов массива типа Car
   методы и тесты для GarageImpl
   Есть ли вопросы?

3. План на сегодняшнее занятие:
   класс Arrays и его методы:
   toString
   sort
   binarySearch
   использование лямбда-выражений (элементы функционального программирования) в компараторах
   сортировка объектов Integer
   Практика:
   создать класс Soldier (Солдат) с полями:

name: String
height: int
weight: double
profile: int;
создать массив "солдат" на 5 элементов

John, 182, 82.3, 91
Peter, 175, 77.1, 75
Robin, 162, 55.1, 91
Mary, 159, 55.1, 91
Ann", 162, 55, 88
отсортировать солдат "естественным" образом - по росту
отсортировать по имени
по значению profile
по весу
проверить работу метода binarySearch на массиве объектов
отсортировать массив с объектами из класса-обертки Integer