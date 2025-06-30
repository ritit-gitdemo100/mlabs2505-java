import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-p3-tdf2',
  imports: [FormsModule, CommonModule],
  templateUrl: './p3-tdf2.component.html',
  styles: [`
    .error small {
      color: red;
    }
    input.invalid {
      border-color: red;
    }
    `]
})
export class P3Tdf2Component {

  user = {
    name: '',
    email: '',
    password: '',
    confirmPassword: '',
    age: null,
  };

  passwordsMatch(): boolean {
    return this.user.password === this.user.confirmPassword;
  }

  onSubmit() {
    if (this.passwordsMatch()) {
      console.log('Registration successful', this.user);
      alert('Registration successful!');
    } else {
      alert('Please fix errors before submitting.');
    }
  }

}
