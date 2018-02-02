
abstract class Planet{
  val area:String
  val age: String

}

object Earth extends Planet{
  val area="510.1 million sqkm.s"
  val age="4 billion yrs"

}

object Mars extends Planet{
  val area="144.8 million sqkm.s"
  val age="4.6 billion yrs"

}




object Calculator{
  def add(num1:Int, num2:Int): Unit ={
    println(s"Sum of $num1 and $num2 is "+ (num1+num2))
  }
  def substract(num1:Int, num2:Int): Unit ={
    println(s"Difference between $num1 and $num2 is "+ (num1-num2))
  }
}

object SingletonSample extends App{
  Calculator.add(15,22)
  Calculator.substract(12, 45)
}
