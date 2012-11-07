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

package com.fortysevendeg.android.worldweatheronline.api.service.impl;

import com.fortysevendeg.android.worldweatheronline.api.service.WorldWeatherOnlineApiClient;
import com.fortysevendeg.android.worldweatheronline.api.service.request.Query;
import com.fortysevendeg.android.worldweatheronline.api.service.response.WorldWeatherOnlineResponse;
import it.restrung.rest.client.APIDelegate;
import it.restrung.rest.client.RestClient;
import it.restrung.rest.client.RestClientFactory;

/**
 * @see com.fortysevendeg.android.worldweatheronline.api.service.WorldWeatherOnlineApiClient
 */
public class WorldWeatherOnlineApiClientImpl implements WorldWeatherOnlineApiClient {

    private RestClient client = RestClientFactory.getClient();

    private String endpoint = "http://free.worldweatheronline.com/feed/weather.ashx?";

    private String getEndpoint(String path) {
        return String.format("%s%s", endpoint, path);
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public void query(APIDelegate<WorldWeatherOnlineResponse> delegate, String apiKey, int numberOfDays, Query query) {
        client.getAsync(delegate, getEndpoint("format=json&num_of_days=%s&key=%s&q=%s"), String.valueOf(numberOfDays), apiKey, query.getValue());
    }
}
