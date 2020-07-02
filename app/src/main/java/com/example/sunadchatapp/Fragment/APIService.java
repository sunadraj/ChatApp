package com.example.sunadchatapp.Fragment;

import com.example.sunadchatapp.Notifications.MyResponse;
import com.example.sunadchatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(

            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA28Nix54:APA91bEClmrC_XK9wHfTuO6kR4ybkGSB8w5J1a_z1TggGjKbH0_tuKvvkIEZr-aC-wNMkp2ZJ5dI2um8jkO0VRCSkggD9zSGu1jdNWRItxkLZc2alt1Fzcg4fstypjMZMljyUEGpJMSR"

            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
