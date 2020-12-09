package raum.muchbeer.ktxstarter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IntroViewModel(startingCount : Int) : ViewModel() {
//if we want to observe this from MainActivity we need to remove private and use MutableLiveData
   // private var count = 0
    var count = MutableLiveData<Int>()
    var challengeViewModel = MutableLiveData<Int>()

    //private var countSum = 0
    var countSum = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = countSum

    init {
     //   countSum = startingCount
        countSum.value = startingCount
        challengeViewModel.value = 0

    }
   /* fun getCurrent() : Int {
      return count    }
      */

  /*  fun getUpdated() : Int {
        return ++count
    }*/

   /* fun getSumCurrent() : Int { return countSum }*/

/*    fun setSumUpdated(input : Int)  {
         countSum += input}*/

    fun setSumUpdated(input : Int) {
        countSum.value = (countSum.value)?.plus(input)
    }

    fun setChallengeUpdated() {
        challengeViewModel.value = (challengeViewModel.value)?.plus(1)
    }
 /*   When is the ViewModel's onCleared() called?
    A ViewModel's onCleared() is called when the app is put into the background
    and the app process is killed in order to free up the system's memory.*/
}