package luoon.school.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import luoon.school.myapplication.R
import luoon.school.myapplication.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        // 아이템 버튼 위젯을 뷰 홀더에 연결
        val btn: Button = view.findViewById(R.id.item_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

        // 뷰 홀더의 버튼 위젯이 가진 Text 속성을 list 의 index(position 파라미터) + 1 로 변경
        // itme.stringResBtn -> R.string.item_btn -> Button %s -> Button 1, Button 2, ㆍㆍㆍ
        holder.btn.setText(context.resources.getString(item.stringResBtn, position+1))

        // 버튼별 클릭이벤트 부여
        holder.btn.setOnClickListener {
            // 뷰홀더에 저장된 text 의 값 호출
            Toast.makeText(context, "You See that \"" + holder.textView.text.toString() + "\"On my App", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
        // dsf
    }
}