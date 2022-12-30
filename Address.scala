
class Address (var country: String, var city: String,
              var street: String, var numberhome: Int){
  override def toString: String = s"$country,$city,$street,$numberhome"

}