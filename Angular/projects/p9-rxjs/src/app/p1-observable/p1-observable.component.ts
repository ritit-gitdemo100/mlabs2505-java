import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-p1-observable',
  imports: [],
  template: `
    <p>
      p1-observable works!
      Check console
    </p>

  `,
  styles: ``
})
export class P1ObservableComponent {
  ngOnInit() {
    const numberStream = new Observable<number>(observer => {
      observer.next(1);
      observer.next(2);
      observer.next(3);
      observer.complete();
    });

    numberStream.subscribe({
      next: val => console.log('Received:', val),
      complete: () => console.log('Stream completed')
    });
  }

}
