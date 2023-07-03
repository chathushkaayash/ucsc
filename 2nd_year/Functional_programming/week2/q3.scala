object main extends App{
    def takeHomeSalary(normalHours: Double, otHours: Double): Double =  (250*normalHours + 85*otHours)*(100-12)/100
    println(takeHomeSalary(40,30))
}
