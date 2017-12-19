package com.example.ymka.di_sample.fragment.green

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
class GreenFragment : Fragment() {

    @Inject
    lateinit var presenter: GreenPresenter

    override fun onAttach(context: Context?) {
        Logger.log("Attach GreenFragment::class")
        AndroidInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle?): View {
        Logger.log("Create view GreenFragment::class")
        presenter.name
        return inflater.inflate(R.layout.fragment_green, container, false)
    }
}
