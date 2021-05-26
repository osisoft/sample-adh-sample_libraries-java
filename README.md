# OSIsoft Cloud Services Java Library Sample

**Version:** 0.0.27-preview

[![Build Status](https://dev.azure.com/osieng/engineering/_apis/build/status/product-readiness/OCS/osisoft.sample-ocs-sample_libraries-java?repoName=osisoft%2Fsample-ocs-sample_libraries-java&branchName=main)](https://dev.azure.com/osieng/engineering/_build/latest?definitionId=2621&repoName=osisoft%2Fsample-ocs-sample_libraries-java&branchName=main)

The Java OCS library is an introductory language-specific examples of programming against OSISoft Cloud Services ([OCS](https://www.osisoft.com/Solutions/OSIsoft-Cloud-Services/)). It is intended as an instructional samples only and is not for production use.

The library is not intended to show every endpoint and every option/parameter for endpoints it has. The library is known to be incomplete.

## Installing the Library Locally

### Using Eclipse

1. Clone a local copy of the GitHub repository.
1. In Eclipse, select `File` > `Import` > `Maven`> `Existing maven project`
1. Select the local copy, and click Finish to add it to your workspace

### Using Command Line

1. Clone a local copy of the GitHub repository.
1. Download `apache-maven-x.x.x.zip` from [http://maven.apache.org](http://maven.apache.org) and extract it.
1. Setting environment variables.
   1. For Java JDK
      1. New User Variable
         1. Variable name - `JAVA_HOME`
         1. Variable value - location to the Java JDK in User variables.
      1. add JDK\bin path to the Path variable in System variables.
   1. For Maven
      1. New User Variable
         1. Variable name - `MAVEN_HOME`
         1. Variable value - location to the extracted folder for the maven `~\apache-maven-x.x.x` in User variables.
      1. add `~\apache-maven-x.x.x\bin` path to the Path variable in System variables.
1. \*Install the ocs_sample_library_preview to your local Maven repo using `mvn install` from `/sample-ocs-sample_libraries-java`

\*Currently this project is not hosted on the central Maven repo and must be compiled and installed locally.

Tests are done by testing the sample apps that use this library.

Developed against Maven 3.6.1 and Java 1.8.0_181.

[OSI Samples](https://github.com/osisoft/OSI-samples) are licensed under the Apache 2 license.

---

For the main OCS sample libraries page [ReadMe](https://github.com/osisoft/OSI-Samples-OCS/blob/main/docs/SAMPLE_LIBRARIES_README.md)  
For the main OCS samples page [ReadMe](https://github.com/osisoft/OSI-Samples-OCS)  
For the main OSIsoft samples page [ReadMe](https://github.com/osisoft/OSI-Samples)
