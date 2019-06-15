package com.padc.recipedetailsscreenconstraintandtablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class InfoFragment : Fragment(){

    companion object {

        fun getFragment() : InfoFragment{
            return  InfoFragment()
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_info,container,false)
        return view
    }
}