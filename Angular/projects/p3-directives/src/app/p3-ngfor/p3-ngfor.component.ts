import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-p3-ngfor',
  imports: [FormsModule, CommonModule],
  templateUrl: './p3-ngfor.component.html',
  styles: ``
})
export class P3NgforComponent {

  users = [
    { name: 'Alice' },
    { name: 'Bob' },
    { name: 'Charlie' }
  ];

  isChecked:boolean = false;

}
