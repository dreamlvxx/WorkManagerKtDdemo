package com.dream.workmanagerktdemo

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters


class UploadWorker(appContext: Context, workerParams: WorkerParameters)
    : Worker(appContext, workerParams) {

    override fun doWork(): Result {
        // Do the work here--in this case, upload the images.

        for (index in 1..10){
            println(index)
        }

        // Indicate whether the task finished successfully with the Result
        return Result.success()
    }
}