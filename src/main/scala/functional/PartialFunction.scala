package functional

/**
  * Created by prashant on 15/4/18.
  */
object PartialFunction {

  def main(args: Array[String]): Unit = {
    println(isBetween15(10,20))
  }
  //Function which accept three parameter
  def range(number1:Int, number2:Int, number3: Int): Boolean = {
    if(number1 < number2 && number2 < number3) true else false
  }

  //create partial function which return function which accept two parameter
  def isBetween15 = range( _:Int,15, _:Int)
}
