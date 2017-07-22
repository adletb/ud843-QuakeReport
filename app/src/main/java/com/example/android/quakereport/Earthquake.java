package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.magnitude;

/**
 * Created by Adlet on 14.07.2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

     /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     *  Return the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }
    /**
     *  Return the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }
    /**
     *  Return the date of the earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
