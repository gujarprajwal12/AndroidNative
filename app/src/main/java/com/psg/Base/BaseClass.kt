package com.psg.Base

import android.app.Application
import com.psg.Di.UserRepostory
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class BaseClass : Application() {

    // moddule are use to crate an obj becu interface , abstrat calss cant  crate obj

    @Inject
    lateinit var  userRepostory: UserRepostory
    override fun onCreate() {
        super.onCreate()

          userRepostory.SaveMeassage("prajwal" , 7040452312 )
    }


}