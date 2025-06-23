import { Component } from '@angular/core';

@Component({
  selector: 'app-p7-style',
  imports: [],
  template: `
    <p>  p7-style works!   </p>

    <p [style.color]="isError ? 'red' : 'blue'">
      This text changes color dynamically.
    </p>
    <button (click)="toggleError()">Toggle Error</button>

  `,
  styles: ``
})
export class P7StyleComponent {

  isError = false;

  toggleError() {
    this.isError = !this.isError;
  }

}
