import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';

import { Currency } from './models/currency.interface';
import { AppConstants } from '../app-constants';

const CURRENCY_API_URL_PATH = AppConstants.getApiBaseURL + '/currencies';
const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Charset': 'UTF-8'
  })
};

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

  updateCurrency(currency: Currency): Observable<Currency> {
    return this.httpClient
        .put<Currency>(`${CURRENCY_API_URL_PATH}/${currency.id}`, currency);
}

  removeCurrency(currency: Currency): Observable<Currency> {
    return this.httpClient
        .delete<Currency>(`${CURRENCY_API_URL_PATH}/${currency.id}`);
  }

  createCurrency(currency: Currency): Observable<Currency> {
    return this.httpClient
        .post<Currency>(CURRENCY_API_URL_PATH, currency, HTTP_OPTIONS);
  }
}
