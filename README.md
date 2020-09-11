
```java
allprojects {
    	repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


```java
dependencies {
            implementation 'com.github.kimfengzj:TTSUnit:Tag'
	}
```


```java
TTSUtil ttsUtil = new TTSUtil(getApplicationContext());
  
ttsUtil.setTextTOSpeech("你好啊");
```
