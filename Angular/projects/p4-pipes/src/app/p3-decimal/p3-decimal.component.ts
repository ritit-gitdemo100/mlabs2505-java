import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p3-decimal',
  imports: [CommonModule],
  template: `
    <h2>Number Pipe</h2>
    <p>Original: {{ num }}</p>
    <p>'1.0-0': {{ num | number:'1.0-0' }}</p>
    <p>'1.0-3': {{ num | number:'1.0-3' }}</p>
    <p>'1.2-2': {{ num | number:'1.2-2' }}</p>
    <p>'3.1-4': {{ num | number:'3.1-4' }}</p>
    <p>'5.2-5': {{ num | number:'5.2-5' }}</p>
  `,
  styles: ``
})
export class P3DecimalComponent {

  num = 1234.56789;
  
}
