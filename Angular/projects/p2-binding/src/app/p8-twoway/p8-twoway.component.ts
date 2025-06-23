import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-p8-twoway',
  imports: [FormsModule],
  template: `
    <p>  p8-twoway works!  </p>

    <input [(ngModel)]="userName" placeholder="Enter your name" />
    <p>Hello, {{ userName }}!</p>

  `,
  styles: ``
})
export class P8TwowayComponent {

  userName = '';

}
