import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-properties',
  templateUrl: './add-properties.component.html',
  styleUrls: ['./add-properties.component.css']
})
export class AddPropertiesComponent implements OnInit {

  title = 'materialApp';   
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;


  
  constructor(private _formBuilder: FormBuilder) {}
  ngOnInit() {
     this.firstFormGroup = this._formBuilder.group({
        firstCtrl: ['', Validators.required]
     });
     this.secondFormGroup = this._formBuilder.group({
        secondCtrl: ['', Validators.required]
     });
  }
}
