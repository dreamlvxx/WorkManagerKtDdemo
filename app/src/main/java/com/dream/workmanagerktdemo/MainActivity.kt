package com.dream.workmanagerktdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequest
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uploadWorkRequest = OneTimeWorkRequest.Builder(UploadWorker::class.java).build()
        val pertask = PeriodicWorkRequest.Builder(UploadWorker::class.java,1,TimeUnit.SECONDS).build()
        WorkManager.getInstance().enqueue(uploadWorkRequest)
    }
}