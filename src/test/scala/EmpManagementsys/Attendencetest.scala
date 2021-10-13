package EmpManagementsys
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
class Attendencetest extends AnyFlatSpec{
  "In Employee Details Attendence" should "be total" in {
    val totalAttendence=new Attendenceservice
    val total= totalAttendence.attendence("1582","9:45AM","6:45PM")
    assert(total=="9:00Hour")
  }
}
