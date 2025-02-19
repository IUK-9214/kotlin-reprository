fun main() {
    println("the first practice fo exam")
    val eng:Float
    val urdu:Float
    val math:Float
    val gpe:Float
    val gpu:Float
    val gpm:Float
    val gpt:Float
    println("enter your english marks : ")
    eng= readLine()!!.toFloat()
    println("enter your urdu marks : ")
    urdu= readLine()!!.toFloat()
    println("enter your maths marks : ")
    math= readLine()!!.toFloat()
    gpm=(math/300)*4
    gpu=(urdu/300)*4
    gpe=(eng/300)*4
    gpt=gpm+gpu+gpe
    val totalpercenatge:Float=(eng+urdu+math)*100/300
    val avg:Float= (eng+urdu+math+gpe)/4
    println("your cgpa is : $gpt")
    println("your total percentage is : $totalpercenatge")

     if (gpt>=3.7 && gpt<=4){
    println("you got an RECTOR AWARD CONGRATS")
}
    else if (gpt>=3.5&&gpt<3.7){
        println("you got an DEANS AWARD CONGRATs")
    }
    else{
        println("no awarad parhi karo ")
    }
}