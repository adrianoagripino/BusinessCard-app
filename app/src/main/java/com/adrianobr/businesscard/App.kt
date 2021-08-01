package com.adrianobr.businesscard

import android.app.Application
import com.adrianobr.businesscard.data.AppDataBase
import com.adrianobr.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDataBase.getDataBase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }

}