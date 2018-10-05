import { Currency } from './currency.interface';

export interface CurrencyMarketPrice {
    id: number;
    referenceCurrency: Currency;
    rate: number;
    date: Date;
}
