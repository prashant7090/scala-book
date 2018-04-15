package implicitl

/**
  * Created by prashant on 15/4/18.
  */
object StringToCustomCount {
  implicit def stringToCustomConcat(s: String) = new CustomConcat(s)
}
