import { Component, OnInit } from '@angular/core';
import { CardService } from '../card.service';
import { LocationService } from '../location.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-spaces',
  templateUrl: './spaces.component.html',
  styleUrls: ['./spaces.component.css']
})
export class SpacesComponent implements OnInit {

  constructor(private cardService: CardService,private locationService:LocationService,private router:Router) { }
  arrayOfSpace: any = [];
  arrayOfSpace1: any = [];
  arrayOfCategory: any = [];

  loc:String;
  ngOnInit() {
    console.log(this.locationService.location);
    this.loc=this.locationService.location;
    this.locationService.getSpaceByLocation(this.loc).subscribe(data=>{
      this.arrayOfSpace=data;
      console.log(this.arrayOfSpace);
    });


  }
  click(spaceName){
    
    sessionStorage.setItem("spaceName",spaceName);
    console.log(this.arrayOfSpace);
    console.log("***************")
     console.log(spaceName);
    this.router.navigateByUrl("details/"+spaceName);
 }
 

}
