package com.udacity.android.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException {
        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("list");
        JSONObject jsonObjectDay = jsonArray.getJSONObject(dayIndex);
        JSONObject jsonObjectTemp = (JSONObject) jsonObjectDay.get("temp");
        return jsonObjectTemp.getDouble("max");
    }

}
