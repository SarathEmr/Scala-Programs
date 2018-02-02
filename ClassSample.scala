
class Person(var name:String, var _age:Int){
  def age= _age
  def age(newAge:Int) ={
    _age= newAge

  }
}



object Sample{

  def main(args: Array[String]) {
    println("\nHello, world!\n")

    var person1= new Person("", 0);
    println( "Before: Age= "+ person1.age )
    person1.age(23)
    println( "After: Age= "+ person1.age )



    println("\nFactorial\nEnter a number: ")
    val input= scala.io.StdIn.readInt()
    println(s"Factorial of $input is "+ findFactorial( input ) )

  }

  def findFactorial(num:Int): Int = num match{  // similar to switch( num )

    case 0 => 1
    case _ => num* findFactorial(num-1)

//      OR :
//    var fact= 1
//    for(i <-num to 2 by -1 ){
//          fact*= i
//    }
//    println(fact)

  }

}
