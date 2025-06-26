import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p1-case',
  imports: [CommonModule],
  template: `
    <p>Original: {{ msg }}</p>
    <p>Upper: {{ msg | uppercase }}</p>
    <p>Lower: {{ msg | lowercase }}</p>
    <p>Title: {{ msg | titlecase }}</p>
  `,
  styles: ``
})
export class P1CaseComponent {

  msg = "Welcome to angular pipes";
}
