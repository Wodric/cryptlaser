import { Component, OnInit } from '@angular/core';
import { Currency } from './models/currency.interface';
import { CurrencyService } from './currency.service';
import { MatDialog } from '@angular/material';
import { NewCurrencyFormComponent } from './components/new-currency-form/new-currency-form.component';
import { NewCurrencyValueFormComponent } from './components/new-currency-value-form/new-currency-value-form.component';


@Component({
  selector: 'app-global-dashboard',
  templateUrl: './global-dashboard.component.html',
  styleUrls: ['./global-dashboard.component.css']
})
export class GlobalDashboardComponent implements OnInit {

  currencies: Currency[];
  constructor(private currencyService: CurrencyService, public dialog: MatDialog) {}

  ngOnInit() {
    this.currencyService
        .getAllCurrencies().subscribe(data => this.currencies = data);
  }

  OnClickAddCurrency() {
    const dialogRef = this.dialog.open(NewCurrencyFormComponent, {
      width: '425px',
      height: '450px',
      data: {}
    });

    dialogRef.afterClosed().subscribe((result: Currency) => {
      // check if user just close the creation windows without validation
      if (result !== undefined && result.name !== undefined) {
        this.currencies = this.currencies.concat(result);
      }
    });
  }

  OnClickAddCurrencyValue() {
    const dialogRef = this.dialog.open(NewCurrencyValueFormComponent, {
      width: '425px',
      height: '450px',
    });

    dialogRef.afterClosed().subscribe(result => {
    });
  }
}
