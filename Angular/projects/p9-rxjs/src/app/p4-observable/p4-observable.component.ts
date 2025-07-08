import { Component } from '@angular/core';
import { of } from 'rxjs';

@Component({
  selector: 'app-p4-observable',
  imports: [],
  template: `
    <p>
      p4-observable works!
    </p>
  `,
  styles: ``
})
export class P4ObservableComponent {

  ngOnInit() {
    const numbers$ = of(10, 20, 30);

    numbers$.subscribe(
      value => console.log('Received:', value),       // next
      error => console.error('Error:', error),        // error
      () => console.log('Stream complete!')           // complete
    );

  }
}
