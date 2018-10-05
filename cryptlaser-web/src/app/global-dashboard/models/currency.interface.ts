import { CurrencyMarketPrice } from './currency-market-price.interface';

export interface Currency {
    id: number;
    shortName: string;
    name: string;
    numberOnMarket: number;
    type: string;
    website: string;
    lastValueList: CurrencyMarketPrice[];
}
