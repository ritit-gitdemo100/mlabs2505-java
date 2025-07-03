import { Component } from '@angular/core';
import { FormstateService } from '../../formstate.service';

@Component({
  selector: 'app-addpayment',
  imports: [],
  template: `
<h3>Add Payment</h3>
    <input placeholder="Amount" (input)="onInput()" />
    <button (click)="submit()">Submit</button>

  `,
  styles: ``
})
export class AddpaymentComponent {

  constructor(public formState: FormstateService) {}

  onInput() {
    this.formState.hasUnsavedChanges = true;
  }

  submit() {
    alert('Payment submitted!');
    this.formState.hasUnsavedChanges = false;
  }

}
