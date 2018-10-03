import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { Currency } from './models/currency.interface';
import { AppConstants } from '../app-constants';

const CURRENCY_API_URL_PATH = AppConstants.getApiBaseURL + '/currencies';

@Injectable({
  providedIn: 'root'
})
export class CurrencyService {
  constructor( private httpClient: HttpClient) {}

  getAllCurrencies(): Observable<Currency[]> {
    return this.httpClient
          .get<Currency[]>(CURRENCY_API_URL_PATH);
  }

  getCurrency(id: number): Observable<Currency> {
    return this.httpClient
          .get<Currency>(`${CURRENCY_API_URL_PATH}/${id}`);
  }

  updatePassengers(currency: Currency): Observable<Currency> {
    return this.httpClient
        .put<Currency>(`${CURRENCY_API_URL_PATH}/${currency.id}`, currency);
}

  removePassengers(currency: Currency): Observable<Currency> {
    return this.httpClient
        .delete<Currency>(`${CURRENCY_API_URL_PATH}/${currency.id}`);
  }
}
