package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.littlelemon.menu.KEY.KEY_CATEGORY
import com.littlelemon.menu.KEY.KEY_IMAGE
import com.littlelemon.menu.KEY.KEY_PRICE
import com.littlelemon.menu.KEY.KEY_TITLE

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = intent.getStringExtra(KEY_TITLE)!!
        val price = intent.getDoubleExtra(KEY_PRICE, 0.0)
        val image = intent.getIntExtra(KEY_IMAGE, -1)
        val category = intent.getStringExtra(KEY_CATEGORY)!!
        val productItem =
            ProductItem(title, price, category, image)//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }
}
 object KEY{
    const val KEY_TITLE = "title"
    const val KEY_PRICE = "price"
    const val KEY_IMAGE = "image"
    const val KEY_CATEGORY = "category"
}