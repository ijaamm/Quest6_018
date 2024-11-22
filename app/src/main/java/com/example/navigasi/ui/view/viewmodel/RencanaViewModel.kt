package com.example.navigasi.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasi.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaViewModel: ViewModel(){
    private val _MhsState = MutableStateFlow(RencanaStudi())
    val MhsStateUi: StateFlow<RencanaStudi> = _MhsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String){
        _MhsState.update { stateMK -> stateMK.copy(mataKuliah = mkPilihan) }
    }

    fun setKelas(kelasPilihan: String){
        _MhsState.update { stateKelas -> stateKelas.copy(kelas = kelasPilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>){
        _MhsState.update {status -> status.copy(
            mataKuliah = ls[0],
            kelas = ls[1]
        )}
    }
}
