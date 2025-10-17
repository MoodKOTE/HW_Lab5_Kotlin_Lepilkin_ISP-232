class Quest {
    var title: String = "Неизвестное задание"
    var duration: Int = 1
    var reward: Int = 0
    var difficulty: String = "Лёгкий"

    fun printInfo() {
        println("Задание: $title | Время: $duration ч | Награда: $reward монет | Сложность: $difficulty")
    }

    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }
}
