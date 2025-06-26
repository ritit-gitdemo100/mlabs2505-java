import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p7-json',
  imports: [CommonModule],
  template: `
    <h2>JSON Pipe</h2>
    <pre>{{ obj }}</pre>
    <pre>{{ obj.name }}</pre>
    <pre>{{ obj | json }}</pre>
  `,
  styles: ``
})
export class P7JsonComponent {

  obj = { name: 'Jay Patel', age: 25, skills: ['JS','Angular'], address: { city: 'BLR', zip: 560068 } };

}
