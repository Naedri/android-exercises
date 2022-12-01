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

    /**
     * identifier quand le fragment est rattaché à l'activité
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        // cast context to listener
        if(context is OnNextStep0Listener) {
            listener = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_step0, container, false)

        // find TextView
        textView = view.findViewById(R.id.textView)
        // find Button
        nextButton = view.findViewById(R.id.nextButton)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // setText(STEP_0)
        textView.text = STEP_0

        // setButtonListener
        nextButton.setOnClickListener {
            // call listener
            listener?.onNext()

        }
    }

    interface OnNextStep0Listener{
        // add onNext() method
        fun onNext()
    }

}
