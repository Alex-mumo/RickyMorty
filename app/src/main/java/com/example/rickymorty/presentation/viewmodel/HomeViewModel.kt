package com.example.rickymorty.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.rickymorty.domain.usescases.GetCharacterUseCase

class HomeViewModel constructor(private val characterUseCase: GetCharacterUseCase) : ViewModel()
