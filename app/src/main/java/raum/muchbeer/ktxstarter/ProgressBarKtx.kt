package raum.muchbeer.ktxstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import raum.muchbeer.ktxstarter.databinding.ActivityProgressBarKtxBinding

class ProgressBarKtx : AppCompatActivity() {

    private lateinit var binding : ActivityProgressBarKtxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_progress_bar_ktx)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_progress_bar_ktx)

        binding.btnStart.setOnClickListener {
            spinOnOff()
        }
    }

    private fun spinOnOff() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                btnStart.text = "Stop"
                progressBar.visibility = View.VISIBLE
            }else {
                progressBar.visibility = View.GONE
                btnStart.text = "Start"
            }
        }
    }
}