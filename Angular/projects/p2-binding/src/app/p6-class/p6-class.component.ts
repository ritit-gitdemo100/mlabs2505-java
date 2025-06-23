import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-p6-class',
  imports: [CommonModule],
  templateUrl: './p6-class.component.html',
  styleUrl: './p6-class.component.css'
})
export class P6ClassComponent {

  isActive = false;
  hasError = false;

  toggleActive() {
    this.isActive = !this.isActive;
  }

  toggleError() {
    this.hasError = !this.hasError;
  }

}
