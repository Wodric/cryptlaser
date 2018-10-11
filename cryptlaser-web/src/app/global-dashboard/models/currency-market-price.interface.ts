import { Currency } from './currency.interface';

export interface CurrencyMarketPrice {
    id: number;
    currency: Currency;
    refCurrency: Currency;
    rate: number;
    date: Date;
}
