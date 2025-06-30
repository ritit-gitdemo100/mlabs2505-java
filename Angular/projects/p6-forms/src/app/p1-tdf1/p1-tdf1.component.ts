import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-p1-tdf1',
  imports: [FormsModule, CommonModule],
  templateUrl: './p1-tdf1.component.html',
  styles: ``
})
export class P1Tdf1Component {

    user = {
    name: '',
    email: '',
  };

  onSubmit() {
    console.log('Form Submitted!', this.user);
  }
}
