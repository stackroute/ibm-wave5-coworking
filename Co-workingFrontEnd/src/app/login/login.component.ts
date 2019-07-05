import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private modelService:NgbModal) { }

  ngOnInit() {
  }
    openModal(content:String){
    this.modelService.open(content);
      console.log(content);
    }
}
