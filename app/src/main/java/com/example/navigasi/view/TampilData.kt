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

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(all = dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen.padding_small))
            ) {
                items.forEach { item ->
                    Column {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 16.sp
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 22.sp
                        )
                    }
                    HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
                }
                Spacer(modifier = Modifier.height(height = 10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackBtnClick
                ) {
                    Text(text = stringResource(id = R.string.back))
                }
            }
        }
    }
}

}