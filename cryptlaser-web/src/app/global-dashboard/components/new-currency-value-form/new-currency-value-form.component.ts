import { Component, OnInit, Inject } from '@angular/core';
import { Currency } from '../../models/currency.interface';
import { CurrencyService } from '../../currency.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef, MatCheckboxChange } from '@angular/material';
import { CurrencyMarketPrice } from '../../models/currency-market-price.interface';

@Component({
  selector: 'app-new-currency-value-form',
  templateUrl: './new-currency-value-form.component.html',
  styleUrls: ['./new-currency-value-form.component.css']
})
export class NewCurrencyValueFormComponent implements OnInit {

  public currencies: Currency[];
  public refCurrencies: Currency[];
  public form: FormGroup;

  constructor(public dialogRef: MatDialogRef<NewCurrencyValueFormComponent>,
    @Inject(MAT_DIALOG_DATA) public currencyMarketPrice: CurrencyMarketPrice,
    private currencyService: CurrencyService,
    private fb: FormBuilder) { }

  ngOnInit() {
    this.currencyService
        .getAllCurrencies().subscribe(data => {
          this.currencies = data;
          this.refCurrencies = data;
          this.initForm();
      });
  }

  onSubmit() {
    this.currencyService.createCurrencyMarketPrice(this.form.value)
        .subscribe((currencyCreated: CurrencyMarketPrice) => this.dialogRef.close(currencyCreated));
  }

  private initForm(): void {
    this.form = this.fb.group({
      currency: [this.currencies, Validators.required],
      refCurrency: [this.currencies, Validators.required],
      rate: ['', Validators.required],
      isNow: [''],
      date: ['']
    });
  }

  onChange(event: MatCheckboxChange) {
    if (event.checked) {
      this.form.get('date').disable();
    } else {
      this.form.get('date').enable();
    }

    console.log(event);
  }

}
