import { Component, OnInit } from '@angular/core';
import { Currency } from '../../models/currency.interface';
import { CurrencyService } from '../../currency.service';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-new-currency-value-form',
  templateUrl: './new-currency-value-form.component.html',
  styleUrls: ['./new-currency-value-form.component.css']
})
export class NewCurrencyValueFormComponent implements OnInit {

  currencies: Currency[];
  constructor(private currencyService: CurrencyService) { }
  public form: FormGroup;

  ngOnInit() {
    this.currencyService
        .getAllCurrencies().subscribe(data => this.currencies = data);
  }

  onSubmit() {

  }

}
