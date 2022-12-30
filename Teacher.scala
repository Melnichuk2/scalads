
class Teacher(name: String, surname: String, age: Int, money: Int, token: Int, address: Address, salary: Int, preferences: String)
  extends User(name, surname, age, money, token, address) {
  private var _salary: Int = salary
  private var _preferences: String = preferences

  def Salary: Int = _salary
  def Salary(x: Int): Unit = {
    _salary = x
  }

  def Preferences_a: String = _preferences
  def Preferences_a(x: String): Unit ={
    _preferences = x
  }

  override def toString: String = super.toString() + s"$salary"

  def BobStudent: Int = (Math.random() * (6 - 1) +
    1).toInt

  def MoEnd(x: Student, y: Teacher, z: Platform, w: Exchange): Unit = if( x.Preferences_a = y.Preferences_a) {
    x.Bob(y.BobStudent)
    x.Bob match {
      case 1 => {
        z.Token(z.Token - 1)
        x.Token(x.Token + 1)
      }
      case 2 => {
        z.Token(z.Token - 5)
        x.Token(x.Token + 5)
      }
      case 3 => {
        z.Token(z.Token - 10)
        x.Token(x.Token + 10)
      }
      case 4 => {
        z.Token(z.Token - 15)
        x.Token(x.Token + 15)
      }
      case 5 => {
        z.Token(z.Token - 20)
        x.Token(x.Token + 20)
      }
    }
    z.Counter(z.Counter + 1)
    y.Money(y.Money + y.Salary)
  }
}
