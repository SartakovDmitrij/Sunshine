package com.udacity.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //fake data for listview
        String[] forecastArray = {
                "Today - Sunny - 12",
                "Tuesday - Sunny - 13",
                "Wednesday - Sunny - 12",
                "Thursday - Sunny - 12",
                "Friday - Sunny - 12",
                "Saturday - Sunny - 12",
                "Sunday - Sunny - 12"
        };

        List<String> weekForecats = new ArrayList<String>(Arrays.asList(forecastArray));

        //adapter for forecast listview
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecats);

        //reference adapter to listview
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listview_forecast = (ListView) view.findViewById(R.id.listview_forecast);
        listview_forecast.setAdapter(mForecastAdapter);

        return view;
    }
}
