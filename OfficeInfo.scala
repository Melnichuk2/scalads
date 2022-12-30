class OfficeInfo (var title: String, var department: String, var manager: Manager ) {

  private val _office_name: String = title
  private val _department: String = department
  private val _manager: Manager = manager

  def Title: String = _office_name
  def Department: String = _department
  def Manager: Manager = _manager

  override def toString: String = s"$title, $department, $manager"
  def Show_office(): Unit = println(s"Title:$_office_name\n Department: $_department\n Manager: $_manager")
}
