open class Customer (customerName: String,
                customerPhone: String,
                customerAddress: String,
                squareFootage: Double) {

    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerPhone: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerAddress: String = ""
        get() = field
        set(value) {
            field = value
        }
    var squareFootage: Double = 00.00
        get() = field
        set(value) {
            field = value
        }

    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }

}