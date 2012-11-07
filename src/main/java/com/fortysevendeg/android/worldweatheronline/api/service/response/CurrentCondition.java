/*
 * Copyright (C) 2012 47 Degrees, LLC
 *  http://47deg.com
 *  hello@47deg.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.fortysevendeg.android.worldweatheronline.api.service.response;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;
import java.util.List;

/**
 * CurrentCondition class
 *
 * Contains the current weather condition forecast related information.
 */
public class CurrentCondition extends AbstractJSONResponse implements Serializable {

    /**
     * Time in UTC hhmm tt format. E.g.:- 06:45 AM or 11:34 PM
     */
    @JsonProperty("observation_time")
    private String observationTime;

    /**
     * Temperature in degree Celsius
     */
    @JsonProperty("temp_C")
    private int tempC;

    /**
     * Wind speed in miles per hour
     */
    @JsonProperty("windspeedMiles")
    private int windSpeedMiles;

    /**
     * Wind speed in kilometre per hour
     */
    @JsonProperty("windspeedKmph")
    private int windSpeedKmph;

    /**
     * Wind direction in degree
     */
    @JsonProperty("winddirDegree")
    private int windDirDegree;

    /**
     * Wind direction in 16-point compass
     */
    @JsonProperty("winddir16Point")
    private String windDir16Point;

    /**
     * Weather condition code
     */
    private int weatherCode;

    /**
     * Weather description text
     */
    private List<BasicValueResponse> weatherDesc;

    /**
     * Weather icon url
     */
     private List<BasicValueResponse> weatherIconUrl;

    /**
     * Precipitation in millimetre
     */
    @JsonProperty("precipMM")
     private double precipMm;

    /**
     * Humidity in percentage
     */
     private double humidity;

    /**
     * Visibility in kilometre (km)
     */
    private int visibility;

    /**
     * Atmospheric pressure in millibars
     */
    private double pressure;

    /**
     * Cloud cover in percentage
     */
    @JsonProperty("cloudcover")
    private double cloudCover;

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public int getWindSpeedMiles() {
        return windSpeedMiles;
    }

    public void setWindSpeedMiles(int windSpeedMiles) {
        this.windSpeedMiles = windSpeedMiles;
    }

    public int getWindSpeedKmph() {
        return windSpeedKmph;
    }

    public void setWindSpeedKmph(int windSpeedKmph) {
        this.windSpeedKmph = windSpeedKmph;
    }

    public int getWindDirDegree() {
        return windDirDegree;
    }

    public void setWindDirDegree(int windDirDegree) {
        this.windDirDegree = windDirDegree;
    }

    public String getWindDir16Point() {
        return windDir16Point;
    }

    public void setWindDir16Point(String windDir16Point) {
        this.windDir16Point = windDir16Point;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<BasicValueResponse> getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(List<BasicValueResponse> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public List<BasicValueResponse> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(List<BasicValueResponse> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }
}
