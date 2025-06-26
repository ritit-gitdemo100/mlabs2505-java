import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-p6outputchild',
  imports: [],
  template: `
    <h3>Child Component</h3>
    <button (click)="sendMessage()">Send Message to Parent</button>
  `,
  styles: ``
})
export class P6outputchildComponent {

  @Output() messageEvent = new EventEmitter<string>();

  sendMessage() {
    this.messageEvent.emit('Hello from Child!');
  }
}
