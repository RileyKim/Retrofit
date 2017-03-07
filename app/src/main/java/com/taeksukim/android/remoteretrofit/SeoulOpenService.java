package com.taeksukim.android.remoteretrofit;

import com.taeksukim.android.remoteretrofit.domain.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by TaeksuKim on 2017. 3. 7..
 */

public interface SeoulOpenService {

    // full address : http://openapi.seoul.go.kr:8088/6a52695a4f74616536394758717877/json/SearchParkingInfoRealtime/1/500/
    @GET("6a52695a4f74616536394758717877/json/SearchParkingInfoRealtime/1/500/")
    //Call<Data> getData(@Path("") String value);
    Call<Data> getData();
}
