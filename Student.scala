import scala.io.StdIn.readInt

class Student(name: String, surname: String, age: Int, money: Double,token: Int, group: Int, preferences: String, address: Address, bob: Int = 0)
  extends User(name, surname, age, money, token, address) {



  private var _group: Int = group
  private var _bob: Int = 0
  private var _preferences: String = preferences

  override def toString: String = super.toString() + s"$group,$bob"
  def Print_stud(): Unit = println(s"Group: $_group\n Bob: $_bob")

  def Group: Int = _group
  def Group(x: Int): Unit = {
    _group = x
  }
  def Bob: Int = _bob
  def Bob(x: Int): Unit = {
    _bob = x
  }
  def Prefer_s: String = _preferences
  def Prefer_s(x: String): Unit = {
    _preferences = x
  }
  trait token_store {
    def TokenSell(x: Student, y: Exchange, z: Platform): Unit = {
      y.Token(y.Token + x.Token)
      x.Token(0)
      y.Money(y.Money - (x.Token * z.Token_Kurs))
      x. Money(x.Money + (x.Token * z.Token_Kurs))
      println("Продаж токену була успішною")
    }

    def TokenBuy(x: Student, y: Exchange, z: Platform): Unit = {
      println("Купівля токенів була успішною")
      val i: Int = readInt()
      x.Money(x.Money - (i * z.Token_Kurs))
      y.Money(y.Money + (i * z.Token_Kurs))
      y.Token(y.Token - i)
      x.Token(x.Token + i)
    }
  }

  case class Print_student()
}


