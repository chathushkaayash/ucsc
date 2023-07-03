object q2 {
  def main(args: Array[String]): Unit = {
    if (args.length == 1) {
      val input = args(0).toInt
      val message = input match {
        case x if x <= 0 => "Negative/Zero is input" 
        case x if x % 2 == 0 => "Even number is given" 
        case _ => "Odd number is given"
      }
      println(message)
    } else {
      println("Please provide a single integer input.")
    }
  }
}


// scalac q2.scala
// scala q2 5