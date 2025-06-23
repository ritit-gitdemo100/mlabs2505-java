import { Component } from '@angular/core';

@Component({
  selector: 'app-p4-event',
  imports: [],
  template: `
    <p> p4-event works! </p>
    <button (click)="increaseCounter()">Clicked {{ count }} times</button>
  `,
  styles: ``
})
export class P4EventComponent {
  
  count = 0;

  increaseCounter() {
    this.count++;
  }

}
