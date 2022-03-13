WATCHED Lecture URL :
https://www.youtube.com/watch?v=Dnmifx4BSQc&list=PL_XkuR-7VWcuee4kxHgChRvQCmHxcJnfS&index=38&t=723s

https://square.github.io/okhttp/

https://square.github.io/retrofit/

https://nobase-dev.tistory.com/6

https://todaycode.tistory.com/41

https://cliearl.github.io/posts/android/download-json-data-using-retrofit/

https://developer.android.com/kotlin/coroutines?hl=ko


[today error]
- Expecting an element
- Object is not abstract and does not implement abstract member public abstract fun onFailure(call: Call<CenterResponse!>!, t: Throwable!): Unit defined in retrofit2.Callback
- Suspicious size: this will make the view invisible, probably intended for layout_height  Using 0dp as the width in a horizontal LinearLayout with weights is a useful trick to ensure that only the weights (and not the intrinsic sizes) are used when sizing the children.  However, if you use 0dp for the opposite dimension, the view will be invisible. This can happen if you change the orientation of a layout without also flipping the 0dp dimension in all the children.
Class 'CenterAdapter' is not abstract and does not implement abstract base class member public abstract fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CenterAdapter.CenterViewHolder defined in androidx.recyclerview.widget.ListAdapter

- Execution failed for task ':app:compileDebugJavaWithJavac'.
> error: invalid source release: 17

> error: invalid source release: 17

Cause: error: invalid source release: 17

Process: com.example.korea_api, PID: 5476
    java.lang.RuntimeException: Unable to start activity ComponentInfo{com.example.korea_api/com.example.korea_api.MainActivity}: kotlin.UninitializedPropertyAccessException: lateinit property centerAdapter has not been initialized
