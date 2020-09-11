
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
TTSUtil ttsUtil = new TTSUtil(context);
  
ttsUtil.setTextTOSpeech("你好啊");

ttsUtil.closeTTS();
```
