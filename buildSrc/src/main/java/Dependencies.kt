object Dependencies {
    val coreKtx by lazy {
    "androidx.core:core-ktx:${Versions.coreKtx}"
    }
    val lifeKtx by lazy {
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeKtx}"
    }
    val activityCompose by lazy {
        "androidx.activity:activity-compose:${Versions.activityCompose}"
    }
    val Compose by lazy {
        "androidx.compose:compose-bom:${Versions.Compose}"
    }
    val uiCompose by lazy {
        "androidx.compose.ui:ui"
    }
    val graphicsCompose by lazy {
        "androidx.compose.ui:ui-graphics"
    }
    val previewCompose by lazy {
        "androidx.compose.ui:ui-tooling-preview"
    }
    val materialCompose by lazy {
        "androidx.compose.material3:material3"
    }
    val jUnit by lazy {
        "junit:junit:${Versions.jUnit}"
    }
    val jUnitTest by lazy {
        "androidx.test.ext:junit:${Versions.jUnitTest}"
    }
    val Espresso by lazy {
        "androidx.test.espresso:espresso-core:${Versions.Espreso}"
    }
    val composeTooling by lazy {
        "androidx.compose.ui:ui-tooling"
    }
    val composeTestManifest by lazy {
        "androidx.compose.ui:ui-test-manifest"
    }
    val composeUiTestJUnit by lazy {
        "androidx.compose.ui:ui-test-junit4"
    }
    val hilt by lazy {
        "com.google.dagger:hilt-android:${Versions.hilt}"
    }
    val hiltCompiler by lazy {
        "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }
    val hiltNavCompose by lazy {
        "androidx.hilt:hilt-navigation-compose:${Versions.hilt_nav_compose}"
    }
    val retrofit by lazy {
        "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    }
    val okhttp by lazy {
        "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    }
    val moshi by lazy {
        "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    }
    val moshiConverter by lazy{
        "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}"
    }
    val gsonConveter by lazy {
        "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    }
    val logingIntercepter by lazy {
        "com.squareup.okhttp3:logging-interceptor:${Versions.logingInterCepter}"
    }
    val corutineCore by lazy {
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.corutineCore}"
    }
    val corutineAndroid by lazy {
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.corutineAndroid}"
    }
    val splashScreen by lazy {
        "androidx.core:core-splashscreen:${Versions.splashScreen}"
    }
    val coil by lazy {
        "io.coil-kt:coil-compose:${Versions.coil}"
    }



}
object Modules{
    const val utilities=":utilities"
}