package com.amaze.filemanager.viewmodel

import androidx.appcompat.app.AppCompatActivity
import com.amaze.filemanager.adapters.data.LayoutElementParcelable
import com.amaze.filemanager.file_operations.filesystem.OpenMode
import java.util.*

class MainFragmentViewModel: BaseViewModel() {

  private var CURRENT_PATH = ""
  private var openMode = OpenMode.UNKNOWN.ordinal

  /** This is not an exact copy of the elements in the adapter  */
  private val LIST_ELEMENTS: ArrayList<LayoutElementParcelable>? = null

  companion object {
    private var viewModel: MainFragmentViewModel? = null

    const val KEY_CURRENT_PATH = "lastpath"
    const val KEY_OPEN_MODE = "openmode"

    fun getInstance(activity: AppCompatActivity): MainFragmentViewModel? {
      if (viewModel == null) {
        viewModel = getViewModelProvider(activity).get(MainFragmentViewModel::class.java)
      }
      return viewModel
    }
  }

  fun setCurrentPath(currentPath: String) {
    this.CURRENT_PATH = currentPath;
  }

  fun getCurrentPath(): String {
    return CURRENT_PATH;
  }

  fun setOpenMode(openMode: Int) {
    this.openMode = openMode;
  }

  fun getOpenMode(): Int {
    return this.openMode;
  }
}