object StringFormatter {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String, formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    val formattedNames = names.map(name => formatNames(name, toLower))
    formattedNames.foreach(println)
  }
}
