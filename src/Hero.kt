class Hero {
    var name: String = "Неизвестный"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "огонь"

    fun greet() {
        println("Привет! Меня зовут $name")
    }

    fun showInfo() {
        println("Имя: $name, HP: $hp, MP: $mp, Уровень: $level, Стихия: $element")
    }

    fun meditate() {
        mp += 10
        println("$name восстановил ману. Текущая мана: $mp")
    }

    fun takeDamage(amount: Int) {
        hp -= amount
        if (hp < 0) hp = 0
        println("$name получил урон $amount. Осталось HP: $hp")
        die()
    }

    fun die() {
        if (hp <= 0) {
            println("$name умер...")
        }
    }

    fun castSpell() {
        if (mp >= 10) {
            mp -= 10
            println("$name применяет магию. Осталось маны: $mp")
        } else {
            println("Недостаточно маны! У вас только $mp")
        }
    }

    fun heal() {
        if (mp >= 10) {
            mp -= 10
            hp += 10
            println("$name восстановил HP. HP: $hp, MP: $mp")
        } else {
            println("Недостаточно маны! У вас только $mp")
        }
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует ${enemy.name}")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        if (mp < 10) {
            println("Недостаточно маны! У вас только $mp")
            return
        }
        println("$name применяет $spellName против ${enemy.name}")
        mp -= 10
        val finalDamage = if (element == enemy.element) damage / 2 else damage
        enemy.takeDamage(finalDamage)
        println("Осталось маны: $mp")
    }

    fun duel(opponent: Hero) {
        println("$name сражается против ${opponent.name}")
        while (hp > 0 && opponent.hp > 0) {
            opponent.takeDamage(10)
            if (opponent.hp <= 0) break
            this.takeDamage(10)
        }
    }
}
