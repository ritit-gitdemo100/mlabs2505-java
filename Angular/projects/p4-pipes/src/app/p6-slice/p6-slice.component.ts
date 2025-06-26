import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p6-slice',
  imports: [CommonModule],
  template: `
    <h2>Slice Pipe</h2>
    <p>Full: {{ arr }}</p>
    <p>[1:]: {{ arr | slice:1 }}</p>
    <p>[:2]: {{ arr | slice:0:2 }}</p>
    <p>[–3:–1]: {{ arr | slice:-3:-1 }}</p>
  `,
  styles: ``
})
export class P6SliceComponent {

  arr = ['A','B','C','D','E','F'];

}
