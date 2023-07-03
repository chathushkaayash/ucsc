object q1 extends App{
    
    def Mean(num1: Double, num2: Double): Double = BigDecimal((num1+num2)/2).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
    printf("%.2f",Mean(11,20))

}