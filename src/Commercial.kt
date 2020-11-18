import java.text.DecimalFormat

open class Commercial (var propertyName: String,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double,
                  multipleProperty: Int): Customer(customerName, customerPhone, customerAddress, squareFootage){

    var twoDigits = DecimalFormat("$###,###.00")
    var weeklyCharge: Double = 00.00

    fun calculate(squareFootage: Double, multipleProperty: Int){
        weeklyCharge = (squareFootage * .001) * 5
        if (multipleProperty == 1){
            weeklyCharge = ((weeklyCharge * .001) * .9)}
        println("Property Name: $propertyName")
        println("Customer Name: $customerName")
        println("Customer Phone Number: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Square footage: $squareFootage")
        println("Their weekly charge is ${twoDigits.format(weeklyCharge)}")
    }


}
