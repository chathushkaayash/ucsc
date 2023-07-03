object name extends App {
  def area(radius: Double): Double = 3.14 * radius * radius
  def fahrenheit(celsius: Double): Double = celsius * 1.8 + 32
  def vol(radius: Double): Double =(4.0 / 3.0) * 3.14 * radius * radius * radius

  def discountedPrice(numCopies: Int): Double = 24.95 * (1 - 0.4) * numCopies
  def shippingCost(numCopies: Int): Double =if (numCopies <= 50) 3.0 else 3.0 + (numCopies - 50) * 0.75
  def totalWholesaleCost(numCopies: Int): Double =discountedPrice(numCopies) + shippingCost(numCopies)

  def easy(dist: Int): Int = dist * 8
  def tempo(dist: Int): Int = dist * 7
  def totalRunningTime(x: Int, y: Int, z: Int): Int =easy(x) + tempo(y) + easy(z)

  println(area(5))
  println(fahrenheit(35))
  println(vol(5))
  println(totalWholesaleCost(60))
  println(totalRunningTime(2, 3, 2))
}
