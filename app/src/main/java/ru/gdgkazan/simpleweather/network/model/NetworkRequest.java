package ru.gdgkazan.simpleweather.network.model;

import android.support.annotation.StringDef;


@StringDef({NetworkRequest.CITY_WEATHER})
public @interface NetworkRequest {

    String CITY_WEATHER = "city_weather";

}
