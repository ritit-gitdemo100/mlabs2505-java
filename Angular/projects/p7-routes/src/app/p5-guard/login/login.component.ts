import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [],
  template: `
    <h2>Login</h2>
    <button (click)="login()">Login</button>
  `,
  styles: ``
})
export class LoginComponent {
  
  constructor(private auth: AuthService, private router: Router) { }

  login() {
    this.auth.login();
    this.router.navigate(['admin/profile']);
  }

}
