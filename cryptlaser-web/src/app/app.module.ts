import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

import { AppComponent } from './app.component';
import { GlobalDashboardModule } from './global-dashboard/global-dashboard.module';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CommonModule,
    // custom
    GlobalDashboardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
