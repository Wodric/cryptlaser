import { Component, OnInit } from '@angular/core';
import { Currency } from '../../models/currency.interface';
import { CurrencyService } from '../../currency.service';
import { MatDialog } from '@angular/material';
import { NewCurrencyFormComponent } from '../new-currency-form/new-currency-form.component';
import { NewCurrencyValueFormComponent } from '../new-currency-value-form/new-currency-value-form.component';


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
      this.currencies = this.currencies.concat(result);
    });
  }

  OnClickAddCurrencyValue() {
    console.log('clicked');
    const dialogRef = this.dialog.open(NewCurrencyValueFormComponent, {
      width: '425px',
      height: '450px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      console.log(result);
    });
  }
}
