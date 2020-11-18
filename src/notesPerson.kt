open class notesPerson(firstName: String,
                  lastName: String){
    var firstName: String = ""
        get() = field
        set(value) {
            field = value
            fullName = setFullName()
        }
    var lastName: String = ""
        get() = field
        set(value) {
            field = value
            fullName = setFullName()
        }
    var fullName: String = ""

    init{
        this.firstName = firstName
        this.lastName = lastName
    }

    fun setFullName(): String{
        return "$firstName $lastName+"
    }
}