# Углубленный курс Java
### Домашнее задание 2

1. **Уникальные элементы**
Необходимо реализовать методы:

    ```
    public HashSet<Integer> getUniqElements(HashSet<Integer> hashSetRepository, ArrayList<Integer> inputList){
    //Ваш код
    }

    public ArrayList<Integer> getUniqElements(ArrayList<Integer> arrayListRepository, ArrayList<Integer> inputList){
    //Ваш код
    }
    ```

    Предварительно заполните hashSetRepository и arrayListRepository значениями (желательно вынести это в отдельные методы). Необходимо реализовать следующий алгоритм для 1 метода:

    - На вход приходят 2 коллекции, необходимо перенести все уникальные элементы из inputList в hashSetRepository
    - Если inputList содержит неуникальные элементы, либо какой то из элементов уже есть в hashSetRepository, то необходимо вернуть пустой HashSet
    - Если inputList содержит только уникальные элементы, и ни одного из этих элементов нет в hashSetRepository, то необходимо добавить все элементы из inputList в hashSetRepository и вернуть полученный hashSetRepository

    Для второго метода из таблицы сделать аналогичную реализацию, за исключением того, что вместо hashSetRepository, у вас будет arrayListRepository.

2. **Поиск Спортсменов в HashMap**

    Дана HashMap в которой ключом выступает номер спортсмена, а значением - объект класса Sportsman.

    `Map<Integer, Sportsman> sportsmanHashMap = new HashMap<>();`

    Класс Sportsman содержит следующие поля:

    - String Name
    - boolean hasRecord
    - boolean hasTeam

    Необходимо реализовать 2 метода

    ```
    public boolean inMap(Integer number){
    //Ваш код
    }

    public int getCountSameSportsman(Sportsman sportsman){
    //Ваш код
    }
    ```

    Предварительно заполните sportsmanHashMap значениями (желательно вынести это в отдельный метод).

    Для первого метода необходимо на вход подать номер спортсмена и проверить есть ли такой спортсмен в HashMap, если есть вернуть True, если нет вернуть False

    Для второго метода необходимо на вход подать объект Sportsman и определить сколько прочих спортсменов в sportsmanHashMap имеют те же поля hasRecord и hasTeam. Постарайтесь реализовать проверку через equals.
