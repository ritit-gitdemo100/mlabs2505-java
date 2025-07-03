import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-profile',
  imports: [RouterModule],
  template: `
    <h2>My Profile</h2>
    <nav>
      <a routerLink="payment/add">Add Payment</a> |
      <a routerLink="payment/list">List Payments</a>
    </nav>
    <router-outlet></router-outlet>

  `,
  styles: ``
})
export class ProfileComponent {

}
