import { Component } from '@angular/core';

@Component({
  selector: 'app-p2-interpolation',
  imports: [],
  templateUrl: './p2-interpolation.component.html',
  styles: ``
})
export class P2InterpolationComponent {

  title = 'Angular Interpolation Demo';
  
  userName = 'John Doe';
  
  age = 25;
  
  skills = ['Angular', 'TypeScript', 'HTML'];
  
  user = {
    firstName: 'John',
    lastName: 'Doe',
    email: 'john@example.com'
  };

  getFullName(): string {
    return `${this.user.firstName} ${this.user.lastName}`;
  }

  getCurrentYear(): number {
    return new Date().getFullYear();
  }

  rawHtml = '<b>This is bold text</b>';

}
