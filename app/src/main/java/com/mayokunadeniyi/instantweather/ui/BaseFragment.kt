package com.mayokunadeniyi.instantweather.ui

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.mayokunadeniyi.instantweather.di.Injectable
import javax.inject.Inject

/**
 * Created by Mayokun Adeniyi on 02/02/2021.
 */

abstract class BaseFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactoryProvider: ViewModelProvider.Factory


    fun showSnackBar(message: String){
        Snackbar.make(requireView(),message,Snackbar.LENGTH_SHORT).show()
    }

}