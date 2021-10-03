package fr.android.androidexercises

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Step0Fragment : Fragment() {

    companion object {
        private const val STEP_0 = "This is step 0"
    }

    private lateinit var textView: TextView
    private lateinit var nextButton: Button

    private var listener: OnNextStep0Listener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // TODO cast context to listener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_step0, container, false)

        // TODO find TextView
        // TODO find Button

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO setText(STEP_0)

        // TODO setButtonListener
        nextButton.setOnClickListener {
            // TODO call listener
        }
    }

    interface OnNextStep0Listener// TODO add onNext() method

}
