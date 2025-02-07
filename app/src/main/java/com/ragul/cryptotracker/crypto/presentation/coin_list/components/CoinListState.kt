package com.ragul.cryptotracker.crypto.presentation.coin_list.components
import androidx.compose.runtime.Immutable
import com.ragul.cryptotracker.crypto.presentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading : Boolean = false,
    val coins : List<CoinUi> = emptyList(),
    val selectedCoin : CoinUi? = null
){

}
