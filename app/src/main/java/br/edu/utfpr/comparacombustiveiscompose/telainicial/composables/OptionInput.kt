package br.edu.utfpr.comparacombustiveiscompose.telainicial.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OptionInput(
    modifier: Modifier = Modifier,
    optionName: String,
    onValueChange: (Double?) -> Unit
) {
    var inputValue by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    Row (modifier = Modifier) {
        Text(text = "Option $optionName")
        TextField(
            onValueChange = { newValue: String ->
                inputValue = newValue
                if (newValue.isEmpty()) {
                    isError = false
                    onValueChange(null)
                } else {
                    try {
                        val parsedValue = newValue.toDouble()
                        isError = false
                        onValueChange(parsedValue)
                    } catch (e: NumberFormatException) {
                        isError = true
                        onValueChange(null)
                    }
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            isError = isError,
            singleLine = true,
            value = inputValue
        )
    }
}

@Preview
@Composable

