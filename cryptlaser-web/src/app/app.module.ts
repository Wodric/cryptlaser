import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule, MatButtonModule, MatSidenavModule,
  MatIconModule, MatListModule, MatProgressSpinnerModule,
  MatFormFieldModule, MatInputModule } from '@angular/material';

import { AppComponent } from './app.component';
import { GlobalDashboardModule } from './global-dashboard/global-dashboard.module';
import { GlobalNavigationComponent } from './global-navigation/global-navigation.component';


@NgModule({
  declarations: [
    AppComponent,
    GlobalNavigationComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CommonModule,
    // custom
    GlobalDashboardModule,
    BrowserAnimationsModule,
    LayoutModule,
    // materials
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatProgressSpinnerModule,
    MatFormFieldModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
