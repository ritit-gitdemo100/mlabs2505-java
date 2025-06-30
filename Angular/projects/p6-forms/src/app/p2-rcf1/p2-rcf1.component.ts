import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import {FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-p2-rcf1',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './p2-rcf1.component.html',
  styles: ``
})
export class P2Rcf1Component {

    userForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.userForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
    });
  }

  onSubmit() {
    if (this.userForm.valid) {
      console.log('Form Submitted', this.userForm.value);
    } else {
      console.log('Form Invalid');
    }
  }
  
}
