apply plugin: 'com.android.application'
android {
    compileSdkVersion 26
    buildToolsVersion '26.0.2'
    defaultConfig {
        applicationId "nombre.proyecto"
        minSdkVersion 16
        targetSdkVersion 26
        versionCode 4
        versionName "4.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
  }
  buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
         exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:26.+'
    compile 'com.android.support.constraint:constraint-layout:1.0.2'
    testCompile 'junit:junit:4.12'
}
