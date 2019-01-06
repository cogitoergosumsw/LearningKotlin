fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var sw: String
    sw = "Seng Wee"
    println(sw)
    println()

    var salary: Int = 100000
    var annualSalary: Int = salary * 12
    println("My annual salary is $" + annualSalary + ".") //String concatenation

    println("My name is $sw.") //String interpolation

    var daysInWeek : Int = 7
    println("Number of week(s) in $daysInWeek days is ${daysInWeek / 7}.")
}