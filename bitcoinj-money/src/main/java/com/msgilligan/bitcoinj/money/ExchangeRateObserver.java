package com.msgilligan.bitcoinj.money;

import org.knowm.xchange.dto.marketdata.Ticker;

/**
 *
 */
public interface ExchangeRateObserver {
    void onExchangeRateChange(ExchangeRateChange change);
}
