
trait Shape{
  def findArea(param1:Double, param2:Double):Double
}

class Circle extends Shape{
  override def findArea(param1:Double, param2:Double): Double = {
      3.14 * param1
  }
}

class Rectangle extends Shape{
  override def findArea(param1:Double, param2:Double): Double = {
    param1 * param2
  }
}

object Main extends App{

  val circle1= new Circle()
  println("Area of circle with radius= 5.5 is \n"+ circle1.findArea(5.5, 0) )

  val rectangle1= new Rectangle
  println("Area of rectangle with length= 10 & breadth= 5 is \n"+ rectangle1.findArea(10, 5) )
  
}