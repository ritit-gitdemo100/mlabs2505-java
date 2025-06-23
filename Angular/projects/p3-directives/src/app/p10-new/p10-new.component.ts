import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-p10-new',
  imports: [CommonModule, FormsModule],
  templateUrl: './p10-new.component.html',
  styles: ``
})
export class P10NewComponent {

  selectedFruit = 'Apple';

  fruits = ['Apple', 'Banana', 'Mango'];
  
}
