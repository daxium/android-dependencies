// Kotlin + buildSrc for Better Gradle Dependency Management
// see: https://handstandsam.com/2018/02/11/kotlin-buildsrc-for-better-gradle-dependency-management/

object Version {
    const val androidSdk = 30
    const val androidSdkMin = 21
    const val androidX = "1.0.0"
    const val archComponents = "1.1.1"
    const val archCore = "2.1.0"
    const val databinding = "3.4.1"
    const val dokka = "0.9.17"
    const val espresso = "3.3.0"
    const val gradle = "4.1.3"
    const val junit5 = "5.6.2"
    const val junit4 = "4.13"
    const val koin = "2.0.1"
    const val kotlin = "1.4.31"
    const val kotlinXCoroutines = "1.4.3"
    const val lifecycle = "2.2.0"
    const val lint = "26.6.3"
    const val mockito = "2.2.0"
    const val moshi = "1.8.0"
    const val multidex = "2.0.1"
    const val navigation = "2.3.4"
    const val okHttp = "4.8.1"
    const val permissionsDispatcher = "4.1.0"
    const val picasso = "2.8"
    const val retrofit = "2.9.0"
    const val room = "2.2.5"
    const val rxAndroid = "2.1.0"
    const val rxJava = "2.2.2"
    const val test = "1.3.0"
    const val timber = "4.7.1"
    const val work = "2.4.0"
}


object Dependencies {
    const val gradleTools = "com.android.tools.build:gradle:${Version.gradle}"
    const val desugarJdkLib = "com.android.tools:desugar_jdk_libs:1.1.5"

    // AndroidX
    // see: https://developer.android.com/jetpack/androidx/migrate          for general packages
    // see: https://developer.android.com/kotlin/ktx                        for ktx packages
    // see: https://developer.android.com/training/testing/set-up-project   for test packages
    const val xAnnotation = "androidx.annotation:annotation:1.0.1"
    const val xAppCompat = "androidx.appcompat:appcompat:1.3.0-rc01"
    const val xArchCore = "androidx.arch.core:core:${Version.archCore}"
    const val xArchCoreCommon = "androidx.arch.core:core-common:${Version.archCore}"
    const val xArchCoreRuntime = "androidx.arch.core:core-runtime:${Version.archCore}"
    const val xArchCoreTesting = "androidx.arch.core:core-testing:${Version.archCore}"

    const val xAsyncLayoutInflater = "androidx.asynclayoutinflater:asynclayoutinflater:1.0.0"
    const val xBrowser = "androidx.browser:browser:1.0.0"
    const val xCar = "androidx.car:car:1.0.0-alpha5"
    const val xCardview = "androidx.cardview:cardview:1.0.0"
    const val xCollection = "androidx.collection:collection-ktx:1.0.0"

    const val xConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.2"
    const val xConstraintLayoutSolver = "androidx.constraintlayout:constraintlayout-solver:2.0.2"

    const val xContentpager = "androidx.contentpager:contentpager:1.0.0"
    const val xCoordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
    const val xCore = "androidx.core:core:1.5.0-rc01"
    const val xCoreKtx = "androidx.core:core-ktx:1.5.0-rc01"
    const val xCursorAdapter = "androidx.cursoradapter:cursoradapter:1.0.0"
    const val xCustomView = "androidx.customview:customview:1.0.0"
    const val xDocumentFile = "androidx.documentfile:documentfile:1.0.0"
    const val xDrawerLayout = "androidx.drawerlayout:drawerlayout:1.0.0"
    const val xDynamicAnimation = "androidx.dynamicanimation:dynamicanimation:1.0.0"

    const val xDatabindingAdapters =
        "androidx.databinding:databinding-adapters:${Version.databinding}"
    const val xDatabindingCommon = "androidx.databinding:databinding-common:${Version.databinding}"
    const val xDatabindingCompiler =
        "androidx.databinding:databinding-compiler:${Version.databinding}"
    const val xDatabindingRuntime =
        "androidx.databinding:databinding-runtime:${Version.databinding}"

    const val xEmoji = "androidx.emoji:emoji:1.0.0"
    const val xEmojiAppcompat = "androidx.emoji:emoji-appcompat:1.0.0"
    const val xEmojiBundled = "androidx.emoji:emoji-bundled:1.0.0"

    const val xEspressoAccessibility = "androidx.test.espresso:espresso-accessibility:${Version.espresso}"
    const val xEspressoContrib = "androidx.test.espresso:espresso-contrib:${Version.espresso}"
    const val xEspressoCore = "androidx.test.espresso:espresso-core:${Version.espresso}"
    const val xEspressoIdlingConurrent =
        "androidx.test.espresso.idling:idling-concurrent:${Version.espresso}"
    const val xEspressoIdlingNet = "androidx.test.espresso.idling:idling-net:${Version.espresso}"
    const val xEspressoIdlingResource =
        "androidx.test.espresso:espresso-idling-resource:${Version.espresso}"
    const val xEspressoIntents = "androidx.test.espresso:espresso-intents:${Version.espresso}"
    const val xEspressoRemote = "androidx.test.espresso:espresso-remote:${Version.espresso}"
    const val xEspressoWeb = "androidx.test.espresso:espresso-web:${Version.espresso}"

