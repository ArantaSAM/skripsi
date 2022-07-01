package com.example.skripsi2.Model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.skripsi2.Repository.AdminRepos
import com.example.skripsi2.Data.Basisdata.Admin
import com.example.skripsi2.SPDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AdminViewModel(application: Application): AndroidViewModel(application) {
    private val readAllData: LiveData<List<Admin>>
    private val repository: AdminRepos

    init {
        val userDao = SPDatabase.getDatabase(application).adminDao()
        repository = AdminRepos(userDao)
        readAllData = repository.readAllData
    }

    fun addAdmin(admin: Admin){
        viewModelScope.launch (Dispatchers.IO){
            repository.addUser(admin)
        }
    }
}