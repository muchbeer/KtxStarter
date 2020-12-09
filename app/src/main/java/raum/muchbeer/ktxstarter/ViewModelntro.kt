package raum.muchbeer.ktxstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import raum.muchbeer.ktxstarter.databinding.ActivityViewModelntroBinding
import raum.muchbeer.ktxstarter.viewmodel.IntroViewModel
import raum.muchbeer.ktxstarter.viewmodel.IntroViewModelFactory
import java.lang.NumberFormatException

class ViewModelntro : AppCompatActivity() {

        private lateinit var binding : ActivityViewModelntroBinding
        private lateinit var viewModelFactory : IntroViewModelFactory
        private lateinit var viewModel : IntroViewModel
     //  private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_view_modelntro)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_modelntro)

         viewModelFactory = IntroViewModelFactory(120)
         viewModel = ViewModelProvider(this, viewModelFactory).get(IntroViewModel::class.java)

     //    viewModel.countSum.observe(this, Observer {
             viewModel.totalData.observe(this, Observer {
             binding.txtDisplaySum.text = it.toString()
         })

         viewModel.challengeViewModel.observe(this, Observer {
             binding.txtCount.text = it.toString()
         })
     /*   binding.txtCount.text =  viewModel.getCurrent().toString()
        binding.txtDisplaySum.text = viewModel.getSumCurrent().toString()
        binding.buttonCount.setOnClickListener {
            binding.txtCount.text = viewModel.getUpdated().toString()
        }*/

         binding.btnAddNumber.setOnClickListener {
             viewModel.setSumUpdated(binding.edtSumCount.text.toString().toInt())
              //   binding.txtDisplaySum.text = viewModel.getSumCurrent().toString()
                      }

         binding.buttonCount.setOnClickListener {
             viewModel.setChallengeUpdated()
         }

    }
}