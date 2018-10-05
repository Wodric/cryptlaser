import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatTableModule, MatPaginatorModule, MatSortModule,
   MatProgressSpinnerModule, MatIconModule, MatDialogModule} from '@angular/material';

import { GlobalDashboardComponent } from './components/global-dashboard/global-dashboard.component';
import { NewCurrencyFormComponent } from './components/new-currency-form/new-currency-form.component';
import { NewCurrencyValueFormComponent } from './components/new-currency-value-form/new-currency-value-form.component';
import { GlobalCurrencyTableComponent } from './components/global-currency-table/global-currency-table.component';

import { CurrencyService } from './currency.service';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatProgressSpinnerModule,
    MatIconModule,
    MatDialogModule
  ],
  declarations: [
    GlobalDashboardComponent,
    NewCurrencyFormComponent,
    NewCurrencyValueFormComponent,
    GlobalCurrencyTableComponent
  ],
  providers: [
    CurrencyService
  ],
  exports: [
    GlobalDashboardComponent
  ],
  entryComponents: [
    NewCurrencyFormComponent,
    NewCurrencyValueFormComponent
  ]
})
export class GlobalDashboardModule { }
