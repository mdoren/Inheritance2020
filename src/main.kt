fun main(){
    //get information that will be used by all customers
    println("What is your name?")
    var customerName = readLine()!!.toString()
    println("What is your phone number (###-###-####)?")
    var customerPhone = readLine()!!.toString()
    println("What is your Address?")
    var customerAddress = readLine()!!.toString()
    println("How many square feet is your property?")
    var squareFootage = readLine()!!.toDouble()
    //create person variable to hold all info
    var person1 = Customer(customerName,customerPhone,customerAddress,squareFootage)

    println("Are you a commercial or residential customer?")
    println("1. Commercial\n2. Residential")
    var choice1 = readLine()!!.toInt()
    //COMMERCIAL
    if (choice1 == 1){
        println("What is the property name?")
        var propertyName = readLine()!!.toString()
        println("Do you own multiple properties?\n1. Yes\n2. No")
        var choice2 = readLine()!!.toInt()
        //MULTIPLE PROPERTIES
        var person1 = Commercial(propertyName,customerName,customerPhone,customerAddress,squareFootage,choice2)
        if (choice2 == 1){
            println("Enter the total square footage of all of your properties.")
            squareFootage = readLine()!!.toDouble()
        }
        person1.calculate(squareFootage, choice2)
    }
    if (choice1 == 2){
        var senior = 0
        println("Are you a senior citizen?\n1. Yes\n2. No")
        senior = readLine()!!.toInt()
        var person1 = Residential(customerName,customerPhone,customerAddress,squareFootage,senior)
        person1.calculate(senior)
    }

}