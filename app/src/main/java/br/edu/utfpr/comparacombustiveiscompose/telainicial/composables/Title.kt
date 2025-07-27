package br.edu.utfpr.comparacombustiveiscompose.telainicial.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.edu.utfpr.comparacombustiveiscompose.R

@Composable
fun TextTitle(){
    Text(text = stringResource(R.string.title))
}

@Preview
@Composable
fun TextTitlePreview(){
    TextTitle()
}