import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CustomMaterialModule } from './material/material.module';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PlansComponent } from './plans/plans.component';
import { ImageComponent } from './image/image.component';
import { MidSectionComponent } from './mid-section/mid-section.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { LocationComponent } from './location/location.component';
import { MatFormFieldModule} from '@angular/material/form-field';
import { MatDialogModule } from '@angular/material/dialog';
import { RegistrationComponent } from './registration/registration.component';
import { ClientDashboardComponent } from './client-dashboard/client-dashboard.component';
import { OwnerDashboardComponent } from './owner-dashboard/owner-dashboard.component';
import { AddPropertiesComponent } from './add-properties/add-properties.component';
import { InformationUpdateComponent } from './information-update/information-update.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { MatCardModule, MatButtonToggleModule, MatStepperModule, MatInputModule, MatButtonModule } from '@angular/material';
import { AboutUsComponent } from './about-us/about-us.component';



@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
    NavbarComponent,
    PlansComponent,
    ImageComponent,
    MidSectionComponent,
    FooterComponent,
    LoginComponent,
    LocationComponent,
    RegistrationComponent,
    ClientDashboardComponent,
    OwnerDashboardComponent,
    AddPropertiesComponent,
    InformationUpdateComponent,
    AboutUsComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    
    BrowserAnimationsModule,
    CustomMaterialModule,
    ReactiveFormsModule,
    FormsModule,

    MatCardModule,
    MatButtonToggleModule,
    MatStepperModule, 
    MatInputModule, 
    MatButtonModule,
    MatFormFieldModule,
    MatDialogModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents:[LocationComponent]
})
export class AppModule { }
