
import
scala.io.StdIn
import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import java.io._
import de.sciss.chart.api._

 def Project (): Unit = {

  val platform = new Platform(10000, 20, 70)
  val exchange = new Exchange(7000,7)

  val newaddress: Address = new Address("Ukranian","Kiev", "Krechatuk", 4)
  val newmanager = new Manager("Maks", "Poroshev", 19,8000, 9,newmanager, 2000)
  val super_office = new OfficeInfo("Ubisoft Kiev", "IT", newmanager )

  val stud_1 = new Student("Olexandr", "Lopod",99, 0, 1000, 241, "business", newaddress)

  val stud_2 = new Student("Slava", "Makarchuk",93, 0, 1000, 241, "business", newaddress)
  val teacher = new Teacher("Dmitro", "Gordon", 47, 15000, 30,newaddress, 4200, "business")
  stud_1.Print_student()
  teacher.MoEnd(stud_1, teacher, platform, exchange)
  platform.Token_Kurs((200/(platform.Token + exchange.Token).toDouble) * 100)
  platform Prises platform.Token_Kurs
  teacher.MoEnd(stud_2, teacher, platform, exchange)
  platform.Token_Kurs((200 / (platform.Token + exchange.Token).toDouble) * 100)
  platform Prises platform.Token_Kurs


  stud_1.Print_student()
  stud_1.TokenSell(stud_1, exchange, platform)
  platform.Token_Kurs((200 / (platform.Token + exchange.Token).toDouble) * 100)

  platform Prises platform.Token_Kurs

  println(platform.Prises)
  platform.graphofotokenprice


}
