import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LayoutModule } from '@angular/cdk/layout';

import { AppComponent } from './app.component';
import { GlobalDashboardModule } from './global-dashboard/global-dashboard.module';
import { PersonalDashboardModule } from './personal-dashboard/personal-dashboard.module';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule } from '@angular/router';
import { GlobalNavigationComponent } from './global-navigation/global-navigation.component';
import { MatListModule, MatSidenavModule, MatToolbarModule, MatIconModule } from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    GlobalNavigationComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CommonModule,
    RouterModule,
    LayoutModule,
    // custom
    GlobalDashboardModule,
    PersonalDashboardModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    // material module
    MatListModule,
    MatSidenavModule,
    MatToolbarModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
