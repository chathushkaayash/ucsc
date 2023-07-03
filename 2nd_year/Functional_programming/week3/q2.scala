object q1 extends App{
    
    def filter_str(arr:List[String])=arr.filter(_.length()>5)
    println(filter_str(List("hello","hi","welcome")))

}
