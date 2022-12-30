import java.io._
import de.sciss.chart.api._

class Platform( var money: Double,var token: Int, var token_kurs: Double, var months: Int = 1) {

  private var _token = token
  private var _money = money
  private var _counter = months
  private var _token_kurs = token_kurs
  private var _prises = List(token_kurs)

  def Token: Int = _token

  def Token(x: Int): Unit = {
    _token = x
  }

  def Money: Double = _money

  def Money(x: Double): Unit = {
    _money = x
  }

  def Counter: Int = _counter

  def Counter(x: Int): Unit = {
    _counter = x
  }

  def Prises: List[Double] = _prises

  def Prises(x: List[Double]): Unit = {
    _prises = _prises :+ _token_kurs
  }

  def Token_Kurs: Double = _token_kurs

  def Token_Kurs(x: Double): Unit = {
    _token_kurs = x
  }

  def graphofotokenprice(): Unit = {
    val dataset = Seq(
      ("Ціна токена", for (x <- 1 to _prises.length by 1)
        yield (x, _prises(x - 1))
      ))
    val chart = XYLineChart(dataset)
    chart show(title = "Графік ціни токена")
  }

}




