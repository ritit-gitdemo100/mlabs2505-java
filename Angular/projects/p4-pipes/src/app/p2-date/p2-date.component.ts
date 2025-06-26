import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p2-date',
  imports: [CommonModule],
  template: `
   <h2>Date Pipe – All Formats</h2>
    <p>Original: {{ today }}</p>
    <p>short: {{ today | date:'short' }}</p>
    <p>shortDate: {{ today | date:'shortDate' }}</p>
    <p>shortTime: {{ today | date:'shortTime' }}</p>
    <p>medium: {{ today | date:'medium' }}</p>
    <p>mediumDate: {{ today | date:'mediumDate' }}</p>
    <p>mediumTime: {{ today | date:'mediumTime' }}</p>
    <p>long: {{ today | date:'long' }}</p>
    <p>longDate: {{ today | date:'longDate' }}</p>
    <p>longTime: {{ today | date:'longTime' }}</p>
    <p>full: {{ today | date:'full' }}</p>
    <p>fullDate: {{ today | date:'fullDate' }}</p>
    <p>fullTime: {{ today | date:'fullTime' }}</p>
    <p>Custom: {{ today | date:'yyyy-MM-dd HH:mm:ss Z' }}</p>
  `,
  styles: ``
})
export class P2DateComponent {

  today = new Date();

}
