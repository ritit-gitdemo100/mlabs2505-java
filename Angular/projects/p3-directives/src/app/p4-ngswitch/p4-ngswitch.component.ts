import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-p4-ngswitch',
  imports: [FormsModule, CommonModule],
  templateUrl: './p4-ngswitch.component.html',
  styles: ``
})
export class P4NgswitchComponent {

  userRole = 'guest';

}
