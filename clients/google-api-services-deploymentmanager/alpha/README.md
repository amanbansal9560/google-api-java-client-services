# Google Cloud Deployment Manager Alpha API Client Library for Java

The Deployment Manager API allows users to declaratively configure, deploy and run complex solutions on the Google Cloud Platform.

This page contains information about getting started with the Google Cloud Deployment Manager Alpha API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Cloud Deployment Manager Alpha API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Cloud Deployment Manager Alpha API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-deploymentmanager</artifactId>
      <version>alpha-rev20181207-1.30.9</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```gradle
repositories {
  mavenCentral()
}
dependencies {
  compile 'com.google.apis:google-api-services-deploymentmanager:alpha-rev20181207-1.30.9'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-deploymentmanager/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/deploymentmanager/v1/
