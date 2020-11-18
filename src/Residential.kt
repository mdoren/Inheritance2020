import java.text.DecimalFormat

open class Residential (customerName: String,
                        customerPhone: String,
                        customerAddress: String,
                        squareFootage: Double,
                        senior: Int): Customer(customerName, customerPhone, customerAddress, squareFootage){

    var twoDigits = DecimalFormat("$###,###.00")
    var weeklyCharge: Double = 00.00

    fun calculate(senior: Int){
        weeklyCharge = squareFootage * 6
        var seniorText: String = "No"
        if (senior == 1){
            weeklyCharge = (weeklyCharge * .85)
            seniorText = "Yes"}
        println("Customer Name: $customerName")
        println("Customer Phone Number: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Square footage: $squareFootage")
        println("Senior Discount: $seniorText")
        println("Their weekly charge is ${twoDigits.format(weeklyCharge)}")
        }
}