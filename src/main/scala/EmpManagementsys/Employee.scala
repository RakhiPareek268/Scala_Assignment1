package EmpManagementsys
trait Employee {
  def consultant(emp_id: String,firstname: String, lastname: String, salary: Double):String
  def manager(emp_id:String, firstname:String, lastname:String, salary:Double):String
  def sr_manager(emp_id:String, firstname:String, lastname:String, salary:Double):String
  def president(emp_id:String, firstname:String, lastname:String, salary:Double):String

}
class Employeedetails extends Employee {
  private var prefix: Array[String] =Array("CONS","MANA","SRMA","POTC")

  def consultant(emp_id: String, firstname: String, lastname: String, salary: Double): String = {
    var consId:String=prefix(0)+emp_id
    consId
  }
  def manager(emp_id: String, firstname: String, lastname: String, salary: Double): String={
    var managerId:String=prefix(1)+emp_id
    managerId
  }
  def sr_manager(emp_id: String, firstname: String, lastname: String, salary: Double): String={
    var srManagerId= prefix(2)+emp_id
    srManagerId
  }
  def president(emp_id: String, firstname: String, lastname: String, salary: Double): String={
    var presidentId=prefix(3)+emp_id
    presidentId
  }
}



