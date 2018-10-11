import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { MatTableModule, MatPaginatorModule, MatSortModule,
   MatProgressSpinnerModule, MatIconModule, MatDialogModule,
   MatFormFieldModule, MatInputModule, MatSelectModule,
   MatOptionModule, MatCheckboxModule, MatDatepickerModule,
   MatNativeDateModule } from '@angular/material';

import { GlobalDashboardComponent } from './global-dashboard.component';
import { NewCurrencyFormComponent } from './components/new-currency-form/new-currency-form.component';
import { NewCurrencyValueFormComponent } from './components/new-currency-value-form/new-currency-value-form.component';
import { GlobalCurrencyTableComponent } from './components/global-currency-table/global-currency-table.component';

import { CurrencyService } from './currency.service';
import { CurrencyShortNameDirective } from '../directives/currency-short-name.directive';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', component: GlobalDashboardComponent }
];


@NgModule({
  imports: [
    CommonModule,
    ReactiveFormsModule,
    RouterModule.forChild(routes),
    // material
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatProgressSpinnerModule,
    MatIconModule,
    MatDialogModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatOptionModule,
    MatCheckboxModule,
    MatDatepickerModule,
    MatNativeDateModule
  ],
  declarations: [
    GlobalDashboardComponent,
    NewCurrencyFormComponent,
    NewCurrencyValueFormComponent,
    GlobalCurrencyTableComponent,
    CurrencyShortNameDirective
  ],
  providers: [
    CurrencyService
  ],
  exports: [
    GlobalDashboardComponent,
    RouterModule
  ],
  entryComponents: [
    NewCurrencyFormComponent,
    NewCurrencyValueFormComponent
  ]
})
export class GlobalDashboardModule { }
