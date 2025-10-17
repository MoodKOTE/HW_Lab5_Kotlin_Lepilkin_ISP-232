class Group(val groupName: String) {
    val students = mutableListOf<Student>()

    init {
        println("Создана группа")
    }

    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }

    fun listStudents() {
        println("Студенты группы $groupName:")
        for (student in students) {
            student.introduce()
        }
    }

    fun celebrateBirthdays() {
        println("В группе $groupName празднуют дни рождения!")
        for (student in students) {
            student.haveBirthday()
        }
    }
}