    const val xExifInterface = "androidx.exifinterface:exifinterface:1.3.1"

    const val xActivity = "androidx.activity:activity-ktx:1.2.1"
    const val xFragment = "androidx.fragment:fragment-ktx:1.3.1"
    const val xFragmentTesting = "androidx.fragment:fragment-testing:1.3.1"
    const val xGridLayout = "androidx.gridlayout:gridlayout:1.0.0"
    const val xHeifWriter = "androidx.heifwriter:heifwriter:1.0.0"
    const val xInterpolator = "androidx.interpolator:interpolator:1.0.0"
    const val xLeanback = "androidx.leanback:leanback:1.0.0"
    const val xLeanbackPreference = "androidx.leanback:leanback-preference:1.0.0"
    const val xPreference = "androidx.preference:preference:1.1.1"

    const val xLegacyCoreUi = "androidx.legacy:legacy-support-core-ui:1.0.0"
    const val xLegacyCoreUtils = "androidx.legacy:legacy-support-core-utils:1.0.0"
    const val xLegacyPreference = "androidx.legacy:legacy-preference-v14:1.0.0"
    const val xLegacyV13 = "androidx.legacy:legacy-support-v13:1.0.0"
    const val xLegacyV4 = "androidx.legacy:legacy-support-v4:1.0.0"

