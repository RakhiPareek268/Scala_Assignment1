package EmpManagementsys
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.compatible.Assertion
class Employeetest extends AnyFlatSpec {
 "In Employee Details Consultant ID" should "be like this" in {
  var obj = new Employeedetails
  var consId= obj.consultant("1582","Rakhi", "Pareek", 7000000.0)
  assert(consId=="CONS1582")
 }
 "In Employee Details Manager ID" should "be like this" in {
  var obj = new Employeedetails
  var managerId = obj.manager("1583", "Shubhang", "Vats", 1000000.0)
  assert(managerId== "MANA1583")
 }
 "In Employee Details sr manager ID" should "be like this" in {
  var obj = new Employeedetails
  var srMangerId = obj.sr_manager("1584", "Priyansh", "Sharma", 1100000.0)
  assert(srMangerId == "SRMA1584")
 }
 "In Employee Details President ID" should "be like this" in {
  var obj = new Employeedetails
  var presidentId = obj.president("1585", "Kamayani", "Goshwami", 1200000.0)
  assert(presidentId == "POTC1585")
 }
}
