plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.settings.access"
    compileSdk = 35

    defaultConfig {
        applicationId = "app.settings.access"
        minSdk = 23
        targetSdk = 35
        versionCode = providers.gradleProperty("appVersionCode").getOrElse("2").toInt()
        versionName = providers.gradleProperty("appVersionName").getOrElse("1.1")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        buildConfig = false
    }
}
