import { Component, OnInit } from '@angular/core';
import { Currency } from '../../models/currency.interface';
import { CurrencyService } from '../../currency.service';

@Component({
  selector: 'app-new-currency-value-form',
  templateUrl: './new-currency-value-form.component.html',
  styleUrls: ['./new-currency-value-form.component.css']
})
export class NewCurrencyValueFormComponent implements OnInit {

  currencies: Currency[];
  constructor(private currencyService: CurrencyService) { }

  ngOnInit() {
    this.currencyService
        .getAllCurrencies().subscribe(data => this.currencies = data);
  }

}
