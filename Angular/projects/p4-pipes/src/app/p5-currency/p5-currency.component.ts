import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p5-currency',
  imports: [CommonModule],
  template: `
    <h2>Currency Pipe </h2>
    <p>Default: {{ price }}</p>
    <p>Currency: {{ price | currency }}</p>
    <p>INR (code): {{ price | currency:'INR':'code' }}</p>
    <p>USD (symbol) (1.2‑2 digits): {{ price | currency:'USD':'symbol':'1.2-2' }}</p>
  `,
  styles: ``
})
export class P5CurrencyComponent {

  price = 1234.567; 

}
