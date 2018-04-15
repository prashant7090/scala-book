package implicitl

/**
  * Created by prashant on 15/4/18.
  */
class CustomConcat(s:String) {
  def concatTwoTimes: String = s + s
}


object CustomConcat extends App {

  import StringToCustomCount._

  //If we remove above implicit function import, then we need to create CustomConcat instance manually. Note we have not changed behaviour of String class instead of we have added/extended string class
  //behaviour by adding implicit function.
  //If code doesn’t compile but would, if a call was made to an implicit function, Scala will call that function to make it compile

  val india = "India" //val india = new CustomConcat("India")

  println(s"concat two times  = ${india.concatTwoTimes}")

}
