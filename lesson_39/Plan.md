План занятия №39 05.11.2024:
1. Что мы сделали на прошлом занятии:
   обсудили преимущества и недостатки ArrayList (см. теорию)
   решили задачу об объединении двух списков и удалении дубликатов
   создали пример List list = new LinkedList<>(), заполнили его случайными целыми числами, проверили работу стандартных методов
   проверили производительность циклов:
   for each
   Iterator loop
   for i для ArrayList и LinkedList (сумма 500 тыс. элементов списка)
2. Обсуждаем ДЗ:
   два листа с температурой
   столицы Германии (LinkedList)
   случайное разделение списка студентов на 2 части
   Есть ли вопросы?

3. Тема занятия:
   JCF: интерфейс Set и его реализация – класс HashSet.

методы интерфейса Set;
как происходит заполнение HashSet и поиск в нем элементов?
4. Практика:
   Задания на использование HashSet:

Задача 1.

Выяснить, сколько уникальных слов в самом длинном в мире предложении Л.Н.Толстого. String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
Задача 2.

Поиск общих друзей у двух пользователей соц.сети. В социальной сети у каждого пользователя есть список друзей. Напишите программу, которая определяет общих друзей для двух заданных пользователей. Пример: Список друзей пользователя A: ["Иван", "Мария", "Анна", "Петр"] Список друзей пользователя B: ["Анна", "Елена", "Петр", "Дмитрий"]

Выход: ["Анна", "Петр"]
Задача 3.

Написать приложение, которое позволит понять, из каких мест на данную почту приходят письма.
Минипроект

реализация приложения по UML-схеме Supermarket