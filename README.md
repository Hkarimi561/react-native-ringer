# react-native-ringer (android-only)

Simple API to change the ringer in react native (anroid only)

[![npm version](https://img.shields.io/npm/v/react-native-ringer.svg?style=flat-square)](https://www.npmjs.com/package/react-native-ringer)
[![npm downloads](https://img.shields.io/npm/dm/react-native-ringer.svg?style=flat-square)](https://www.npmjs.com/package/react-native-ringer)

This Code Is No Longer Being Maintained.

It works (at least for the react-native version it was built for) and as that it will be left here. 

If anyone wants to maintain the code, I will gladly transfer ownership.

## Installation
`npm install react-native-ringer`

## Android Installation
In your `AndroidManifest.xml`

```xml
    <uses-permission android:name="android.permission.ACCESS_NOTIFICATION_POLICY" />
```

In `android/settings.gradle`
```
include ':RNRinger'
project(':RNRinger').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-ringer/android')
```

In `android/app/build.gradle`

```
dependencies {
    ...
    compile project(':RNRinger')
}
```

Register module (in `MainApplication.java`)

```java
import com.lcd344.RNRinger.RNRingerPackage;  // <--- Import

public class MainApplication extends Application implements ReactApplication {

	private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
  		......

	      /**
	     * A list of packages used by the app. If the app uses additional views
	     * or modules besides the default ones, add more packages here.
	     */
	    @Override
	    protected List<ReactPackage> getPackages() {
	        ...
	        return Arrays.<ReactPackage>asList(
                 new MainReactPackage(),
                 new RNRingerPackage() // Add this line
	        );
	    }
	};
	......
	@Override
	public ReactNativeHost getReactNativeHost() {
    	return mReactNativeHost;
	}
};

```

## Android Usage

In your `index.android.js`:
```javascript

import RNRinger from 'react-native-ringer';


    RNRinger.normal(); // normal ringer mode
    RNRinger.vibrate(); // vibrate mode
    RNRinger.silent(); // silent mode

```

## TODO
 * [ ] IOS Support - I do not currently own a mac - so anyone who could offer help on this is welcome.
 * [ ] Any Suggestions?
