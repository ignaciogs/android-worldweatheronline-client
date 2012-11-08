android-worldweatheronline-client
=================================

Android client library to the [world weather online service](http://www.worldweatheronline.com/free-weather-feed.aspx)

# Introduction

Android-worldweatheronline-client was born out of the need to provide an easy interface for Android apps @ [47 Degrees](http://47deg.com) to interface with World Weather Online API. Contributions and constructive feedback are always welcome.

Android-worldweatheronline-client uses the open source [RESTrung](https://github.com/47deg/restrung) library for getting data from the World Weather Online API.

# Download

## Maven Dependency

Android-worldweatheronline-client may be automatically imported into your project if you already use [Maven](http://maven.apache.org/). Just declare Android-worldweatheronline-client as a maven dependency.
If you wish to always use the latest unstable snapshots, add the Sonatype repository where the snapshot artifacts are being deployed.
Official releases will be made available at Maven Central.

```xml
<repository>
    <id>sonatype</id>
    <url>https://oss.sonatype.org/content/groups/public/</url>
    <releases>
        <enabled>true</enabled>
        <updatePolicy>daily</updatePolicy>
        <checksumPolicy>fail</checksumPolicy>
    </releases>
    <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
        <checksumPolicy>ignore</checksumPolicy>
    </snapshots>
</repository>

<dependency>
    <groupId>com.fortysevendeg.android</groupId>
    <artifactId>android-worldweatheronline-client</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
## Other Downloads

You can get the releases, snapshots and other forms in which Android-worldweatheronline-client is distributed from the [Downloads](https://github.com/47deg/android-worldweatheronline-client/downloads) page.

# Usage

This library has a single method called "query". This method returns a WorldWeatherOnlineResponse class with all of the data from the World Weather Online API.

```java
void query(APIDelegate<WorldWeatherOnlineResponse> delegate,
           String apiKey,
           int numberOfDays,
           Query query);
```

## Parameters

### ApiKey

Your API key for World Weather Online API. [Get one here](http://www.worldweatheronline.com/register.aspx)

### numberOfDays

Changes the number of day forecast you need (For free API users it is maximum 3)

### query

 The location for which you want weather information

City and Country name
 ```java
Query.cityCountry("Sydney", "Australia");
```

IP address
```java
Query.ipAddress("101.25.32.325");
```

UK or Canada Postal Code or US Zipcode
```java
Query.zipCode("90201");
```

Latitude,Longitude
```java
Query.latLng(48.834, 2.394);
```

## Examples of use

In this example we are going to retreive 3 day weather by UK Postcode SW1

```java
WorldWeatherOnlineApiProvider.getClient().query(new ContextAwareAPIDelegate<WorldWeatherOnlineResponse>(MyActivity.this,
          WorldWeatherOnlineResponse.class, RequestCache.LoadPolicy.NEVER, RequestCache.StoragePolicy.DISABLED) {
     @Override
     public void onResults(WorldWeatherOnlineResponse worldWeatherOnlineResponse) {
           Toast.makeText(MyActivity.this, worldWeatherOnlineResponse.getData().getCurrentConditionList().get(0).getWeatherDesc().get(0).getValue(), Toast.LENGTH_LONG).show();
     }

     @Override
     public void onError(Throwable e) {

     }
}, ApiKey, 3, Query.zipCode("SW1"));
```

In this example we are going to retreive conditions for 1 day for Latitude 48.85 and Longitude 2.35 (Paris, France)

```java
WorldWeatherOnlineApiProvider.getClient().query(new ContextAwareAPIDelegate<WorldWeatherOnlineResponse>(MyActivity.this,
          WorldWeatherOnlineResponse.class, RequestCache.LoadPolicy.NEVER, RequestCache.StoragePolicy.DISABLED) {
     @Override
     public void onResults(WorldWeatherOnlineResponse worldWeatherOnlineResponse) {
          Toast.makeText(MyActivity.this, worldWeatherOnlineResponse.getData().getCurrentConditionList().get(0).getWeatherDesc().get(0).getValue(), Toast.LENGTH_LONG).show();
     }

     @Override
     public void onError(Throwable e) {

     }
}, ApiKey, 1, Query.latLng(48.85, 2.35));
```

Example with Android LocationManager

```java
....
....
....
private LocationManager locationManager;
....
....
....
locationManager = (LocationManager) this.getSystemService(getApplicationContext().LOCATION_SERVICE);
Criteria locationCriteria = new Criteria();
locationManager.requestLocationUpdates(locationManager.getBestProvider(locationCriteria, true), 0, 20, locationListener);
....
....
....
LocationListener locationListener = new LocationListener() {
     public void onLocationChanged(Location location) {
          WorldWeatherOnlineApiProvider.getClient().query(new ContextAwareAPIDelegate<WorldWeatherOnlineResponse>(MyActivity.this,
                    WorldWeatherOnlineResponse.class, RequestCache.LoadPolicy.NEVER, RequestCache.StoragePolicy.DISABLED) {
               @Override
               public void onResults(WorldWeatherOnlineResponse worldWeatherOnlineResponse) {
                    Toast.makeText(MyActivity.this, worldWeatherOnlineResponse.getData().getCurrentConditionList().get(0).getWeatherDesc().get(0).getValue(), Toast.LENGTH_LONG).show();
               }

               @Override
               public void onError(Throwable e) {

               }
          }, ApiKey, 1, Query.latLng(location.getLatitude(), location.getLongitude()));
     }

     public void onStatusChanged(String provider, int status, Bundle extras) {
     }

     public void onProviderEnabled(String provider) {
     }

     public void onProviderDisabled(String provider) {
     }
};
....
....
....
```


# License

Copyright (C) 2012 47 Degrees, LLC
http://47deg.com
hello@47deg.com

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

# Terms of Service

Make sure to consult the World Weather Online [Terms and Conditions](http://www.worldweatheronline.com/terms-and-conditions.aspx) for applicable restrictions for usage of the API.