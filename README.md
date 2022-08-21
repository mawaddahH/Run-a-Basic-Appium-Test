# Run-a-Basic-Appium-Test
Assignment 3 W11D2 - SDA - Software QA Bootcamp


# Table of contents
* [Question](#question)
* [Answer With Output Screenshots](#answer-with-output-screenshots)
  * [Set up](#set-up)
  * [STEP 1: Create a Project](#step-1-create-a-project)
  * [STEP 2 - STEP 3](#step-2---step-3)
  * [STEP 4: Create a Java class](#step-4-create-a-java-class)
  * [STEP 5: Running the Test case.](#step-5-running-the-test-case)

---
# Question
Create a simple program in Appium to test an android application.

- STEP 1: Create a Project
- STEP 2: Add the Appium jars to your project
- STEP 3: Click on the build Gradle in the App
- STEP 4: Create a Java class
- STEP 5: Running the Test case.

---

# Answer With Output Screenshots
## Set up
Before running the code, there are some steps that need to take considered:

### First:
Download and install:
- [JDK](https://www.oracle.com/java/technologies/downloads/) (Lastest)
- [Eclipse](https://www.eclipse.org/) (Lastest)
- [Android Studio](https://developer.android.com/studio) (Lastest)
- [Appium Desktop](https://github.com/appium/appium-desktop/releases/tag/v1.22.3-4) (Lastest)
- [Appium Inspector](https://github.com/appium/appium-inspector/releases) (Lastest)
- [Node](https://nodejs.org/en/) (Lastest)



### Second:
Setup System Environment variables
- JAVA_HOME
- ANDROID_HOME
- platform tool
- Build tool
- tool
- node
- nmp

#### Check this [Reference](https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux) to know how to use the Path

#### Your system path should have as shown below

<p align="center">

<img src="https://user-images.githubusercontent.com/48597284/185808789-558650e2-2ce9-490b-823d-112a1868264e.png" width=40% height=40%>
  
</p>

#### Install and start the Appium Server via Node

To install appium v2 run this command, window users please open your terminal in admin mode
```md
npm install -g appium@next
```

#### Check setup via below commands
```md
appium -v
```

```md
node -v
```

```md
java -version
```

```md
echo %JAVA_HOME%
```

```md
echo %ANDROID_HOME%
```

```md
adb
```


<p align="center">

<img src="https://user-images.githubusercontent.com/48597284/185808882-36afbecf-8779-4d64-b59d-7c61adc9166b.png" width=60% height=60%>
  
</p>


### Third:
1. Set up the [Emulator](https://www.swtestacademy.com/how-to-run-arm-apk-on-x86-systems/) or [Hardware Device](https://developer.android.com/studio/run/device)

I used my hrdware device

<p align="center">

<img src="https://user-images.githubusercontent.com/48597284/185809066-0ea7e920-0195-4641-a4c6-7e3b1287b142.png" width=40% height=40%>
  
</p>

2. Set up the Appuim Desktop configuration
<p align="center">

<img src="https://user-images.githubusercontent.com/48597284/185809147-da67f0e8-64de-4e6f-a6cd-41fbc1965dda.png" width=60% height=60%>
  
</p>

3. Set up the Appuim Inspector
- `appium:appium.app`: C:\Users\lo0ol\Downloads\Collect-data-Application.apk
- `appium:automationName`: UiAutomator2
- `appium:deviceName`: samsung SM-G965F
- `appium:platformName`: Android
- `appium:platformVersion`: 10

<p align="center">

<img src="https://user-images.githubusercontent.com/48597284/185809307-26c04246-f3ea-4067-8800-3a9aa1f1a27c.png" width=80% height=80%>
  
</p>

---

## STEP 1: Create a Project
- _Eclipse > Create project -> New maven project -> maven-archetype-quickstart (1.4)(this gives you a maven template to begin work with-> Group ID n Artifact ID is a must for maven projects  (so appium can uniquely identify your project). The group ID is like a package name and Artifact Id is like a project name_.

<p align="center">

https://user-images.githubusercontent.com/48597284/185809938-174b9e27-c1f6-406f-bdb0-912ebdbb80e0.mp4
  
</p>

---

## STEP 2 - STEP 3
Open pom.xml and add latest [Java Client](https://mvnrepository.com/artifact/io.appium/java-client) dependency.
remove junit and replace it with [TestNG](https://mvnrepository.com/artifact/org.testng/testng) dependency 

The Final dependencies looks like:
```md
  <dependencies>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.6.1</version>
</dependency>

<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>8.1.1</version>
</dependency>
  </dependencies>
```


<p align="center">
  
https://user-images.githubusercontent.com/48597284/185810928-d9daae8d-7ac1-48a6-bf09-669a398978b7.mp4

  
</p>

---

## STEP 4: Create a Java class
<p align="center">
  
https://user-images.githubusercontent.com/48597284/185811127-e64c5087-9c67-4f81-9fab-6a20b014a153.mp4

  
</p>

---

## STEP 5: Running the Test case.

I used `UiAutomator2Options` class, Then I set the device name, app path

```md
UiAutomator2Options options = new UiAutomator2Options();
options.setDeviceName("23b9cb400c1c7ece");
options.setApp("C:\\Users\\lo0ol\\Downloads\\Collect-data-Application.apk");
```


Set the Host and port for the android driver
```md
AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
```

 1. Start the Appium Server
 2. Run the Java class
 3. Start Appium Inspector session


<p align="center">
  

https://user-images.githubusercontent.com/48597284/185812587-99cd15dc-6d6c-4421-a895-713aecfa8716.mp4


</p>
