package meghna.com.dynamic_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle=Bundle()
        button.setOnClickListener {
            bundle.putString("NAME","CAR")
            val frag=BlankFragment()
            frag.arguments=bundle
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,frag).commit()


        }
        button2.setOnClickListener {
            bundle.putString("NAME","BIKE")
            val frag = BlankFragment()
            frag.arguments =bundle
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,frag).commit()
        }
    }
}
