public class Main {
    public static void main(String[] args) {
        part[] parts = new part[] {new part("Иванов"),new part("Петров"),new part("Сидоров"),new part("Тихонов")};
        Cource[] cources = new part[] {new part("Препятствие 1"),new part("Препятствие 2")};
        Course c = new Course(cources); // Создаем полосу препятствий
        Team team = new Team(parts); // Создаем команду
        //help, что ему не нравится в передаваемом массиве? Гугл уверен в моей правоте!

        c.doIt(team); // Просим команду пройти полосу

        //аналогичная ошибка, что с этим не так?

        team.showResults(); // Показываем результаты
    }
}