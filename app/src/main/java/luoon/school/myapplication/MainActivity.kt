package luoon.school.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import luoon.school.myapplication.adapter.ItemAdapter
import luoon.school.myapplication.data.Datasource
import luoon.school.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 바인딩 객체를 통해 화면 표시
    lateinit var binding : ActivityMainBinding
    val myDataset = Datasource().loadAffirmation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //리사이클 뷰와 어뎁터, 아이템 연결
        binding.recyclerView.adapter = ItemAdapter(this, myDataset)

        binding.recyclerView.setHasFixedSize(true)

    }
}