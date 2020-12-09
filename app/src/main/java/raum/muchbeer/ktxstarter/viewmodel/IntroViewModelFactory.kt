package raum.muchbeer.ktxstarter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class IntroViewModelFactory(private val startingCount : Int) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(IntroViewModel(startingCount)::class.java)) {
            return IntroViewModel(startingCount) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}