package com.example.navigasi.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi.ui.view.screen.DetailView
import com.example.navigasi.ui.view.screen.MahasiswaFormView
import com.example.navigasi.ui.view.screen.RencanaStudyView
import com.example.navigasi.ui.view.screen.Splashview
import com.example.navigasi.ui.view.viewmodel.MahasiswaViewModel
import com.example.navigasi.ui.view.viewmodel.RencanaViewModel

enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaViewModel.dataModel.collectAsState().value
    val krsUiState = krsViewModel.MhsStateUi.collectAsState().value


    }