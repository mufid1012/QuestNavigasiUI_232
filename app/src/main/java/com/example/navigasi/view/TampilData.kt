package com.example.navigasi.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    nama: String,
    jenisKelamin: String,
    alamat: String,
    onBackBtnClick: () -> Unit
) {
    // items diisi dengan parameter dari FormIsian
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = nama),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = jenisKelamin),
        Pair(first = stringResource(id = R.string.alamat), second = alamat)
    )

}