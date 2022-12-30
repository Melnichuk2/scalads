 class Exchange(var money: Double, var token: Int) {
  var _money: Double = money
  var _token: Int = token

  def Money: Double = _money
  def Money(n: Double): Unit = {
  _money = n
 }
  def Token: Int = _token
  def Token(n: Int): Unit = {
  _token = n
 }
 }