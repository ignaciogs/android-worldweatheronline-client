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
 * WeatherResponse class
 *
 * Contains the weather forecast related information
 */
public class WeatherResponse extends AbstractJSONResponse implements Serializable {

    /**
     * Local forecast date, formatted as 'yyyy-MM-dd'. e.g.:- 2008-05-31
     */
    private String date;

    /**
     * Maximum temperature of the day in degree Celsius
     */
    private int tempMaxC;

    /**
     * Maximum temperature of the day in degree Fahrenheit
     */
    private int tempMaxF;

    /**
     * Minimum temperature of the day in degree Celsius
     */
    private int tempMinC;

    /**
     * Minimum temperature of the day in degree Fahrenheit
     */
    private int tempMinF;

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
     * Wind direction
     */
    @JsonProperty("winddirection")
    private String windDirection;

    /**
     * Wind direction
     */
    @JsonProperty("winddir16Point")
    private String windDir16Point;

    /**
     * Weather condition code
     */
    private int weatherCode;

    /**
     * Weather icon url
     */
    private List<BasicValueResponse> weatherIconUrl;

    /**
     * Weather description text
     */
    private List<BasicValueResponse> weatherDesc;

    /**
     * Precipitation amount in millimetre
     */
    @JsonProperty("precipMM")
    private double precipMm;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTempMaxC() {
        return tempMaxC;
    }

    public void setTempMaxC(int tempMaxC) {
        this.tempMaxC = tempMaxC;
    }

    public int getTempMaxF() {
        return tempMaxF;
    }

    public void setTempMaxF(int tempMaxF) {
        this.tempMaxF = tempMaxF;
    }

    public int getTempMinC() {
        return tempMinC;
    }

    public void setTempMinC(int tempMinC) {
        this.tempMinC = tempMinC;
    }

    public int getTempMinF() {
        return tempMinF;
    }

    public void setTempMinF(int tempMinF) {
        this.tempMinF = tempMinF;
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

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
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

    public List<BasicValueResponse> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(List<BasicValueResponse> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public List<BasicValueResponse> getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(List<BasicValueResponse> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }
}
