import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p1-ng-if',
  imports: [CommonModule],
  template: `
    <p>   p1-ng-if works!   </p>
    <h1 *ngIf="isVisible"> Welcome to ngIf </h1>
  `,
  styles: ``
})
export class P1NgIfComponent {

  isVisible:boolean = true;
  
}
