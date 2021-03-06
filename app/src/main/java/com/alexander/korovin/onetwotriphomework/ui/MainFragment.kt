package com.alexander.korovin.onetwotriphomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.alexander.korovin.onetwotriphomework.R
import com.alexander.korovin.onetwotriphomework.viewmodels.MainViewModel

class MainFragment : Fragment() {

    private  val viewModel: MainViewModel = ViewModelProvider(this).get(
        MainViewModel::class.java)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}
