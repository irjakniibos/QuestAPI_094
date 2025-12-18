package com.example.questapi_094.repositori

import okhttp3.logging.HttpLoggingInterceptor

interface ContainerApp{
    val repositoryDataSiswa : RepositoryDataSiswa
}

class DefaultContainerApp : ContainerApp{
    private val baseurl = "http://10.0.2.2/tiumy/"

    val logging = HttpLoggingInterceptor().apply{
        level = HttpLoggingInterceptor.Level.BODY
    }
}