import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, AbstractControl, ValidationErrors, ValidatorFn, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-p4-rcf2',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './p4-rcf2.component.html',
  styles: [`
    .error small {
      color: red;
    }

    input.ng-invalid.ng-touched {
      border-color: red;
    }
    `]
})
export class P4Rcf2Component {

   userForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.userForm = this.fb.group(
      {
        name: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(30)]],
        email: ['', [Validators.required, Validators.email]],
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', [Validators.required]],
        age: ['', [Validators.required, Validators.min(18), Validators.max(65)]],
      },
      {
        validators: this.passwordsMatchValidator('password', 'confirmPassword'),
      }
    );
  }

  // Custom Validator to check if password and confirmPassword match
  passwordsMatchValidator(passwordKey: string, confirmPasswordKey: string): ValidatorFn {
    return (group: AbstractControl): ValidationErrors | null => {
      const password = group.get(passwordKey)?.value;
      const confirmPassword = group.get(confirmPasswordKey)?.value;
      if (password !== confirmPassword) {
        return { passwordsMismatch: true };
      }
      return null;
    };
  }

  // Helper getters to access form controls easily in template
  get name() {
    return this.userForm.get('name')!;
  }
  get email() {
    return this.userForm.get('email')!;
  }
  get password() {
    return this.userForm.get('password')!;
  }
  get confirmPassword() {
    return this.userForm.get('confirmPassword')!;
  }
  get age() {
    return this.userForm.get('age')!;
  }

  onSubmit() {
    if (this.userForm.valid) {
      console.log('Registration successful', this.userForm.value);
      alert('Registration successful!');
      this.userForm.reset();
    } else {
      this.userForm.markAllAsTouched(); // show validation errors
      alert('Please fix errors before submitting.');
    }
  }

}
