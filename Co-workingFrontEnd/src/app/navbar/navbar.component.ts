import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(public modal:NgbModal) { }

  ngOnInit() {
  }
  openModal(content){
    this.modal.open(content);
    console.log(content);
  }

  openRegistrationModal(contents){
    this.modal.open(contents);
    console.log(contents);
    console.log("in registration modal");
  }
}
