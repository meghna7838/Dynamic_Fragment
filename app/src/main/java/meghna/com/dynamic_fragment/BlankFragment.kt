package meghna.com.dynamic_fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_blank.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var list=arrayOf("")
        val text = arguments?.getString("NAME")
        if(text == "CAR")
        {
            list = arrayOf("M","A","R","V","E","L")
        }
        else
        {
            list = arrayOf("D","A","R","C","E","L")
        }
        lv.adapter= ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_expandable_list_item_1,
            list
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_blank, container, false)



}
