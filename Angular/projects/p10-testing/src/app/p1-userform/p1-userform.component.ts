import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-p1-userform',
  imports: [ReactiveFormsModule],
  templateUrl: './p1-userform.component.html',
  styles: ``
})
export class P1UserformComponent {

    form: FormGroup;

  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    });
  }

  submit() {
    if (this.form.valid) {
      console.log('Form Submitted', this.form.value);
    }
  }

}
