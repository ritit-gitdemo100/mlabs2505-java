import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p4-percent',
  imports: [CommonModule],
  template: `
     <h2>Percent Pipe</h2>
    <p>Original: {{ pct }}</p>
    <p>Default: {{ pct | percent }}</p>
    <p>'1.0-0': {{ pct | percent:'1.0-0' }}</p>
    <p>'1.0-2': {{ pct | percent:'1.0-2' }}</p>
    <p>'3.1-4': {{ pct | percent:'3.1-4' }}</p>
  `,
  styles: ``
})
export class P4PercentComponent {

  pct = 0.7565;

}
