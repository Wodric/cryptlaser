import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CurrencyService } from './currency.service';
import { GlobalDashboardComponent } from './components/global-dashboard/global-dashboard.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [GlobalDashboardComponent],
  providers: [
    CurrencyService
  ],
  exports: [
    GlobalDashboardComponent
  ]
})
export class GlobalDashboardModule { }
