import { CommonModule } from '@angular/common';
import { Component, Input, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-p8hooks',
  imports: [CommonModule],
  template: `
    <h2>Angular Lifecycle Demo</h2>
    <p>Message: {{ message }}</p>
    <button (click)="changeMessage()">Change Message</button>
  `,
  styles: ``
})
export class P8hooksComponent {

  @Input() message: string = 'Hello Lifecycle Hooks!';

  constructor() {
    console.log('[constructor] Component instance created.');
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('[ngOnChanges] @Input property changed:', changes);
  }

  ngOnInit(): void {
    console.log('[ngOnInit] Component initialized (once).');
  }

  ngDoCheck(): void {
    console.log('[ngDoCheck] Change detection cycle triggered.');
  }

  ngAfterContentInit(): void {
    console.log('[ngAfterContentInit] Content projected into <ng-content> initialized.');
  }

  ngAfterContentChecked(): void {
    console.log('[ngAfterContentChecked] Content projection checked.');
  }

  ngAfterViewInit(): void {
    console.log('[ngAfterViewInit] Component’s view and child views initialized.');
  }

  ngAfterViewChecked(): void {
    console.log('[ngAfterViewChecked] Component’s view and child views checked.');
  }

  ngOnDestroy(): void {
    console.log('[ngOnDestroy] Component is being destroyed.');
  }

  changeMessage() {
    this.message = 'Message changed at ' + new Date().toLocaleTimeString();
    console.log('[changeMessage] Button clicked, message updated.');
  }

}
