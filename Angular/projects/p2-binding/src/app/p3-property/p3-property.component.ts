import { Component } from '@angular/core';

@Component({
  selector: 'app-p3-property',
  imports: [],
  template: `
    <hr>
      p3-property works! <br>
      <img [src]="logoUrl" alt="Logo" width="100" />
      <button [disabled]="isButtonDisabled">submit</button>
  `,
  styles: ``
})
export class P3PropertyComponent {
  logoUrl = 'https://angular.io/assets/images/logos/angular/angular.svg';
  isButtonDisabled = true;

}
