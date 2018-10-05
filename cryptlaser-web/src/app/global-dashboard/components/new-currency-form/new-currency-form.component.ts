import { Component, OnInit, Inject, Output, EventEmitter } from '@angular/core';
import { AppConstants } from '../../../app-constants';
import { Currency } from '../../models/currency.interface';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';
import { CurrencyService } from '../../currency.service';

@Component({
  selector: 'app-new-currency-form',
  templateUrl: './new-currency-form.component.html',
  styleUrls: ['./new-currency-form.component.css']
})
export class NewCurrencyFormComponent implements OnInit {

  currencyType: String[];

  constructor(public dialogRef: MatDialogRef<NewCurrencyFormComponent>,
    @Inject(MAT_DIALOG_DATA) public currency: Currency,
    private currencyService: CurrencyService) { }

  ngOnInit() {
    this.currencyType = AppConstants.getCurrencyType;
  }

  onSubmit(valid: boolean, value: Currency) {
    this.currencyService.createCurrency(value)
        .subscribe((currencyCreated: Currency) => this.dialogRef.close(currencyCreated));
  }
}
