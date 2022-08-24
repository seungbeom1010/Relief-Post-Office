package com.seoul42.relief_post_office.repository

import androidx.lifecycle.MutableLiveData
import com.seoul42.relief_post_office.fcmapi.RetrofitInstance
import com.seoul42.relief_post_office.model.NotificationDTO
import okhttp3.ResponseBody
import retrofit2.Response

class FirebaseRepository {

    // 메세지 수신 정보
    private val myResponse : MutableLiveData<Response<ResponseBody>> = MutableLiveData()

    // 푸시 메세지 전송
    suspend fun sendNotification(notification: NotificationDTO) {
        myResponse.value = RetrofitInstance.api.sendNotification(notification)
    }
}