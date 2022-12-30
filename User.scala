class User( var name: String, var surname: String,
            var age: Int, var money: Double,
            var token: Int, var address: Address) {

     private var _name: String = name
     private var _surname: String = surname
     private var _age: Int = age
     private var _money: Double = money
     private var _token: Int = token
     private var _address: Address = address

  def Name: String = _name
   def Name(n: String): Unit = {
    _name = n
   }
  def Surname: String = _surname
  def Surname( n: String): Unit = {
   _surname = n
}
def Age: Int = _age
def Age(n:Int ): Unit ={
  _age = n
}
def Money: Double = _money
def Money(n:Double): Unit ={
  _money = n
}
def Token: Int = _token
def Token(n:Int): Unit ={
  _token = n
}
def Address: Address = _address
def Address(n: Address): Unit = {
  _address = n
}

override def toString: String = s"$name, $surname, $age, $money, $token, $address"

def Print_Use(): Unit =
  println(s"Name: $name\n Surname: $surname\n Age: $age\n Money: $money\n Token: $token\n Address: $address")
}