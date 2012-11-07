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
 * DataResponse class
 */
public class DataResponse extends AbstractJSONResponse implements Serializable {

    /**
     * Contains the current weather condition forecast related information.
     */
    @JsonProperty("current_condition")
    private List<CurrentCondition> currentConditionList;

    /**
     * Contains the information about type of request made by user
     */
    private List<RequestResponse> request;

    /**
     * Contains the weather forecast related information
     */
    @JsonProperty("weather")
    private List<WeatherResponse> weatherList;

    public List<CurrentCondition> getCurrentConditionList() {
        return currentConditionList;
    }

    public void setCurrentConditionList(List<CurrentCondition> currentConditionList) {
        this.currentConditionList = currentConditionList;
    }

    public List<RequestResponse> getRequest() {
        return request;
    }

    public void setRequest(List<RequestResponse> request) {
        this.request = request;
    }

    public List<WeatherResponse> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<WeatherResponse> weatherList) {
        this.weatherList = weatherList;
    }
}
