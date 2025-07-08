import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-p3-observable',
  imports: [],
  template: `
    <p>
      Check Console
    </p>
  `,
  styles: ``
})
export class P3ObservableComponent {

  ngOnInit() {
    const myObservable = new Observable<number>(observer => {
      observer.next(1);
      observer.next(2);
      observer.error('Something went wrong!');
      observer.next(3); // Will NOT be called
      observer.complete(); // Will NOT be called
    });

    myObservable.subscribe({
      next: (value) => console.log('Value:', value),
      error: (err) => console.error('Error:', err),
      complete: () => console.log('Completed!')
    });
  }

}
