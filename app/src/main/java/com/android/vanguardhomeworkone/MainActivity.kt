package com.android.vanguardhomeworkone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayoutMediator

//UI
//Toolbar, TabLayout, ViewPager2, RecyclerView, FloatingActionButton
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//여기서부터 플로팅액션버튼 클릭시 토스트 메세지 출력
        var fAB: FloatingActionButton = findViewById(R.id.fAB)

        fAB.setOnClickListener {
            Toast.makeText(this, "플로팅 버튼 클릭", Toast.LENGTH_SHORT).show()
        }

//여기서부터 탭레이아웃
        val Tablay: View? = findViewById(R.id.tabLayout)
        var click1 = findViewById<TabItem>(R.id.tab1)
        var click2 = findViewById<TabItem>(R.id.tab2)

        try {
            click1.setOnClickListener{
                Toast.makeText(this, "레이아웃 버튼 클릭", Toast.LENGTH_SHORT).show()
            }
        }catch (e:NullPointerException){
            Toast.makeText(this, "1번 테스트", Toast.LENGTH_SHORT).show()
        }
        finally {

        }
        try {
            click2.setOnClickListener{
                Toast.makeText(this, "레이아웃 버튼 클릭", Toast.LENGTH_SHORT).show()
            }
        }catch (e:NullPointerException){
            Toast.makeText(this, "2번 테스트", Toast.LENGTH_SHORT).show()
        }
        finally {

        }
    }
}


