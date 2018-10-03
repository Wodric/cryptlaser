import { Component, OnInit } from '@angular/core';
import { Currency } from '../../models/currency.interface';
import { CurrencyService } from '../../currency.service';

@Component({
  selector: 'app-global-dashboard',
  templateUrl: './global-dashboard.component.html',
  styleUrls: ['./global-dashboard.component.css']
})
export class GlobalDashboardComponent implements OnInit {

  currencies: Currency[];
  constructor(private currencyService: CurrencyService) { }

  ngOnInit() {
    this.currencyService
        .getAllCurrencies().subscribe(data => this.currencies = data);
  }

}
