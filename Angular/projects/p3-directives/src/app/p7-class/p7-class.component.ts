import { Component } from '@angular/core';

@Component({
  selector: 'app-p7-class',
  imports: [],
  template: `
    <h1  [class.active] = "isActive" (mouseenter)="onToggle()" (mouseleave)="onToggle()" > 
    Mouse Over to apply class Dynamically
    </h1>
  `,
  styles: [`
        .active{ 
          text-align:center;
          color:blue;
          background-color:yellow;
        }
    `]
})
export class P7ClassComponent {
  isActive: boolean = false;

  onToggle() {
    this.isActive = !this.isActive;
  }
}
