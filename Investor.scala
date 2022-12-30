class Investor (name:String, surname:String, age: Int, money: Double, token:Int , address:Address, balance:Int)
   extends User(name, surname, age, money, token, address){

     private var _balance:Int = balance

     def Capl: Int = _balance
    def Capl(x:Int):Unit = {
       _balance + x
    }
  override def toString: String = super.toString() +s"$balance"
}
