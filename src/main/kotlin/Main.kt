fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    val sw: String
    sw = "Seng Wee"
    println(sw)
    println()
    // val vs var - val variables are immutable while var variables are mutable.

    var salary: Int = 100000
    var annualSalary: Int = salary * 12
    println("My annual salary is $" + annualSalary + ".") //String concatenation

    println("My name is $sw.") // String interpolation

    var daysInWeek : Int = 7
    println("Number of week(s) in $daysInWeek days is ${daysInWeek / 7}.")
}