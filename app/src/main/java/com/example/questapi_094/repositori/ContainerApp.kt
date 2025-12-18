package com.example.questapi_094.repositori

import okhttp3.logging.HttpLoggingInterceptor

interface ContainerApp{
    val repositoryDataSiswa : RepositoryDataSiswa
}

class DefaultContainerApp : ContainerApp{
    private val baseurl = ""

    val logging = HttpLoggingInterceptor().apply{
        level = HttpLoggingInterceptor.Level.BODY
    }
}