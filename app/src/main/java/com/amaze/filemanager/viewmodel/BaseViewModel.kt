package com.amaze.filemanager.viewmodel

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory

open class BaseViewModel: ViewModel() {

  companion object {
    fun getViewModelProvider(activity: AppCompatActivity) : ViewModelProvider {
      return ViewModelProvider(activity, AndroidViewModelFactory(activity.application))
    }
  }
}