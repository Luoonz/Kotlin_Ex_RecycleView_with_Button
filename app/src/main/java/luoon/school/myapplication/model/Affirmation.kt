package luoon.school.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// 버튼 항목 추가
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId : Int, @StringRes val stringResBtn : Int){

}