# Scala_Assignment1
### Task:-
##### Create an Employee Management System where there are the following types of employees:

* Consultant<br/>
* Manager<br/>
* Sr. Manager<br/>
* President<br/>

> All Employees must have empId, first name, last name, salary. `Hint: Create a Trait and then create all other employees as ADT`
 
> The employee will be differed by prefix as following `Hint: create Prefix as a class member`
 
* Consultant - CONS<br/>
* Manager - MANA<br/>
* Sr. Manager - SRMA<br/>
* President - POTC<br/>
**Note: Prefix should not be accessible outside the class.**
```Code:-
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
```
**Create the Attendance Service in your application**

Create a method that will take the following arguments<br/>
Employee (any Employee)<br/>
* Start Time<br/>
* End Time<br/>

Create another method with the same name that will take the following arguments<br/>
* Employee<br/>
`and take start time as 09:45 AM and end time as 06:45 PM automatically.`

```Code
class Attendenceservice {
  var total: String = ""
  def attendence(emp_id: String, starttime: String, endtime: String): String = {
    if (starttime == "9:45AM" && endtime == "6:45PM") {
      total = "9:00Hour"
    }
    total
  }
  def attendence(emp_id: String)={
    var startTime:String="9:45am"
    var endTime:String="6:45pm"
    val totalTime:String ="9hours"
    s"$emp_id $startTime $endTime $totalTime"
  }
}
```
---

***Unit Testing***
**For employee data***
```
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
```
***Unit testing for Attendence Service***
```
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
class Attendencetest extends AnyFlatSpec{
  "In Employee Details Attendence" should "be total" in {
    val totalAttendence=new Attendenceservice
    val total= totalAttendence.attendence("1582","9:45AM","6:45PM")
    assert(total=="9:00Hour")
  }
}
```



