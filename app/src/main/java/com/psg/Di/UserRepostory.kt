package com.psg.Di

import android.util.Log
import javax.inject.Inject


const val TAG = "Prajwal"



class UserRepostory @Inject constructor() {

    fun SaveMeassage(Email : String , Phone : Int ){
        Log.d(TAG, "SaveMeassage: user use in db ")
    }
}