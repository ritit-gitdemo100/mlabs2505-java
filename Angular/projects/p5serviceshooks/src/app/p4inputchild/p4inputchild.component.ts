import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-p4inputchild',
  imports: [],
  template: `
    <h3>Child Component</h3>
    <p>Message from parent: {{ message }}</p>
  `,
  styles: ``
})
export class P4inputchildComponent {

  @Input() message: string = '';
  
}
