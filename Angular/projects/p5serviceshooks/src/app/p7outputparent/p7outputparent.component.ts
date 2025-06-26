import { Component } from '@angular/core';
import { P6outputchildComponent } from '../p6outputchild/p6outputchild.component';

@Component({
  selector: 'app-p7outputparent',
  imports: [P6outputchildComponent],
  template: `
    <h2>Parent Component</h2>
    <p>Message received from child: {{ childMessage }}</p>
    <app-p6outputchild (messageEvent)="receiveMessage($event)"></app-p6outputchild>
  `,
  styles: ``
})
export class P7outputparentComponent {

  childMessage = '';

  receiveMessage(msg: string) {
    this.childMessage = msg;
  }

}
