import { Component } from '@angular/core';
import { interval, filter, take } from 'rxjs';

@Component({
  selector: 'app-p7-rxjs',
  imports: [],
  template: `
    <p>
      p7-rxjs works!
    </p>
  `,
  styles: ``
})
export class P7RxjsComponent {

  ngOnInit() {

    // Emits numbers: 0, 1, 2, 3, 4, 5, ...
    const source$ = interval(1000).pipe(
      filter(num => num % 2 === 0),  
      take(3)                         // Take only the first 3 even numbers
    );

    source$.subscribe({
      next: val => console.log('Received even:', val),
      complete: () => console.log('Completed after 3 even numbers!')
    });

  }
}
