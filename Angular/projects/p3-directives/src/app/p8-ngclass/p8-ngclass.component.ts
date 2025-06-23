import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p8-ngclass',
  imports: [CommonModule],
  template: `
    <h1  [ngClass]="{'active': isActive, 'error': hasError}" (mouseenter)="onToggle()" (mouseleave)="onToggle()" > 
    Mouse Over to apply multiple classes Dynamically
    </h1>
  `,
  styles: [`
      .active {
        color: green;
      }
      .error {
        color: red;
        text-decoration: underline;
      }
    `]
})
export class P8NgclassComponent {

  flag: boolean = true;

  isActive = this.flag;
  hasError = !this.flag;

  onToggle() {
    this.flag = !this.flag
    this.isActive = this.flag;
    this.hasError = !this.flag;
  }
}
