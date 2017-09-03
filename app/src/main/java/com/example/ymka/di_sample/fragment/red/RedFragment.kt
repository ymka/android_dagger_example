package com.example.ymka.di_sample.fragment.red

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.R
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by Alexander Kondenko.
 */
class RedFragment : Fragment() {

    @Inject
    lateinit var presenter: RedPresenter

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Logger.log("Attach RedFragment::class")
        AndroidInjection.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle?): View {
        Logger.log("Create view RedFragment::class")
        presenter.name
        return inflater.inflate(R.layout.fragment_red, container, false)
    }
}