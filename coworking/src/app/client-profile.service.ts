import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClientProfileService {

  constructor(private httpClient:HttpClient) { }

  getClientData(address):any{
    return this.httpClient.get(`http://13.235.110.75:8006/v1/api/space/location/${address}`);
  }


  getClientDataBasedOnPrice():any{
    return this.httpClient.get(`http://13.235.110.75:8006/v1/api/contains/priceRecommendation`)

  }

  getClientDataBasedOnLocation():any{
    return this.httpClient.get('http://13.235.110.75:8006/v1/api/located/recommendationLoc')
  }
}
