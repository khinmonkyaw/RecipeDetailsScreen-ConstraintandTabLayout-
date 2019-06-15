package com.padc.recipedetailsscreenconstraintandtablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class VideoFragment : Fragment() {


    companion object {

        fun getFragment() : VideoFragment{
            return  VideoFragment()
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_video,container,false)
        return view
    }
}