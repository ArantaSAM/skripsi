package com.example.skripsi2.Repository

import androidx.lifecycle.LiveData
import com.example.skripsi2.Interface.AdminDao
import com.example.skripsi2.Data.Basisdata.Admin

class AdminRepos(private val adminDao: AdminDao) {
    val readAllData: LiveData<List<Admin>> = adminDao.readAllData()
    suspend fun addUser(admin: Admin){
        adminDao.addAdmin(admin)
    }
}