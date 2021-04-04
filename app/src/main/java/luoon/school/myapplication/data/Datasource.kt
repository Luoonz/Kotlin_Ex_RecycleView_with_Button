package luoon.school.myapplication.data

import android.provider.Settings.Global.getString
import luoon.school.myapplication.R
import luoon.school.myapplication.model.Affirmation

class Datasource {
    fun loadAffirmation() : List<Affirmation>{
        return listOf<Affirmation>(
            // 아이템별 버튼의 텍스트 값 추가
            Affirmation(R.string.affirmation1, R.drawable.image1,R.string.item_btn),
            Affirmation(R.string.affirmation2, R.drawable.image2,R.string.item_btn),
            Affirmation(R.string.affirmation3, R.drawable.image3,R.string.item_btn),
            Affirmation(R.string.affirmation4, R.drawable.image4,R.string.item_btn),
            Affirmation(R.string.affirmation5, R.drawable.image5,R.string.item_btn),
            Affirmation(R.string.affirmation6, R.drawable.image6,R.string.item_btn),
            Affirmation(R.string.affirmation7, R.drawable.image7,R.string.item_btn),
            Affirmation(R.string.affirmation8, R.drawable.image8,R.string.item_btn),
            Affirmation(R.string.affirmation9, R.drawable.image9,R.string.item_btn),
            Affirmation(R.string.affirmation10, R.drawable.image10,R.string.item_btn)
        )
    }
}