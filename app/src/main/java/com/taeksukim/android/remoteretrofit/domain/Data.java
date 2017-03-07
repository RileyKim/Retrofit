package com.taeksukim.android.remoteretrofit.domain;

/**
 * Created by TaeksuKim on 2017. 3. 7..
 */


public class Data
{
    private SearchParkingInfoRealtime SearchParkingInfoRealtime;

    public SearchParkingInfoRealtime getSearchParkingInfoRealtime ()
    {
        return SearchParkingInfoRealtime;
    }

    public void setSearchParkingInfoRealtime (SearchParkingInfoRealtime SearchParkingInfoRealtime)
    {
        this.SearchParkingInfoRealtime = SearchParkingInfoRealtime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SearchParkingInfoRealtime = "+SearchParkingInfoRealtime+"]";
    }
}
