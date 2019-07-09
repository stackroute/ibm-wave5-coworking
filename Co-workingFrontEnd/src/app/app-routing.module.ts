import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlansComponent } from './plans/plans.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { ClientDashboardComponent } from './client-dashboard/client-dashboard.component';
import { OwnerDashboardComponent } from './owner-dashboard/owner-dashboard.component';
import { InformationUpdateComponent} from './information-update/information-update.component'
import { AddPropertiesComponent } from './add-properties/add-properties.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { CardComponent } from './card/card.component';
import { BookingComponent } from './booking/booking.component';
import { ClientProfileComponent } from './client-profile/client-profile.component';
const routes: Routes = [
  {path:'',component:LandingPageComponent},
  {path:'Plans',component:PlansComponent},
  // {path:'location',component:LocationComponent}
  {path:'login',component:LoginComponent},
  {path:'register',component:RegistrationComponent},
  {path:'client-login',component:ClientProfileComponent},
  {path:'owner-login',component:OwnerDashboardComponent},
  // {path:'edit',component:InformationUpdateComponent},
  {path:'add-property',component:AddPropertiesComponent},
  {path:'about',component:AboutUsComponent},
  {path: 'card', component: CardComponent},
  {path: 'details', component:BookingComponent},
  {path: 'client-dashboard',component:ClientDashboardComponent}

];

@NgModule({
  
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
