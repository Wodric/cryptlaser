import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PersonalDashboardComponent } from './personal-dashboard.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', component: PersonalDashboardComponent }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ],
  declarations: [PersonalDashboardComponent],
  exports: [RouterModule]
})
export class PersonalDashboardModule { }
