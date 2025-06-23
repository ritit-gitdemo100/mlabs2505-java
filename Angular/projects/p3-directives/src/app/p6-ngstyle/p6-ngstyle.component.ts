import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p6-ngstyle',
  imports: [CommonModule],
  template: `
    <h1  [ngStyle] = "{'color':txtColor, 'background-color':bgColor}"> Dynamic Style Multiple </h1>
		<button  (click)="onChangeColor()"> Change Color </button>
  `,
  styles: ``
})
export class P6NgstyleComponent {

  flag: boolean = false;

  txtColor = 'red';
  bgColor = 'yellow';

  onChangeColor() {
    this.flag = !this.flag;

    this.txtColor = this.flag ? 'yellow' : 'red';
    this.bgColor = this.flag ? 'red' : 'yellow';
  }

}
