import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private isLoggedInValue = false;

  login() {
    this.isLoggedInValue = true;
  }

  logout() {
    this.isLoggedInValue = false;
  }
  
  isLoggedIn() {
    return this.isLoggedInValue;
  }

}
