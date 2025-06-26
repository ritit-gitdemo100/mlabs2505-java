import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p8-key-value',
  imports: [CommonModule],
  template: `
    <h2>KeyValue Pipe</h2>
    <div *ngFor="let item of data | keyvalue">
      {{item.key}}: {{item.value}}
    </div>
  `,
  styles: ``
})
export class P8KeyValueComponent {

    data = {
    id: 101,
    name: 'Laptop',
    price: 50000
  };

}
