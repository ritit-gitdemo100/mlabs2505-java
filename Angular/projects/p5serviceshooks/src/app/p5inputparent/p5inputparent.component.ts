import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { P4inputchildComponent } from '../p4inputchild/p4inputchild.component';

@Component({
  selector: 'app-p5inputparent',
  imports: [FormsModule, P4inputchildComponent],
  template: `
    <h2>Parent Component</h2>
    <input [(ngModel)]="parentMessage" placeholder="Type a message" />
    <app-p4inputchild [message]="parentMessage"></app-p4inputchild>
  `,
  styles: ``
})
export class P5inputparentComponent {

  parentMessage = 'Angular';

}
