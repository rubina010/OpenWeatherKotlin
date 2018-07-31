package com.example.rubinathapa.openweatherkotlin.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class RxModule
{
    @Provides
fun provideCompositeDisposable() = CompositeDisposable()
}