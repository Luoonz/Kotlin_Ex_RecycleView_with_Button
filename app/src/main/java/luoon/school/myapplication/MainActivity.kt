package luoon.school.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import luoon.school.myapplication.adapter.ItemAdapter
import luoon.school.myapplication.data.Datasource
import luoon.school.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val myDataset = Datasource().loadAffirmation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = ItemAdapter(this, myDataset)

        binding.recyclerView.setHasFixedSize(true)

    }
}