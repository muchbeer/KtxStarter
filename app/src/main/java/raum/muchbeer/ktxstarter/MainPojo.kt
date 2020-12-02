package raum.muchbeer.ktxstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import raum.muchbeer.ktxstarter.databinding.ActivityMainPojoBinding
import raum.muchbeer.ktxstarter.model.Student

class MainPojo : AppCompatActivity() {

    private lateinit var binding : ActivityMainPojoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main_pojo)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_pojo)
        binding.student = callObject()
      //  val getStudent = callObject()
       /* binding.apply {
            txtDisplayName.text = getStudent.name
            txtDisplayEmail.text = getStudent.email
        }*/
    }

    private fun callObject() : Student {
        return Student(1, "George Kamala", "new@gmail.com")
    }
}