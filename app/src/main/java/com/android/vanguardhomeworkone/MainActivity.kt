package com.android.vanguardhomeworkone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayoutMediator

//UI
//Toolbar, TabLayout, ViewPager2, RecyclerView, FloatingActionButton
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//여기서부터 플로팅액션버튼 클릭시 토스트 메세지 출력
        var fAB : FloatingActionButton = findViewById(R.id.fAB)

        fAB.setOnClickListener{
            Toast.makeText(this, "플로팅 버튼 클릭", Toast.LENGTH_SHORT).show()
        }
//여기서부터 뷰페이저2와 탭레이아웃 연결
        val tabLayout = view.findViewById(R.id.tabLayout)
        TabLayoutMediator(tabLayout, ViewPager2) { tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }


}
