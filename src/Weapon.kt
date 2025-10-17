class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo(){
        println("Weapon: $name | Damage: $damage | Durability: $durability | Type: $type")
    }

    fun use(){
        durability -= 10
        if  (durability <= 10){
            println("Оружие сломано!")
        }
    }
    fun upgrade(bonus1: Int){
        damage += bonus1
    }
}