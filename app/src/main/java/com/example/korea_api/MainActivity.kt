package com.example.korea_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.korea_api.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val centerAdapter by lazy {
        CenterAdapter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerViews.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = centerAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        binding.btnAdd.setOnClickListener {
            retrofitWork()
        }

    }

    private fun retrofitWork() {
        val service = CenterApi.centerInterface
        // enqueue : request를 백그라운드 스레드에서 / response 콜백은 메인스레드에서 처리
//        service.getCenterData(getString(R.string.apikey), "json")
//            .enqueue(object :Callback<CenterResponse>{
//                override fun onResponse(
//                    call: Call<CenterResponse>,
//                    response: Response<CenterResponse>
//                ) {
//                    if (response.isSuccessful) {
////                        Log.d("TAG", response.body().toString())
//                        val result = response.body()?.tBGGSCREECLSTM?.get(1)?.row
//                        centerAdapter.submitList(result!!)
//                    }
//                }
//
//                override fun onFailure(call: Call<CenterResponse>, t: Throwable) {
//                    Log.d("TAG", t.message.toString())
//                }
//            })
        // Coroutine version
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getDataCon(getString(R.string.apikey), "json")

            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    val result = response.body()?.tBGGSCREECLSTM?.get(1)?.row
                    result?.let {
                        centerAdapter.submitList(it)
                    }
                } else {
                    Log.d("TAG", response.code().toString())
                }
            }
        }
    }
}