object main extends App{
    def best():Int={
        var ticketPrice:Int = 15;
        var people:Int=120;
        
        var ans_price,value,profit,ans_people:Int=0;
        while (people>0){
            value=ticketPrice*people-500-3*people;
            if (value>profit){
                ans_price=ticketPrice;
                profit=value;
                ans_people=people;
            }
            ticketPrice+=5
            people-=20
        }

        ticketPrice= 15;
        people=120;
        while (value>0){
            value=ticketPrice*people-500-3*people;
            if (value>profit){
                ans_price=ticketPrice;
                profit=value;
                ans_people=people;
            }
            ticketPrice-=5;
            people+=20;
        }
        return(ans_price)
}
    println(best())
}