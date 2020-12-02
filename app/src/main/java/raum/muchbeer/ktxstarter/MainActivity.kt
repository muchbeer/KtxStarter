package raum.muchbeer.ktxstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import raum.muchbeer.ktxstarter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


   private lateinit var binding : ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnClickMe.setOnClickListener {
            displayTyping()
        }
    }

    private fun displayTyping () {
        binding.apply {
            txtDisplay.text = "Your name is: " + edtName.text
        }
    }
}