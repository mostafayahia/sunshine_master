package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by yahia on 7/13/16.
 */

/**
 * this fragment used by the main activity
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // create an string array to use it later in the array list to use it in array adapter
        final String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/46",
                "Weds - Cloudy - 72/63",
                "Fri - Foggy - 70/46",
                "Sat - Sunny - 76/68"
        };
        // create array list and then adding the data to it
        final ArrayList<String> weekForecast = new ArrayList<String>();
        for (String string : forecastArray)
            weekForecast.add(string);

        String string2 = "hi";

        // create array adapter using the week forecast and some other parameter help them
        // to create layout for each list item in the list view
        mForecastAdapter = new ArrayAdapter(getActivity(),
                R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast );


        // getting the list view reference from its id using root view of this fragment
        // then set its adapter
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
