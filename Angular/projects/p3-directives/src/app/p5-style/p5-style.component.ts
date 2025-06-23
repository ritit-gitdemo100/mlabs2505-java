import { Component } from '@angular/core';

@Component({
  selector: 'app-p5-style',
  imports: [],
  template: `
    <h1  [style.color] = " flag ? 'red' : 'green' "> Dynamic Style Single </h1>
		<button  (click)="onChangeColor()"> Change Color </button>
  `,
  styles: ``
})
export class P5StyleComponent {

  flag = true;

  onChangeColor()  {
		this.flag = !this.flag;
	}

}