    const val xLifecycleCommon = "androidx.lifecycle:lifecycle-common:${Version.lifecycle}"
    const val xLifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Version.lifecycle}"
    const val xLifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Version.lifecycle}"
    const val xLifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle}"
    const val xLifecycleLivedata = "androidx.lifecycle:lifecycle-livedata:${Version.lifecycle}"
    const val xLifecycleLivedataCore = "androidx.lifecycle:lifecycle-livedata-core:${Version.lifecycle}"
    const val xLifecycleLivedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    const val xLifecycleReactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams:${Version.lifecycle}"
    const val xLifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Version.lifecycle}"
    const val xLifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
    const val xLifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"

    const val xLoader = "androidx.loader:loader:1.0.0"
    const val xLocalBroadcastManager = "androidx.localbroadcastmanager:localbroadcastmanager:1.0.0"
    const val xMaterial = "com.google.android.material:material:1.3.0"
    const val xMedia = "androidx.media:media:1.0.0"
    const val xMedia2 = "androidx.media2:media2:1.0.0-alpha03"
    const val xMedia2Exoplayer = "androidx.media2:media2-exoplayer:1.0.0-alpha01"
    const val xMediaRouter = "androidx.mediarouter:mediarouter:1.0.0"
    const val xMultidex = "androidx.multidex:multidex:${Version.multidex}"

    const val xNavigationFragment = "androidx.navigation:navigation-fragment:${Version.navigation}"
    const val xNavigationUi = "androidx.navigation:navigation-ui:${Version.navigation}"
    const val xNavigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
    const val xNavigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
    const val xNavigationSafeArgsPlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Version.navigation}"
    const val xNavigationTesting = "androidx.navigation:navigation-testing:${Version.navigation}"

    const val xPagingCommon = "androidx.paging:paging-common:2.0.0"
    const val xPagingRuntime = "androidx.paging:paging-runtime:2.0.0"
    const val xPagingRxJava2 = "androidx.paging:paging-rxjava2:2.0.0"

    const val xPalette = "androidx.palette:palette-ktx:1.0.0"
    const val xPercentLayout = "androidx.percentlayout:percentlayout:1.0.0"
    const val xPrint = "androidx.print:print:1.0.0"
    const val xRecommendation = "androidx.recommendation:recommendation:1.0.0"

    const val xRecyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha06"
    const val xRecyclerViewSelection = "androidx.recyclerview:recyclerview-selection:1.0.0"

    const val xRoomCommon = "androidx.room:room-common:${Version.room}"
    const val xRoomCompiler = "androidx.room:room-compiler:${Version.room}"
    const val xRoomGuava = "androidx.room:room-guava:${Version.room}"
    const val xRoomMigration = "androidx.room:room-migration:${Version.room}"
    const val xRoomRuntime = "androidx.room:room-runtime:${Version.room}"
    const val xRoomRxJava2 = "androidx.room:room-rxjava2:${Version.room}"
    const val xRoomTesting = "androidx.room:room-testing:${Version.room}"
    const val xRoomCoroutines = "androidx.room:room-ktx:${Version.room}"

    const val xSecurity = "androidx.security:security-crypto:1.0.0-beta01"
    const val xSliceBuilders = "androidx.slice:slice-builders:1.0.0"
    const val xSliceCore = "androidx.slice:slice-core:1.0.0"
    const val xSliceView = "androidx.slice:slice-view:1.0.0"
    const val xSlidingPaneLayout = "androidx.slidingpanelayout:slidingpanelayout:1.0.0"
    const val xSqlite = "androidx.sqlite:sqlite-ktx:2.0.0"
    const val xSqliteFramework = "androidx.sqlite:sqlite-framework:2.0.0"
    const val xSwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"

    const val xTestCore = "androidx.test:core:${Version.test}"
    const val xTestExtJUnit = "androidx.test.ext:junit:1.1.2"
    const val xTestExtTruth = "androidx.test.ext:truth:1.0.0"
    const val xTestMonitor = "androidx.test:monitor:${Version.test}"
    const val xTestOrchestrator = "androidx.test:orchestrator:${Version.test}"
    const val xTestRules = "androidx.test:rules:${Version.test}"
    const val xTestRunner = "androidx.test:runner:${Version.test}"
    const val xTestServices = "androidx.test:test-services:${Version.test}"
    const val xTestTruth = "com.google.truth:truth:0.43"

    // testing
    const val junit5 = "org.junit.jupiter:junit-jupiter-api:${Version.junit5}"
    const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Version.junit5}"
    const val junitParams = "org.junit.jupiter:junit-jupiter-params:${Version.junit5}"
    const val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Version.mockito}"
    const val robolectric = "org.robolectric:robolectric:3.8"


    const val xTestUiAutomator = "androidx.test.uiautomator:uiautomator:2.2.0"
    const val xTextClassifier = "androidx.textclassifier:textclassifier:1.0.0"
    const val xTransition = "androidx.transition:transition:1.0.1"
    const val xTvProvider = "androidx.tvprovider:tvprovider:1.0.0"
    const val xVectorDrawable = "androidx.vectordrawable:vectordrawable:1.0.1"
    const val xVectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.0.0"
    const val xVersionedParcelable = "androidx.versionedparcelable:versionedparcelable:1.0.0"
    const val xViewPager = "androidx.viewpager2:viewpager2:1.0.0"
    const val xWear = "androidx.wear:wear:1.0.0"
    const val xWebkit = "androidx.webkit:webkit:1.0.0"
    const val xWorkJava = "androidx.work:work-runtime:${Version.work}"
    const val xWork = "androidx.work:work-runtime-ktx:${Version.work}"
    const val xWorkTest = "androidx.work:work-testing:${Version.work}"

    // Play Services
    const val playServicesGCM = "com.google.android.gms:play-services-gcm:17.0.0"
    const val playServicesLoc = "com.google.android.gms:play-services-location:17.0.0"
    const val playServicesMaps = "com.google.android.gms:play-services-maps:17.0.0"
	const val playServicesUtils = "com.google.maps.android:android-maps-utils:0.5"
    const val playCore = "com.google.android.play:core:1.6.5"

    // Firebase (each one may have different versions, see: https://firebase.google.com/docs/android/setup?authuser=1#available_libraries)
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics:17.2.0"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging:21.0.0"

    // Kotlin
    const val dokkaGradlePlugin = "org.jetbrains.dokka:dokka-gradle-plugin:${Version.dokka}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinXCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.kotlinXCoroutines}"
    const val kotlinCoroutineTest  = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.kotlinXCoroutines}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"

    // Koin
    const val koinAndroid = "org.koin:koin-android:${Version.koin}"
    const val koinAndroidXScope = "org.koin:koin-androidx-scope:${Version.koin}"
    const val koinAndroidViewModel = "org.koin:koin-android-viewmodel:${Version.koin}"
    const val koinTest = "org.koin:koin-test:${Version.koin}"

    // linting
    const val lint = "com.android.tools.lint:lint:${Version.lint}"
    const val lintApi = "com.android.tools.lint:lint-api:${Version.lint}"
    const val lintTests = "com.android.tools.lint:lint-tests:${Version.lint}"

    // Square++ stuff
    const val moshi = "com.squareup.moshi:moshi:${Version.moshi}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Version.moshi}"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Version.moshi}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Version.moshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Version.okHttp}"
    const val picasso = "com.squareup.picasso:picasso:${Version.picasso}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitCoroutines = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
    const val timber = "com.jakewharton.timber:timber:${Version.timber}"

    // Permissions dispatcher
    const val permissionsDispatcher = "com.github.hotchemi:permissionsdispatcher:${Version.permissionsDispatcher}"
    const val permissionsDispatcherProcessor = "com.github.hotchemi:permissionsdispatcher-processor:${Version.permissionsDispatcher}"
}
