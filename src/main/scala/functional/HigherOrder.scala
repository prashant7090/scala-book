package functional

/**
  * Created by prashant on 15/4/18.
  */
object HigherOrder {

  def main(args: Array[String]): Unit = {
    println(compute(square,2))
    println(compute(cube,3))
  }

  def square(number: Int) = {
    number*number
  }

  def cube(number: Int) = {
    number*number*number
  }

  //This function takes first parameter as function which accept int and return int
  def compute(function: Int=> Int, y:Int) = {
    function(y)
  }

}
