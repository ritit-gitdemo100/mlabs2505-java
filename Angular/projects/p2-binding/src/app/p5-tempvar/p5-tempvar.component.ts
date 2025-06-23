import { Component } from '@angular/core';

@Component({
  selector: 'app-p5-tempvar',
  imports: [],
  template: `
    <p>  Local Template Variable </p>
    <input #nameInput placeholder="Type your name" />
    <button (click)="logName(nameInput.value)">Log Name</button>
  `,
  styles: ``
})
export class P5TempvarComponent {

  logName(value: string) {
    console.log('User typed:', value);
  }

}
