plugins {
    id("com.android.application")
    id("kotlin-android")
    // Flutter Gradle 插件必须在 Android 和 Kotlin 插件之后应用
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    // 这里的 Namespace 是你自己的包名
    namespace = "com.example.voice_diary"
    
    // 强制手动指定为 36，解决 lStar 找不到的问题
    compileSdk = 36
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.example.voice_diary"
        
        // Isar 建议最低版本为 21
        minSdk = flutter.minSdkVersion
        
        // 强制手动指定为 34
        targetSdk = 34
        
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // 目前使用调试签名以便测试 release 编译
            signingConfig = signingConfigs.getByName("debug")
            
            // 如果后续要正式发布，可以在这里配置正式签名
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }
}

flutter {
    source = "../.."
}
