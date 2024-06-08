plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.ashin.newsinshort"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ashin.newsinshort"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifeKtx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.Compose))
    implementation(Dependencies.uiCompose)
    implementation(Dependencies.graphicsCompose)
    implementation(Dependencies.previewCompose)
    implementation(Dependencies.materialCompose)
    testImplementation(Dependencies.jUnit)
    androidTestImplementation(Dependencies.jUnitTest)
    androidTestImplementation(Dependencies.Espresso)
    androidTestImplementation(platform(Dependencies.Compose))
    androidTestImplementation(Dependencies.composeUiTestJUnit)
    debugImplementation(Dependencies.composeTooling)
    debugImplementation(Dependencies.composeTestManifest)
    implementation(project(Modules.utilities))
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)
    implementation(Dependencies.hiltNavCompose)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.logingIntercepter)
    implementation(Dependencies.gsonConveter)
    implementation(Dependencies.corutineCore)
    implementation(Dependencies.corutineAndroid)
    implementation(Dependencies.splashScreen)
    implementation(Dependencies.coil)

}
  kapt{
      correctErrorTypes=true
  }