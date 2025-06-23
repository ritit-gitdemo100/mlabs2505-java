import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p2-ng-if',
  imports: [CommonModule],
  template: `
    <p>   p2-ng-if works!   </p>
    <div *ngIf="isLogin; else tempsignup">
      <h2> Login Form </h2>
      <div> New User <a (click)="signup()">Sign Up Here</a></div>
      </div>

    <ng-template #tempsignup>
      <h2> Signup Form </h2>
      <div> Registered User <a (click)="login()">Login Here</a></div>
    </ng-template>
  `,
  styles: [`
    a {   color:blue;   }
    a:hover {   text-decoration:underline; cursor:pointer;   }
 `]
})
export class P2NgIfComponent {

  isLogin:boolean = true;

  login(){
    this.isLogin = true;
  }

  signup(){
    this.isLogin = false;
  }
}
