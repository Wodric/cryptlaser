import { Component, OnInit, Inject, Output, EventEmitter } from '@angular/core';
import { AppConstants } from '../../../app-constants';
import { Currency } from '../../models/currency.interface';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';
import { CurrencyService } from '../../currency.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-currency-form',
  templateUrl: './new-currency-form.component.html',
  styleUrls: ['./new-currency-form.component.css']
})
export class NewCurrencyFormComponent implements OnInit {

  public currencyType: String[];
  public form: FormGroup;

  constructor(public dialogRef: MatDialogRef<NewCurrencyFormComponent>,
    @Inject(MAT_DIALOG_DATA) public currency: Currency,
    private currencyService: CurrencyService,
    private fb: FormBuilder) {}

  ngOnInit() {
    this.currencyType = AppConstants.getCurrencyType;
    this.form = this.fb.group({
      name: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]],
      shortName: ['', [Validators.required, Validators.minLength(1), Validators.maxLength(4)]],
      type: [this.currencyType, Validators.required],
      website: ['']
    });
  }

  onSubmit() {
    this.currencyService.createCurrency(this.form.value)
        .subscribe((currencyCreated: Currency) => this.dialogRef.close(currencyCreated));
  }
}
