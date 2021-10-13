package EmpManagementsys

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

