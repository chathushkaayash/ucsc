object q1 extends App{
    
    def reverse_str(s:String):String=if (s.isEmpty) "" else reverse_str(s.tail)+s.head
    println(reverse_str("Hello World"))

}