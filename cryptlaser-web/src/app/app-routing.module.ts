import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', loadChildren: './global-dashboard/global-dashboard.module#GlobalDashboardModule' },
  { path: 'portfolio', loadChildren: './personal-dashboard/personal-dashboard.module#PersonalDashboardModule'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {enableTracing: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
