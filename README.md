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

Comming soon!

# License

Copyright (C) 2012 47 Degrees, LLC
http://47deg.com
hello@47deg.com

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

# Terms of Service

Make sure to consult the World Weather Online [Terms and Conditions](http://www.worldweatheronline.com/terms-and-conditions.aspx) for applicable restrictions for usage of the API.